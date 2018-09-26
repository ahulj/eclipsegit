package com.butel.demo.main;

import com.butel.demo.thread.TestThread;
import com.butel.demo.thread.ThreadPoolManager;

public class Test {

	public static void main(String[] args) {
		//sdsdsd
		ThreadPoolManager manager=ThreadPoolManager.getThreadPoolManager();
		for(int i=0;i<15;i++) {
			Thread t=new TestThread();
			manager.addThread(t);
		}
		manager.shutdown();
	}

}
