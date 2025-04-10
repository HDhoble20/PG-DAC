package campus.accounts;

import campus.academics.*;
public class Fees {
    
	private Student a=new Student();
	private int amount;
	private String paymentDate;
	
	public Fees() {
		super();
	}

	public Fees(Student a, int amount, String paymentDate) {
		super();
		this.a = a;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Fees [a=" + a + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}
	
	public int totalFess(Student s[], int amt)
	{
		int tf=0;
		for(int i=0; i<s.length; i++)
		{
			if(s[i].getSemester()=="2" || s[i].getSemester()=="Second")
			{
//				tf+=
			}
		}
		return tf;
		
	}
	
}
