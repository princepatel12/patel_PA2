package patel_p3;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		
		int responses[][] = new int[5][10];
		int a, b, c, d,num_People, rating;
		String topics[] = {"Cars", "Motorcylces", "Education", "Environment", "Food"};
		
		Scanner in = new Scanner(System.in);
		
		//Prompt number for num_People
		System.out.print("Number of people polling: ");
		num_People = in.nextInt();
		
		
		for(a = 0; a < num_People; a++)
		{
			System.out.println("Rate the following topics from 1(least important)-10(most important):");
			
			for(b = 0; b < 5; b++)
			{
				System.out.print(topics[b] + ": ");
				rating = in.nextInt();
				
				responses[b][rating-1]++;
			}
		
		}
		
		int average_Responses [] = new int[topics.length];
		int largestnumTot = 0; 
		int smallestnumTot = 0;
		String highresponsetops="", lowresponsetops="";
		
		for(c = 0; c < 5; c++)
		{
			average_Responses[c] = 0;
			for(d = 0; d < responses[c].length; d++)
			{
			average_Responses[c] += (responses[c][d]*(d+1));
			}
			
			if(c == 0)
			{
				largestnumTot = average_Responses[c];
				smallestnumTot = average_Responses[c];
				highresponsetops = topics[c];
				lowresponsetops = topics[c];
			}
			
			else
				if(average_Responses[c] > largestnumTot)
				{
					highresponsetops = topics[c];
					largestnumTot = average_Responses[c];
				}
				
				if(average_Responses[c] < smallestnumTot)
				{
					lowresponsetops = topics[c];
					smallestnumTot = average_Responses[c];
				}
				
				average_Responses[c] = average_Responses[c]/num_People;
		}
		
		System.out.printf("\n%-20s","");
		
		for(a = 0; a < 10; a++)
		{
			System.out.printf("%-10d",(a+1));
		}
		
		System.out.printf("%20s","Average Ratings");
		System.out.println();
		
		for(b = 0; b < responses.length; b++)
		{
			System.out.printf("\n%-20s", topics[b]);
			for(c = 0; c < responses[b].length;c++)
				System.out.printf("%-10d", responses[b][c]);
			System.out.printf("%20d", average_Responses[b]);
		}
		
		System.out.println("\nHighest number of votes in total: " + largestnumTot + " Topic: " +highresponsetops);
		System.out.println("Lowest number of votes in total: " + smallestnumTot + " Topic: " +lowresponsetops);
	}
	

}