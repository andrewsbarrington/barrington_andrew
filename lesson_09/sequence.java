import java.util.Scanner;
public class sequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a starting nuimber");
		int start = kb.nextInt();
		System.out.println("please enter your sequence size");
		int size = kb.nextInt();
		int[] seq = new int[size];
		for(int i = 0; i < size; i++)
		{
			if(i==1 || i == 0)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.print(seq[i] + " 1");
		}
		System.out.println("");
	}
}