import java.util.Scanner;

public class userInput {

  public static void main(String[] args) {
    // 11. Getting User Input

    //Create the scanner object
    Scanner input = new Scanner(System.in);
    //String
    // Enter the prompt
    System.out.println("Enter a line of text");
    //Wait for the user to enter text
    String line = input.nextLine();
    //Tell them whta they entered
    System.out.println("You entered " + line);
    //Int
    System.out.println("Enter an Integer");
    //Wait for the user to enter int
    int value = input.nextInt();
    //Tell them whta they entered
    System.out.println("You entered " + value);
    //Float
    System.out.println("Enter an floating point value: ");
    //Wait for the user to enter int
    double value2 = input.nextDouble();
    //Tell them whta they entered
    System.out.println("You entered " + value2);
    input.close();
  }
}
