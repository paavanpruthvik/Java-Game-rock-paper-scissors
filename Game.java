import java.util.Random;
import java.util.Scanner;

public class Game 
{	
	public static void main(String[] args) 
	{
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int random = ran.nextInt(3);
//		System.out.println(random);
		System.out.println("Select the following option:\nRock    : 0\nPaper   : 1\nScissor : 2");
		System.out.print("Enter your selection :");
		int you = sc.nextInt();
		if(random == 0)
		{
			if(you == 1)
			{
				System.out.println("Computer choose Rock you choose Paper! so you win");
			}
			else if(you == 2)
			{
				System.out.println("Computer choose Rock you choose Scissor! so you Lost");
			}
			else if(you == 0)
			{
				System.out.println("Computer choose Rock you choose Rock! Its a tie");
			}
		}
		else if(random == 1 )
		{
			if(you == 0)
			{
				System.out.println("Computer choose Paper you choose Rock! so you Lost");
			}
			else if(you == 2)
			{
				System.out.println("Computer choose Paper you choose Scissor! so you win");
			}
			else if(you == 1)
			{
				System.out.println("Computer choose Paper you choose Paper! Its a tie");
			}
			
		}
		else if(random == 2 )
		{
			if(you == 0)
			{
				System.out.println("Computer choose Scissor you choose Rock! so you win");
			}
			else if(you == 1)
			{
				System.out.println("Computer choose Scissor you choose Paper! so you Lost");
			}
			else if(you == 2)
			{
				System.out.println("Computer choose Scissor you choose Scissor! Its a tie");
			}
		}
		if(you > 2 )
		{
			System.out.println("Invalid input");
		}
	}	
}
