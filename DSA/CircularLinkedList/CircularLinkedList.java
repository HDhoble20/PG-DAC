package LinkedList;

public class CircularLL {
 intNode last;

public CircularLL() {
	last = null;
}

public intNode getLast() {	
	return last;
}

public void setLast(intNode last) {
	this.last = last;
}

public void insertFirst(int d)
{
	intNode new_node=new intNode(d);
	if(last==null)
	{
		last=new_node;
		last.setNext(last);
		return;
	}
	new_node.setNext(last.getNext());
	last.setNext(new_node);
	return;
}

public void insertLast(int d)
{
	intNode new_node= new intNode(d);
	if(last==null)
	{
		last=new_node;
		last.setNext(last);
		return;
	}
	new_node.setNext(last.getNext());
	last.setNext(new_node);
	last=new_node;
}
public int deleteFirst()
{
	int d;
	
	if(last==null)
	{
		return -999;
	}
	if(last.getNext()==last)
	{
		 d=last.getData();
		last.setNext(null);
		last=null;
		return d;
	}
	d=last.getNext().getData();
	last.setNext(last.getNext().getNext());
	return d;
	
}
public int deleteLast()
{
	int d;
	if(last==null)
	return -999;
	
	if(last.getNext()==last)
	{
		d = last.getData();
		last.setNext(null);
		last=null;
		return d;
	}
	intNode itr=last.getNext();
	do {
		itr=itr.getNext();
	}while(itr.getNext()!=last);
		
		itr.setNext(last.getNext());
		last.setNext(null);
		d=last.getData();
		last=itr;
		return d;
}

public void insert_by_pos(int d, int pos)
{
	intNode new_node=new intNode(d);
	if(last==null)
	{
		System.out.println("LL is empty");
		last=new_node;
		new_node.setNext(last);
		return;
	}
	if(pos==1)
	{
		new_node.setNext(last);
		last=new_node;
		return;
	}
	intNode itr= last;
	int i;
	for(i=1;i<pos && itr.getNext()!=null;i++)
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
	if(last==null)
	return -999;
	
	
	if(pos==1)
	{
		d=last.getData();
		last=last.getNext();
		return d;
	}
	
	intNode itr=last;
	int i;
	
	for(i=1;i<pos && itr.getNext()!=null;i++)
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
public void Display()
{
	if(last==null)
	{
		System.out.println("EMPTY LINKED LIST");
		return;
	}
	intNode itr=last.getNext();
	do {
		System.out.print(itr.getData()+"->");
		itr=itr.getNext();
	}while(itr!=last.getNext());
			
}
 
}
