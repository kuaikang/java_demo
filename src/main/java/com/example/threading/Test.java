package com.example.threading;


public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			/* 第一种方式：继承Thread类*/
			MyThread_extends t = new MyThread_extends("t"+i);
			t.start();
			MyThread_extends t1 = new MyThread_extends("t"+i+1);
			t1.run();
//			run方法中只是定义需要执行的任务，如果调用run方法，即相当于在主线程中执行run方法，跟普通的方法调用没有任何区别，此时并不会创建一个新的线程来执行定义的任务。
			
			/* 第二种方式：实现Runnable接口*/
//			MyThread_impl runnable = new MyThread_impl("t"+i);
//			Thread thread = new Thread(runnable);
//	        thread.start();
		}
		
//		新线程创建的过程不会阻塞主线程的后续执行。所以下面的语句并不是上面线程都结束以后才执行
		System.out.println("main thread id : " + Thread.currentThread().getId());
	}
	
}
//两种方式的区别
//在Java中，这2种方式都可以用来创建线程去执行子任务，具体选择哪一种方式要看自己的需求。直接继承Thread类的话，可能比实现Runnable接口看起来更加简洁，
//但是由于Java只允许单继承，所以如果自定义类需要继承其他类，则只能选择实现Runnable接口。