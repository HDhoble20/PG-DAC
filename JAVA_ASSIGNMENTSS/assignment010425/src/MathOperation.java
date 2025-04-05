/*2. Create a class MathOperation with two data member X and Y to store the 
 * operand and third data member R to store result of operation.
Create method members
init - to input X and Y from user
add - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R*/

public class MathOperation {
   private int x,y;
   private int r;
   MathOperation()
   {
	   
   }
   public void init(int x,int y)
   {
	   this.x=x;
	   this.y=y;
   }
   public void add() 
   {
	r=x+y;   
	System.out.println("ADDITION IS: "+r);
   }
   public void multiply()
   {
	   r=x*y;
	   System.out.println("MULTIPLICATION IS: "+r);
   }
   public void power()
   {
	   r=1;
	    for(int i=0;i<y;i++)
	    {
	    	r=r*x;
	    }
		System.out.println("POWER IS: "+r);
   }
   public void display()
   {
	 
   }
   public static void main(String[] args) {
	   MathOperation mo=new MathOperation();
	   mo.init(7, 9);
	   mo.add();
	   mo.multiply();
	   mo.power();
	
}
}

