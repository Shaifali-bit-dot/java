package com.capgemini.training.service;

import com.capgemini.training.client.CopyDataThread;
public class CopyThreadDemo {

		public static void main(String[] args) {
			System.out.println(Thread.currentThread()); 
			Thread t1= new CopyDataThread("worker-1");
			t1.start();
			
			

		}

	
	
}
