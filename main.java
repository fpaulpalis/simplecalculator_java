import java.util.Scanner;

public class main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int menu_choice = 0;
    while (menu_choice != 4) {
      System.out.println("Welcome to simple calculator.");
      System.out.println("[0] Addition");
      System.out.println("[1] Subtraction");
      System.out.println("[2] Division");
      System.out.println("[3] Multiplication");
      System.out.println("[4] Exit");

      System.out.print("Enter Selection: ");
      int choice = scanner.nextInt();

      if (choice >= 0 && choice <= 3) {
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();

        calculatorOperations calculator = new calculatorOperations();

        switch (choice) {
          case 0:
            System.out.println("Result: " + calculator.add(num1, num2));
            break;
          case 1:
            System.out.println("Result: " + calculator.subtract(num1, num2));
            break;
          case 2:
            System.out.println("Result: " + calculator.divide(num1, num2));
            break;
          case 3:
            System.out.println("Result: " + calculator.multiply(num1, num2));
            break;
          default:
            System.out.println("Invalid choice.");
        }
      } else if (choice == 4) {
        System.out.println("Exiting...");
        scanner.close();
      } else {
        System.out.println("Invalid choice.");
      }

      System.out.println();

    }
  }
}
