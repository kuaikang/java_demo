package com.example.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_test {

	public static void main(String[] args) {
		System.out.println("--程序开始运行--");
		int poolsize = 5;
		// 创建一个线程池
		ExecutorService pool = Executors.newFixedThreadPool(poolsize);
		
		// 关闭线程池
		pool.shutdown();
	}
}
