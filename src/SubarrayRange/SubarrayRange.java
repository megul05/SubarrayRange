package SubarrayRange;

import java.util.Scanner;

public class SubarrayRange {
	
	 public static void findSubarryRange(int array[],int size,int start,int end)
	    {
	        for(int i=start;i<=end;i++)
	        {
	            System.out.print(array[i]+" ");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Size of the Array :");
			int size = scan.nextInt();
			System.out.println("Enter elements of the Array :");
	        int array[]=new int[size];
	        for(int i=0;i<size;i++)
	        {
	            array[i]=scan.nextInt();
	        }
	        System.out.println("enter start index: ");
	        int start=scan.nextInt();
	        System.out.println("enter end index ");
	        int end=scan.nextInt();
	        findSubarryRange(array,size,start,end);

	}

}
