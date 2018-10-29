package com.jerry.juc.tools;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author Jerry
 * @date 2018/10/26
 * 描述：信号量,根据一些阈值进行访问控制
 */
public class Semaphor {

    //模拟一个使用信号量对访问进行控制

    private static final Semaphore semaphore = new Semaphore(10);

    private static final Random random = new Random();

    public static void main(String []args){

        for (int i=0;i<100;i++){
            final int num = i;
            new Thread(() -> {
                    Boolean acquired = false;
                    try{
                        semaphore.acquire();
                        System.out.println("我是线程"+num+"我获取了执行权限");
                        acquired = true;
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        if (acquired){
                            semaphore.release();
                        }
                    }
            });
        }
    }
}
