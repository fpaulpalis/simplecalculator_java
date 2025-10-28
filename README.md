# ITE 186 Computer Programming 2 P2 Activity

Submitted By:

Francis Paul Palis

Submitted to: Sir Rofer Savella

---
**To Run the Application, clone the repository** and from the terminal execute:
```jsx
java main.java
```


---
# [0] Addition

<img width="815" height="523" alt="image" src="https://github.com/user-attachments/assets/b94e1ead-a644-4fd4-8a69-06f9de7d6a8a" />

# [1] Subtraction

<img width="692" height="474" alt="image" src="https://github.com/user-attachments/assets/878623cb-2829-42fd-a5b8-dccf488c45e4" />

# [2] Division

<img width="686" height="468" alt="image" src="https://github.com/user-attachments/assets/4ea1a4f5-82d0-4c73-99b8-c97cd54ba46b" />

# [3] Multiplication

<img width="683" height="476" alt="image" src="https://github.com/user-attachments/assets/61eebd72-0812-46ed-bad6-d4f3d286d05f" />

# [4] Exit

<img width="768" height="420" alt="image" src="https://github.com/user-attachments/assets/39520c4f-3c24-4533-940b-a38cd6ab4542" />

# Source Code

## main.java

```jsx
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

```

## calculatorOperations.java

```jsx
public class calculatorOperations {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a Number
        }
        return num1 / num2;
    }
}

```
