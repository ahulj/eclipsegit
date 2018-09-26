package com.butel.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadPoolManager {

	private static ThreadPoolManager managerInstance=null;
	
	//private static ExecutorService  pools=Executors.newFixedThreadPool(5); 
	//private static ExecutorService  pools=Executors.newSingleThreadExecutor(); 
	private static ScheduledExecutorService  pools=Executors.newScheduledThreadPool(5);
	private ThreadPoolManager() {
		
	}
	
	public static ThreadPoolManager getThreadPoolManager() {
		if(null==managerInstance) {
			managerInstance=new ThreadPoolManager();
		}
		return managerInstance;
	}
	
	public void addThread(Runnable command) {
		pools.execute(command);
		System.out.println("Ö´ÐÐthead");
	}
	
	public void shutdown() {
		pools.shutdown();
	}
}
