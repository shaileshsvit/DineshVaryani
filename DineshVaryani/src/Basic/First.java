package Basic;

public class First {

	
	
	 static public void printArray(int[] arr) {
	      int n = arr.length;
	      for (int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	   }
	 

	 static public int [] removeEven(int [] ar) {
		 
		 int oddCount=0;
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i]%2!=0) {
				 oddCount++;
			 }
		 }
		 int idx=0;
		 int []result=new int[oddCount];

		 for(int i=0;i<ar.length;i++) {
			 if(ar[i]%2!=0) {
				 result[idx]=ar[i];
				 idx++;
			 }
		 }
		 
		 return result;
	 }

	 
	 public static void reverseArray(int [] arr,int start,int end) {
		 while(start<end) {
			 int temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
		 }
	 }
	 static public int minimum(int arr[]) {
		 
          if(arr==null || arr.length==0) {
	           throw new IllegalArgumentException("Invalid Input");
                }
		 int min=arr[0];
		 
		 for(int i=0;i<arr.length;i++) {
		if(arr[i]<min)
			min=arr[i];
		 }
		 return min;
	 }
	 
	 
	 public static int secondMax(int ar[]) {
		 
		 int second=0;
		 int max=0;
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i]>max) {
				 second=max;
				 max=ar[i];
				 
			 }
			 else if(ar[i]>second && ar[i]!=max) {
				 second=ar[i];
			 }
		 }
		 
		 return second;
	 }
	 
	public static void moveZeros(int ar[]) {
		int j=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=1 && ar[j]==1) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		
			if(ar[j]!=1) {
				j++;
			}
		}
	}
	 
	public static  void reSize(int ar[],int capacity) {
		int[] temp=new int[capacity];
		for(int i=0;i<ar.length;i++) {
			temp[i]=ar[i];
		}
		ar=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("shialesh sharma");
int ar[]= {3, 2, 4, 7, 10, 6, 5};  
printArray(ar);
	//System.out.println(secondMax(ar));
	int ar1[]= {1,6,7,2};
	reSize(ar1, 9);
	printArray(ar1);
	System.out.println(ar1.length);
	
	int ar2[]= {1,2,4,3,5,6,7,9};
	System.out.println(findMissing(ar2));
	
	}
	public static int findMissing(int ar[]) {
		int n=ar.length+1;
		int sum=n*(n+1)/2;
		for(int num:ar) {
			sum-=num;
		}
		return sum;
	}

}
