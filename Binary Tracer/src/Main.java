import java.util.ArrayList; 
import java.util.Scanner;

public class Main { public static int name,left, right, middle, middleNum, target, middleGuess; public static String answer, going;

@SuppressWarnings({ "resource", "unchecked", "rawtypes" })
public static void main(String[] args) 
{
    ArrayList userInput = new ArrayList();
    do
    {
        System.out.println("Would you like to enter a number?");
        Scanner userinput = new Scanner(System.in);
        answer = userinput.nextLine();
        if (answer.equals("yes"))
        {
        System.out.println("Enter a number between 1 -20");
        name = userinput.nextInt();
        userInput.add(name);
        
        }
    }
    while(answer.equals("yes"));

    System.out.println(userInput);

    System.out.println("Enter Target Number");
    Scanner userinput5 = new Scanner(System.in);
    target = userinput5.nextInt();

    System.out.println("Enter left spot?");
    Scanner userinput0 = new Scanner(System.in);
    left = userinput0.nextInt();
    if(left == 0)
    {
        System.out.println("Correct");
    }
    else
    {
        System.out.println("Incorrect");
    }
    System.out.println("Enter right spot?");
    right = userinput0.nextInt();
    if(right == userInput.size()-1)
    {
        System.out.println("Correct");
    }
    else
    {
        System.out.println("Incorrect");
    }
    System.out.println("Enter middle spot?");
    middleGuess = userinput0.nextInt();
    if(middleGuess == (left + right)/2)
    {
        System.out.println("Correct");
    }
    else
    {
        System.out.println("Incorrect");
    }
    System.out.println("Enter middle number?");
    middleNum = userinput0.nextInt();
    middle = left + right / 2;
    if(middleNum == (int) userInput.get(middle))
    {
        System.out.println("Correct");
    }
    else
    {
        System.out.println("Incorrect");
    }



    System.out.println("Keep Going?");
    Scanner userinput3 = new Scanner(System.in);
    going = userinput3.nextLine();

    if(going.equals("yes"))
    {
        do
        {

        System.out.println(userInput);

        System.out.println("Enter left spot?");
        Scanner userinput4 = new Scanner(System.in);
        left = userinput4.nextInt();
        if(left < middle && target > middle)
        {
            if(left == middle)
            System.out.println("Correct");

            else 
            {
                System.out.println("Incorrect");
            }
        }
        else if(left < middle && target < middle)
        {
            if(left == 0)
                System.out.println("Correct");
            else
            System.out.println("Incorrect");
        }
        System.out.println("Enter right spot?");
        right = userinput4.nextInt();
        if(right > middle && middle < target)
        {
            if(right == userInput.size())
            System.out.println("Correct");

            else
                System.out.println("Incorrect");
        }
        else if(right > middle && middle > target)
        {
            if(right == middle)
                System.out.println("Correct");

            else
            System.out.println("Incorrect");
        }
        System.out.println("Enter middle spot?");
        middleGuess = userinput4.nextInt();
        if(middleGuess == (left + right)/2)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
        }
        System.out.println("Enter number in the middle spot?");
        middleNum = userinput4.nextInt();

        middle = left + right / 2;
        if(middleNum == (int) userInput.get(middle))
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
        }

        }
        while(going.equals("yes"));
    }   
}
}
