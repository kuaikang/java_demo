package com.example.threading;
/* 第一种方式：继承Thread类*/
public class MyThread_extends extends Thread{
	String name;
	public MyThread_extends(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("thread --> " + name + "  子线程id：" + Thread.currentThread().getId());
	}
}


