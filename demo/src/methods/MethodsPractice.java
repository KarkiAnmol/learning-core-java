import java.util.Arrays;

public class MethodsPractice {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.printf("\nBefore Swap: a = %d, b = %d\n", a, b);
        System.out.println("Calling swap...");
        swap(a, b);
        System.out.printf("After Swap: a = %d, b = %d\n", a, b);
        // The values of 'a' and 'b' remain unchanged because Java uses pass-by-value for primitives.

        String name = "Anmol Karki";
        changeName(name);
        System.out.println("The name is " + name);
        // Output: Anmol Karki
        // Strings are immutable in Java. The original string remains unchanged,
        // even though the reference variable can point to a different string inside the method.

        String str2 = "abc";
        str2 = "def";
        // When str2 is assigned a new value, it points to a new memory location.
        // This demonstrates that strings are immutable in Java. We are not modifying the
        // original string but reassigning the reference to a new string object.

        // Let's see how mutability works with objects, such as arrays.
        int[] arr = {1, 5, 7, 3};
        changeNums(arr);
        // The reference to the array is passed by value, but since the reference
        // points to the same array object, modifications inside the method
        // are reflected in the original array.
        System.out.println(Arrays.toString(arr)); // Output: [20, 30, 7, 3]

        // Scope demonstration:
        // Variables declared in the outer scope are accessible in inner blocks.
        // However, variables declared in inner blocks are not accessible outside that block.

        // Shadowing demonstration:
        // Shadowing occurs when a variable declared in a narrower scope hides a variable
        // with the same name declared in a wider scope.
        // Uncomment the Shadowing class below to observe this behavior.

        /*
        public class Shadowing {
            static int x = 90; // Class-level variable (global scope)
            public static void main(String[] args) {
                System.out.println(x); // Output: 90
                int x; // Declares a local variable with the same name, hiding the global variable.
                x = 40;
                System.out.println(x); // Output: 40 (local variable is used here)
                fun(); // Output: 90 (local variable is not in scope here, so the global variable is used)
            }
            static void fun() {
                System.out.println(x); // Accesses the global variable.
            }
        }
        */
    }

    public static void swap(int a, int b) {
        // Demonstrates swapping values of primitives inside a method.
        // This does not affect the original values outside the method
        // because Java passes primitive variables by value.
        int temp = a;
        a = b;
        b = temp;
    }

    public static String changeName(String str) {
        // Demonstrates that strings are immutable.
        // Reassigning 'str' inside the method does not affect the original string.
        str = "Bot";
        return str;
    }

    static void changeNums(int[] nums) {
        // Demonstrates mutability of arrays in Java.
        // Modifies the contents of the array as the reference points to the same object.
        nums[0] = 20;
        nums[1] = 30;
    }
}
