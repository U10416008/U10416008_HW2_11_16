//U10416008¤BªN

import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
	ArrayList wrongAns = new ArrayList();
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " * " + number2 + "? ");
    int answer = input.nextInt();
    wrongAns.add(answer);
    while (number1 * number2 != answer) {
	  
	  if(wrongAns.contains(answer) == true){
		  System.out.print("You already entered " + answer);
	  }
	  wrongAns.add(answer);
      System.out.print("Wrong answer. Try again. What is " 
        + number1 + " * " + number2 + "? ");
      answer = input.nextInt();
    }

    System.out.println("You got it!");
  }
}
