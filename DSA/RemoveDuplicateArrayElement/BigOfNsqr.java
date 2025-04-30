package removeDuplicateElementArray;

public class BigOnSqr {
  public static void main(String[] args) {
	 int arr[]= new int[] {12,23,22,12,4,23,4,32,22,3,-999};
	 int tar[]= new int[10];
	 int i,j ,tar_index;
	
	 tar[0]=arr[0];
	 tar_index=0;
	 for(i=1;arr[i]!=-999;i++)
	 {
		 for(j=0;j<=tar_index;j++)
		 {
			 if(arr[i]==tar[j])
			 {
				 break;
			 }
			
		 }
		 if(j>tar_index)
		 {
			 tar_index=tar_index+1;
			 tar[tar_index]= arr[i];
		 }

	 }
	
	 for(i=0;i<tar_index;i++)
	 {
		 System.out.println(tar[i]); 
	 }
}
}
