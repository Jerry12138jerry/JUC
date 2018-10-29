package com.jerry.juc.tools;

/**
 * @author Jerry
 * @date 2018/10/26
 * 描述：线程交互器
 * 线程之间交互数据，且在并发时候使用，
 * 两两交换，交换中不会因为线程多而混乱，
 * 发送出去没接收到会一直等，由交互器完成交互过程。
 */
public class Exchanger {

    private static java.util.concurrent.Exchanger exchanger = new java.util.concurrent.Exchanger();
}
