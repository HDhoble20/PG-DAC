package firstHalf;

import java.util.*;

public class Test  {

	public static void main(String[] args) {
		String s1 = "Pawan";
		String s2 = "Himanshu";
		Thread t1 = new Thread()
			{
			public void run() {
		     synchronized(s2)
		     {
		    	 System.out.println("Thread 1 Acquired Lock in Resource 2 ");
		    	 try {
		    		 Thread.sleep(500);
		    		 
		    	 } catch(InterruptedException e)
		    	 {
		    		 System.out.println(e);
		    	 }
		    	 synchronized(s1)
		    	 {
		    		 System.out.println("Thread 1 Acquired Lock in Resource 1 ");
		    	 }
			}	   
	}
	   
			};
			Thread t2=new Thread() {
				public void run() 
				{
					synchronized(s1)
					{
						System.out.println("Thread 2 Acquired Lock in Resource 1 ");
						try {
							Thread.sleep(500);
						} catch(InterruptedException e)
						{
							System.out.println(e);
						}
						synchronized(s2)
						{ 
						   System.out.println("Thread 2 Acquired Lock Resource 2");	
						}
					}
				}
			};
			
			t1.start();
			t2.start();
}
}
