package com.xiazhi.singleton;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author 赵帅
 * @date 2020/7/7
 */
public class Client {

    @Test
    public void aa() {
        Leader instance = Leader.getInstance();
    }

    @Test
    public void thread() {

        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Leader.getInstance() = " + Leader.getInstance4());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }).start();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Leader.getInstance() = " + Leader.getInstance4());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
