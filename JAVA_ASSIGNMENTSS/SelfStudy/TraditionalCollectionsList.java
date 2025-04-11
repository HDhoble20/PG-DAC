package firstHalf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class TraditionalCollectionList extends Thread {
	static ArrayList<Integer> i= new ArrayList<Integer>();
	static List<Integer> list = Collections.synchronizedList(i);
	
	public void run()
	{
		try {
			Thread.currentThread().sleep(500);
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Child Thread Updating List");
		list.add(10);
	}
	
	public static void main(String[] args) throws InterruptedException {
		list.add(10);
		list.add(30);
		list.add(60);
		
		TraditionalCollectionList  a= new TraditionalCollectionList();
		a.start();
		Iterator<E> <Integer> itr=list.iterator();
	    while(itr.hasNext())
	    {
	    	int i=
	    			
	    }
		
	}
	
}
