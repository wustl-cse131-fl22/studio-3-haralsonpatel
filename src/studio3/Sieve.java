package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in1 = new Scanner(System.in);
		System.out.println("How many do you want to sort?");
		int n = in1.nextInt();
		int[] array = new int[n];
		
		//sets up array from 1 to n (not including n)
		for (int i=1; i<n; i++)
		{
			array[i] = i;
			System.out.print(array[i]);
		}
		System.out.println("");
		
		//start at 2...find all multiples of 2
		for (int j=2; j<10; j++)
		{
		for (int i=0; i<n; i++)
			
			{
				//multiple
				if (array[i] % j == 0)
				{
					if (array[i] == j)
					{
						array[i] = j;
					}
					else
					{
						array[i] = 0;
					}
				}
				//not a multiple
				
			}
			
		}
		
		for (int i=0; i<n;i++)
		{
			if (array[i] !=0)
			{
				System.out.println(array[i]);
			}
		}
		
	}

	
}
	
