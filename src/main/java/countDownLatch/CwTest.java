package countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wangyang on 2018/11/14.
 */
public class CwTest {


//    public static void main(String[] args) {
//        //创建一个线程池
//        final CountDownLatch countDownLatch = new CountDownLatch(1);
//
//        CookThread cookThread = new CookThread();
//        Thread thd = new Thread(cookThread, "wangyangxiancheng");
//
//        Thread waterThread = new WaterThread();
//        waterThread.setName("hunhexiancheng");
//
//        thd.start();
//        countDownLatch.countDown();
//
//        try {
//            countDownLatch.await();//线程池中线程数为0，才会执行主线程
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        waterThread.start();
//        countDownLatch.countDown();
//
//
//    }

    public static void main(String[] args) throws Exception {
        final CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("哈哈---》" + i);
                }
                countDownLatch.countDown(); //计数器减一


            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("嘿嘿---》" + i);
                }

                countDownLatch.countDown();//计数器减一
            }
        }).start();
        countDownLatch.await();  //如果计数器不为0 那么就阻塞主线程，如果计数器为0,那么主线程继续执行

        System.out.println("罗鑫是");


    }
}
