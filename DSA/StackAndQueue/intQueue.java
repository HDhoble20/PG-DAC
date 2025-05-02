package StackAndQueue;

public class intQueue {
private int arr[];
private int front,rear;

public intQueue()
{
	arr=new int[100];
	front=rear=-1;
}
public intQueue(int s)
{
	arr=new int[s];
	front=rear=-1;
}
public boolean isfull()
{
	if(rear==arr.length-1)
	return true;
	else
	return false;
}
public  boolean isEmpty()
{
	if((front==-1)||(front-rear==1))
		return true;
	else
		return false;
}

public void insert(int d)
{
	if(isfull())
	{
		System.out.println("OverFlow..");
		return;
	}
	if(front ==-1)
	front=0;

	rear=rear+1;
	arr[rear]=d;
	return;
}
public int remove()
{
	int d=-999;
	if(isEmpty())
	{
		System.out.println("Underflow..");
		return d;
	}
	d=arr[front];
	front=front+1;
	return d;
}
public int peek()
{
	int d=-999;
	if(isEmpty())
	{
		System.out.println("Underflow..");
		return d;
	}
	d=arr[front];
	
	return d;
}
}
