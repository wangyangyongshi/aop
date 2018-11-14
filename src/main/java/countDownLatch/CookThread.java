package countDownLatch;

/**
 * Created by wangyang on 2018/11/14.
 */
public class CookThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"=================cook");
    }
}
