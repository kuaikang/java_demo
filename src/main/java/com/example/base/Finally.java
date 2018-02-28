package com.example.base;

import com.example.entity.Student;

public class Finally {

	public static void main(String[] args) {
		System.out.println("finally在任何情况下都会运行吗？如果不是在什么情况下不运行？");
		System.out.println("在程序中，应该确保占用的资源被释放，比如及时关闭数据库连接，关闭输入流，或者关闭输出流。finally代码块能保证特定的操作总是会被执行。");
		
		System.out.println("当你在捕获到异常的处理代码里加上： System.exit(); 这样的话finally的代码块是不会执行的。");
		try {
			Student s = null;
			System.out.println(s.getName());
		} catch (Exception e) {
			System.exit(0);
		}finally {
			System.err.println("finally");
		}
	}
}
