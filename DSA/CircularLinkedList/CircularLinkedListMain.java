package LinkedList;

import java.util.Scanner;

public class CircularLLMain {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		CircularLL c=new CircularLL();
		
	do {
		
			System.out.println();
			System.out.println("*************************************************/n/n");
			System.out.println("1.Insert First");
			System.out.println("2.Insert Last");
			System.out.println("3.Delete First");
			System.out.println("4.Delete Last");
			System.out.println("5.Insert by Position");
			System.out.println("6.Delete by Position");
			System.out.println("7.Display");
			System.out.println("*************************************************/n");
			System.out.println("Enter Your choice");
			int ch = sc.nextInt();
			System.out.println("*************************************************/n");
			switch(ch)
			{
			case 1:
				System.out.println("Enter Element to Insert");
				int val=sc.nextInt();
				c.insertFirst(val);
				break;
          
			case 2:
				System.out.println("Enter Element to Insert");
				int val2=sc.nextInt();
				c.insertLast(val2);
				break;
			 
				 
 			case 3:
				int deleted1=c.deleteFirst();
					if(deleted1 != -1)
					 System.out.println("Deleted Element: "+deleted1);
				 break;
			
			case 4:
				int deleted2=c.deleteLast();
				if(deleted2 != -1)
				 System.out.println("Deleted Element: "+deleted2);
			     break;
	 
			case 5:
				System.out.println("Enter Element to Insert");
				int val3=sc.nextInt();
				System.out.println("Enter Position to Insert element at");
				int pos1=sc.nextInt();
				c.insert_by_pos(val3,pos1);
				break;
			
			case 6:
				System.out.println("Enter Position to Delete element at");
				int pos3=sc.nextInt();
				int deleted3=c.delete_by_pos(pos3);
				if(deleted3 != -1)
				 System.out.println("Deleted Element: "+deleted3);
				break;
          
			case 7:
				 c.Display();
				 break;
			
		default:
				System.out.println("Invalid input");
			}
			
		   }while(true);
		}
}
