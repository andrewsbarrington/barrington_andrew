import java.util.Scanner;

public class adventure2
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("please choose a path, A, B,");
		String choice1 = kb.next();
		if (choice1.equals("A") || choice1.equals("B"))
		{
			if (choice1.equals("A"))
			{
				System.out.println("you are dead");
			}
			else
			{
				System.out.println("you made it ot the next room");
				System.out.println("you now must choose between two levers");
				int choice2 = kb.nextInt();
				if (choice2 == 1 || choice2 == 2)
				{
					if (choice2 == 1)
					{
						System.out.println("you chose the right lever");
						System.out.println("your now must choose between the right or left path");
						String choice3 = kb.next();
						if (choice3.equals("right") || choice3.equals("left"))
						{
							if (choice3.equals("right"))
							{
								System.out.println("congrat you made it out ");
							}
							else
							{
								System.out.println("you are dead");
							}
						}
						else
						{
							System.out.println("plaese choose right or left");
						}
					}
					else
					{
						System.out.println("you are dead");
					}
				}
				else
				{
					System.out.println("please choose 1 or 2 ");
				}
			}
				
		}
		else
		{
			System.out.println("please choose A or B");
		}
	}
}