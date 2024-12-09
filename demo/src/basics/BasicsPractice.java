package basics;
public class BasicsPractice {
    public static void main(String[] args) {

        // Print a welcome message to the console
        System.out.println("\nHello, World!");

        // ----------- Variables -----------
        // Declaring an integer variable 'sum' and assigning a value
        int sum = 100;
        // Printing the value of 'sum' using printf for formatted output
        System.out.printf("The sum is %d\n", sum);

        // ----------- Type Casting -----------
        // Implicit Type Casting (Automatic conversion by JVM)
        // The value of 'i' (integer) is automatically converted to a double
        int i = 50;
        double doub = i;  // Implicit conversion from int to double
        // Printing the result of implicit conversion
        System.out.printf("The integer %d is implicitly converted to double by JVM to double %f\n", i, doub);

        // Explicit Type Casting (Manual conversion by programmer)
        // The value of 'myVal' (double) is explicitly cast to an integer
        double myVal = 13.33;
        int myInt = (int) myVal;  // Explicit conversion from double to int
        // Printing the result of explicit conversion
        System.out.printf("The double %.2f is converted explicitly to integer %d\n", myVal, myInt);

        // ----------- Operators in Java -----------
        // Operators are symbols that are used to perform operations on variables or values.
        // Examples of operators include arithmetic, relational, logical, etc.

        // ----------- If-Else Conditionals -----------
        // If-else statements are used to execute a block of code based on a condition.
        // Uncomment below block to test if-else logic.
        /*
        if (condition) {
            // Execute this block if condition is true
        } else if (anotherCondition) {
            // Execute this block if anotherCondition is true
        } else {
            // Execute this block if neither condition is true
        }
        */

        // ----------- Switch-Case -----------
        // A switch statement evaluates a variable against multiple possible cases.
        // Uncomment below block to test switch-case logic.
        /*
        switch (value) {
            case 0:
                // Code block for case 0
                break;
            case 1:
                // Code block for case 1
                break;
            default:
                // Code block for default case
        }
        */

        // ----------- Loops -----------
        // Loops allow you to execute a block of code multiple times based on conditions.

        // For loop: Loop that runs a specified number of times
        // Uncomment below block to test the for loop.
        /*
        for (int i = 1; i <= 10; i++) {
            // Execute this block for each value of i from 1 to 10
        }
        */

        // While loop: Loop that runs as long as the condition is true
        // Uncomment below block to test the while loop.
        /*
        while (condition) {
            // Execute this block as long as condition is true
        }
        */

        // Do-While loop: Executes the block first, then checks the condition
        // Uncomment below block to test the do-while loop.
        /*
        do {
            // Execute this block
        } while (condition);
        */

        // ----------- For-Each Loop -----------
        // A for-each loop is used to iterate through an array or collection.
        // Uncomment below block to test the for-each loop.
        /*
        int nums[] = {12, 13, 14};
        for (int x : nums) {
            // Execute this block for each element in the array 'nums'
            System.out.println(x);
        }
        */
    }
}
