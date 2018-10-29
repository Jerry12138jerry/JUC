package com.jerry.juc.tools;

import java.util.concurrent.ExecutorService;

/**
 * @author Jerry
 * @date 2018/10/26
 * 描述：执行器，实际就是创建线程池的
 */
public class Executors {

     public Executors(){

         java.util.concurrent.Executors.newCachedThreadPool();
     }

}
