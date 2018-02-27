package com.example.threading;
/* 第二种方式：实现Runnable接口*/
public class MyThread_impl implements Runnable{
	String name;
	public MyThread_impl(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("thread --> " + name + "  子线程id：" + Thread.currentThread().getId());
	}
}
