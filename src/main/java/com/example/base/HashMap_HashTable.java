package com.example.base;

import java.util.HashMap;
import java.util.Hashtable;

import com.example.entity.Student;

public class HashMap_HashTable {

	public static void main(String[] args) {
		System.out.println("1.HashMap和HashTable的key都是不可重复的");
		System.out.println("2.HashMap允许null值(key和value都可以),HashTable不允许null值(key和value都不可以)");
		System.out.println("3.HashMap是线程不安全的,HashTable是线程安全的");
		System.out.println("4.多线程环境下，使用HashMap进行put操作会引起死循环");
		HashMap<String,Student> hashMap = new HashMap<String,Student>(10);
		hashMap.put(null, null);
		hashMap.put(null, new Student("tom", "18")); // 覆盖了上面的
		System.out.println(hashMap.get(null));
		
		Hashtable<String, Student> hashTable = new Hashtable<String,Student>();
		hashTable.put("1001", new Student("lucy", "18"));
		hashTable.put("1001", new Student("lily", "18"));  //覆盖了上面的值
		System.out.println("1001 --> name:" + hashTable.get("1001").getName());
		
		try {
//			hashTable.put(null, null);
//			hashTable.put(null, new Student("jack","19"));
			hashTable.put("id01",null);
		} catch (NullPointerException e) {
			System.out.println("HashTable不允许null值");
		}
	}
}
