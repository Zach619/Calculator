import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    char calculator;
    Double number1, number2, answer;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    calculator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first digit");
    number1 = input.nextDouble();

    System.out.println("Enter second digit");
    number2 = input.nextDouble();

    switch (calculator) {
      // addition between numbers
      case '+':
        answer = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + answer);
        break;

      // subtraction between numbers
      case '-':
        answer = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + answer);
        break;

      // multiplication between numbers
      case '*':
        answer = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + answer);
        break;

      // division between numbers
      case '/':
        answer = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + answer);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
    input.close();
  }
}