package com.butel.demo.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("c");
		list.add("e");
		list.add("a");
		System.out.println("before:"+list.toString());
		System.out.println("before:"+list.hashCode());

//		list.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		});
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		System.out.println("after:"+list.toString());
		System.out.println("after:"+list.hashCode());
		System.out.println("after:"+list);


		String str1=new String("abc");
		String str2=new String("abc");
		System.out.println("str1==str2 "+(str1==str2));
		
		Object o1=new Object();
		System.out.println("list1==list2 "+(str1==str2));

	}

}
