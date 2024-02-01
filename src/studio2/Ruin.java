package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Start Amount: ");
		int startAmount = in.nextInt();
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win Limit: ");
		int winLimit = in.nextInt();
		System.out.println("Days: ");
		int days = in.nextInt();
		int resetVariable = startAmount;
		int numWins = 0;
		int numLosses = 0;


		for(int i = 0; i < days; i++)
		{
			startAmount = resetVariable;
			while(startAmount < winLimit && startAmount > 0)
			{
				double randomNum = Math.random();
				System.out.println(randomNum);
				if(randomNum < winChance) 
				{
					startAmount = startAmount + 5;
					System.out.println("Win");
				}	else 
				{
					startAmount -= 5;	
					System.out.println("Lose");
				}
				
			}
			if(startAmount == winLimit) 
			{
				System.out.println("win!");
				numWins ++;
			}else
			{	System.out.println("lose");
			numLosses ++;
			}
		}

System.out.println(numWins + " wins");
System.out.println(numLosses + " losses");
int winRate = numWins/days;
System.out.println("win rate=" + winRate);




	}

}
