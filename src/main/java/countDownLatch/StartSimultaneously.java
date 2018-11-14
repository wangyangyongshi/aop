package countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wangyang on 2018/11/14.
 */
public class StartSimultaneously {
    private CountDownLatch startGate ;
    private CountDownLatch endGate ;

    private int count;

    public StartSimultaneously(int count)
    {
        this.count = count;
        this.startGate = new CountDownLatch(1);
        this.endGate = new CountDownLatch(count);
    }

    private class racingThread extends Thread
    {
        public void run()
        {
            try {
                startGate.await();
                System.out.println("Thread "+currentThread().getId()+ " start's time is :" + System.currentTimeMillis());
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally
            {
                endGate.countDown();
                System.out.println("Thread "+currentThread().getId()+ " end's time is :" + System.currentTimeMillis());
            }
        }
    }

    public void start() throws InterruptedException
    {
        for(int i = 0; i < count; i++)
        {
            new racingThread().start();
        }

        System.out.println("Thread "+Thread.currentThread().getId()+ " start's time is :" + System.currentTimeMillis());
        startGate.countDown();
        endGate.await();
        System.out.println("Thread "+Thread.currentThread().getId()+ " end's time is :" + System.currentTimeMillis());
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            new StartSimultaneously(10).start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
