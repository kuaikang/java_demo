package com.example.base;

public class String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		System.out.println("相同点:都是被final修饰的,是不可被继承的");
		System.out.println("不同点:");
		System.out.println("   1.String的对象是不可变的；而StringBuilder和StringBuffer是可变的");
		System.out.println("   2.StringBuffer是线程安全的，而StringBuilder不是线程安全的");
		
		String str = "12345679";
		String res = "";
		long stime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			res += str;
		}
		long etime = System.currentTimeMillis();
		System.out.println("使用string对字符串进行累加1000次 cost:" + (etime-stime));
		
		StringBuffer sb = new StringBuffer();
		stime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sb.append(str);
		}
		etime = System.currentTimeMillis();
		System.out.println("使用StringBuffer对字符串进行累加1000次 cost:" + (etime-stime));
		
//		使用string对字符串进行累加100000次 cost:26934
//		使用StringBuffer对字符串进行累加100000次 cost:2
//      类加100000次时差距已经很大了
		
		String name = "Hello";
		name = "World";
		// 上面2行操作实际上是创建了两个String对象
		
		String s1 = "Hello";
		String s2 = s1+"World";
		// 上面操作:先创建一个String对象，在字符串连接的时候,又创建了一个StringBuidler，然后调用append()方法，最后调用toString()方法
				
		//使用String对字符串操作会产生大量的、多余java对象。所以结果是：影响性能，占用空间
	}
}
