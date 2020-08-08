//Saule Buhler
//This program prompts the user for 2 numbers and uses it to make two dimensional arrays +  
//which will be filled with randomly generated numbers creating football team season scores table 
import java.util.Scanner;  
import java.lang.Math;
import java.util.Arrays; //imports 

public class Saule_Buhler_Week7Assignment
{
	public static void main(String[] args) 
	{
		//instantiate scanner
		Scanner input = new Scanner(System.in);
		
		//declare and initialize variables 
		int numOfTeam = 0;
		int numOfGames = 0;
		int min = 0;
		int max = 99;
		int random = 0;
		int totalScore;
		int average;
		int topTeam = 0;
		int topTeamPosition = 0;
		
		//display 
		printLine(62);
		System.out.println("Football Team Randomized Season Scores");
		printLine(62);
		
		//prompt user
		System.out.print("Enter the number of teams: ");
		numOfTeam = input.nextInt();
		System.out.print("Enter the number of games: ");
		numOfGames = input.nextInt();
		
		//initialize user entry to two dimensional arrays
		int[][] gameScore = new int [numOfTeam][numOfGames];
		
		printHeader(); //method for display
		
		//loop couldn't figure out why it's printing one less column 
		for(int i = 0; i <= gameScore.length-1; i++) 
		{
			totalScore = 0;
			for(int j = 0; j < gameScore[i].length; j++) 
			{
				if(j == 0) 
				{
					System.out.print((i+1) +  ":\t");
				}
				else 
				{
					gameScore[i][j] = (int)((Math.random()*(max-min)+1)+ min);
					System.out.print(gameScore[i][j] + " ");
					totalScore = totalScore + gameScore[i][j];
				}
			}//end loop
			//print total score and average 
			System.out.printf("\t\t%d\t %d", totalScore, (totalScore/numOfGames));
			System.out.println();
			
			//comparing totals and determining the top team
			if(totalScore > topTeam) 
			{
				topTeam = totalScore;
				topTeamPosition = i+1;
			}
		}
		//print top team  
		printLine(62);
		System.out.println("Top Team: Team " + topTeamPosition);
		printLine(62);
	}
	
	//method for printing header 
	private static void printHeader() 
	{
		printLine(62);
		System.out.println("Football Scores Report");
		printLine(62);
		System.out.printf("Team\t Scores\t\t\t\t\t Tot\t Avg\n");
		printLine(62);
	}
	
	//method for printing dashes 
	private static void printLine(int dashes) 
	{
		for(int i = 1; i <= dashes; i++) 
		{
			System.out.print("-");
		}
		System.out.println("\n");
	}
}
