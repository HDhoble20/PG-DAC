package LinkedList;
import java.util.Scanner;

public class SinglyLinkedList {
	private intNode head;
	public SinglyLinkedList()
	{
		head=null;
	}
	public void insertFirst (int d)
	{
		intNode new_node = new intNode(d);
		if(head==null)
		{
			head=new_node;
			return;
		}
		else
		{
		new_node.setNext(head);
		head=new_node;
		return;
		}
	}
	
	
	public void insertLast(int d)
	{
		intNode new_node = new intNode(d);
		if(head==null)
		{
			head=new_node;
			return;
		}
		intNode itr=head;
		while(itr.getNext()!=null)
			itr=itr.getNext();
		
		itr.setNext(new_node);
		return;
	}

	
	public int deleteFirst()
	{
		int d= -999;
		intNode deleteable;
		if(head==null)
		{
		 System.out.println("NODE IS EMPTYYY");
		 return d;
		}
		deleteable = head;
		 d=head.getData();
		 head=head.getNext();
		 deleteable = null;
		 return d;
	}
	
	
	public int deleteLast()
	{
		int d = -999;
		intNode deleteable;
		if(head==null)
		{
			System.out.println("NODE IS EMPTYYY");
			return -999;
		}
		if(head.getNext()==null)
		{
		    d = head.getData();
			head=null;
			return d;
		}
		intNode itr=head;
		while(itr.getNext().getNext()!=null)
			itr=itr.getNext();
		
		d=itr.getNext().getData();
		deleteable=itr.getNext();	
		itr.setNext(null);
		deleteable=null;
		return d;
	}
	
	
	public void insert_by_pos(int d, int pos)
	{
		intNode new_node = new intNode(d);
		
			if (head==null)
			{
				head=new_node;
				return;
			}
			if(pos==1)
			{
				new_node.setNext(head);
				head=new_node;
				return;
			}
			intNode itr=head;
			int i;
			for(i=1;i<pos-1 && itr.getNext()!=null;i++)
			{
				itr=itr.getNext();
			}
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
			return;
		
	}
	
	public int delete_by_pos(int pos)
	{
		int d= -999;
		if(head==null)
		return -999;
		
		
		if(pos==1)
		{
			d=head.getData();
			head=head.getNext();
			return d;
		}
		
		intNode itr=head;
		int i;
		
		for(i=1;i<pos-1 && itr.getNext()!=null;i++)
		{
			itr=itr.getNext();
		}
		if(itr.getNext()!=null)
		{
			d=itr.getNext().getData();
			itr.setNext(itr.getNext().getNext());
		}
	
		return d;
		
		
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("Emptyyy");
			return;
		}
		intNode itr=head;
		while(itr!=null)
		{
			System.out.print(itr.getData()+"->");
			itr=itr.getNext();
		}
	}
}
