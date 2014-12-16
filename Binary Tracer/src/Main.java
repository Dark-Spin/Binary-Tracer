import java.awt.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
	{
	static String name;
	static int elements;
	static int target = 1;

	public static void main(String[] args)
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome Stranger, Please Enter Your Name");
		name = input.nextLine();
		System.out.println("Welcome to learning binary tracing " + name + "\n");
		System.out
				.println("In the line, please enter an array length 3-10, preferably, however you may go higher.");
		ArrayList e = new ArrayList();
		System.out.println("Enter your ArrayList.");
		int a = input.nextInt();
		a = (a-1);
		e.add(a);
		System.out.println(e);
		
		// binarySearch(null, elements);
		}

	public static void binarySearch(int[] e, int target)
		{
		int left = 0;
		int right = e.length;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			if (target < e[middle])
				{
				right = middle - 1;
				} else if (target > e[middle])
				{
				left = middle + 1;
				} else
				{
				System.out.println(middle);
				}
			}
		System.out.println("-1");
		}
	
	}
