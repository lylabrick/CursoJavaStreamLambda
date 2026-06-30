package com.cursojavaadvanced.runnableexample;

import java.util.ArrayList;
import java.util.List;

public class ExampleRunnable {

    public static void main(String[] strings) {
        Runnable tarea = () -> System.out.println("ejecutando en thread: " + Thread.currentThread().getName());

        List<Thread> t = new ArrayList<>();
        Thread t0 = new Thread(tarea);
        Thread t1 = new Thread(tarea);
        Thread t2 = new Thread(tarea);
        Thread t3 = new Thread(tarea);
        Thread t4 = new Thread(tarea);
        Thread t5 = new Thread(tarea);
        Thread t6 = new Thread(tarea);
        Thread t7 = new Thread(tarea);
        t.add(t0);
        t.add(t1);
        t.add(t2);
        t.add(t3);
        t.add(t4);
        t.add(t5);
        t.add(t6);
        t.add(t7);
        for (Thread thread : t) {
            thread.start();
        }
    }
}
