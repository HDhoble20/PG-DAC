package Recursion;

public class Roperations {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
	System.out.print("Forward Recursion:- ");
	display_Forward(arr,0);
	System.out.println();
	System.out.println("----------------------------------------------------");
	System.out.print("Backward Recursion:- ");
	display_Backward(arr,0);
	System.out.println();
	System.out.println("----------------------------------------------------");
	
	System.out.println("Sum Of Array Element is:- "+ sum_of_array(arr,0));
//	System.out.println();
	System.out.println("----------------------------------------------------");
	
	int num=9728331;
	int ans=count_of_digit(num);
	System.out.println("Count Of Digit "+num+":- "+ans);
	System.out.println("----------------------------------------------------");
	int no=5;
	System.out.println("PATTERN 1:-");
	Pattern1(no);
	System.out.println();
	System.out.println("----------------------------------------------------");
	}
  
	
	public static void display_Forward(int [] a,int n)
	{
		if(n>9) return;
		System.out.print(a[n]+" ");
		display_Forward(a,n+1);
		return;
	}
	public static void display_Backward(int [] a, int n)
	{
		if(n>9) return;
		display_Backward(a,n+1);
		System.out.print(a[n]+" ");
		return;
	}
	public static int sum_of_array(int [] a, int n)
	{
		if(n>9) return 0;
		return a[n]+sum_of_array(a,n+1);
	}
    public static int count_of_digit(int num)
    {
    	if(num/10==0) return 1;
    	return 1 + count_of_digit(num/10);
    }
    public static void starPattern(int no)
    {
    	if(no<1) return;
    	System.out.print("*");
        starPattern(no-1);
        return;
    }
    public static void Pattern1(int no)
    {
    	if(no<1) return;
    	System.out.println(" ");
    	starPattern(no);
    	Pattern1(no-1);
    	return;
    }

    
}
