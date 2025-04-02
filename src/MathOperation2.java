/*3. Create a class MathOperation containing method ‘multiply’ to calculate multiplication of 
 * following arguments.
a. two integers
b. three float
c. all elements of array
d. one double and one integer*/
public class MathOperation2 {
	
	private int a,b;
	private float x,y,z;
	private int arr[];
	
	private double d;
	private int mul;
	private int c;
	private float ans;
	private double res;
	
      public int Multi(int a, int b)
      {
    	  this.a=a;
    	  this.b=b;
    	  return a*b;
      }
      public float multi(float x,float y,float z)
      {
    	  this.x=x;
    	  this.y=y;
    	  this.z=z;
    	 ans =(x*y*z);
    	 return ans;
      }
	public int multi(int[] a)
	{
	  int n=a.length;
	  
	  mul=1;
	  for(int i=0; i<n; i++)
	  {
		  mul=mul*a[i];
	  }
		return mul;
	}
	
	public double multi(double a, int b)
	{
		this.d=a;
		this.c=b;
		this.res=(double) d*c;
		return res;
	}
	public static void main(String[] args) {
		int[] a= {5,5,2,1,2,1,15};
		MathOperation2 f= new MathOperation2();
		System.out.println(f.multi(4,7));
		System.out.println(f.multi(2.3f,5.5f, 4.2f));
		System.out.println(f.multi(a));
		System.out.println(f.multi(20.0d, 5));
		
		
	}

}
