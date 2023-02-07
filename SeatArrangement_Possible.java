package com.oops.prgms;

class Seats
{
	public static void seatarrange(int arr[])
	{
		int n=arr[0]/2;
		int deskarrange[][]=new int[n][2];
		int seats=1;
		
		// 2d array seats creation
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<2;col++)
			{	
			  deskarrange[row][col]=seats++;		
			}
		}
		// occupied seats =0
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<2;col++)
			{   
				for(int k=1;k<arr.length ;k++)
				{
					if(deskarrange[row][col]==arr[k])
					{
						deskarrange[row][col]=0;
					}
				}
			}
		}
		// display seats 
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<2;col++)
			{  
					System.out.print(deskarrange[row][col]+" ");  
			}
			System.out.println(" ");
		}
		
		int possible=0;
		int possible1=0;
		System.out.println("----------------------------------");
		
		// count possible arrangemnets
		for(int row=0;row<n;row++)
		{
				if(deskarrange[row][0]!=0)
				{
					if(deskarrange[row][1]!=0)
					{
						possible++;
//						System.out.println("\nRow consider== "+ possible);
					}
				 }

				if(row<n-1 && deskarrange[row][0]!=0 && deskarrange[row+1][0]!=0)
				{

					possible1++;
//					System.out.println("Collum1 consider--"+ possible1);
						
				}
				if(row<n-1 && deskarrange[row][1]!=0 && deskarrange[row+1][1]!=0)
			    {
					 possible1++;
//						System.out.println("Collum2 consider--"+ possible1);
			    }	

		}
//		System.out.println(possible);
//		System.out.println(possible1);
		int result=possible+possible1;
		System.out.println("Total pair arrangemnets  poossible "+result);
}
}
public class SeatArrangement_Possible {

	    public static void main(String[] args) {
		
		int alreadyfilled[]= {8,1,8};
		Seats.seatarrange(alreadyfilled);
	}

}
