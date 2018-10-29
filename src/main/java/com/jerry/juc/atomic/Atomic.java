package com.jerry.juc.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Jerry
 * @date 2018/10/26
 * 描述：
 */
public class Atomic {

    public static void main(String[] args) {
        System.out.println("start");
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndAdd(1);
        int a = atomicInteger.getAndAdd(2);
        System.out.println(a);
        System.out.println(atomicInteger.get());
        AtomicReference  reference = new AtomicReference();
        User user = new User("镇关西",20);
        reference.set(user);
        reference.compareAndSet(user,new User("鲁智深",18));
        System.out.println(reference.get().getClass());
    }

    static class User{

        private String name;

        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
