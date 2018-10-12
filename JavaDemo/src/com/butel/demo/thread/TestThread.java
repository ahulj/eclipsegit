package com.butel.demo.thread;

public class TestThread extends Thread{
	public static int count=0;
	@Override
	public void run() {
		//synchronized (TestThread.class) {
			count++;
			System.out.println("this is thread:"+Thread.currentThread().getName()+"=====result:"+count);
		//}
	}
}
