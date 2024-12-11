package methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args){
        int a =10;
        int b=20;
        System.out.printf("\n Before Swap a= %d, b= %d \n", a , b );
        System.out.println("Calling swap...");
        swap(a,b);
        System.out.printf(" a= %d, b= %d \n", a , b );

//        String is manipulated by a method, but the original string remains unchanged (immutability), but can change inside
//        block scope if the reference variable is itself  pointed to a different object
        String name = "Anmol Karki";
        changeName(name);
        System.out.println("the name is "+name); // output: Anmol Karki



        String str2="abc";
        str2="def";

//        Here we are not changing its value but are creating a new String "def". Technically str2 variable changes
//        its value (memory location its pointing to) to reference a new String "def"
//        object but it is pointing to the new String object "def" not the same String object "abc".

//        You aren't actually changing the value of the original String object you are just referencing
//    a new String  so while the value of your variable does change you aren't
//        actually changing the original String object...Hope that makes sens
//        thus strings are immutable
//        now we see how it works for objects,reference variabes and complex data types where pas by value of that reference variable shall occur
//        we will create an array
        int[] arr = {1,5,7,3};
        changeNums(arr); //the reference arr object is passed as a parameter (Call by value because the value is the obejct itself )
        System.out.println(Arrays.toString(arr));
//the array gets changed. why? because the value itself is object/ array / reference variable


//         outer scope varible can be used on its inside blocks but inside initialized varibale
//        cant be used on outer scope

//        Shadowing is a practice in java where you use two variable with same name within the scope that overlaps
//    public class Shadowing{
//        static int x = 90; // first x variable initialized
//        public static void main(String[] args){
//            System.out.println(x); //90
//            int x; // added a variable that overlaps with the scope of first variable x,
//            // so the varaible with higher scope is hidden, this is shadowing
//            x=40;
//            System.out.println(x); // 40 prints second x not first x, the first x is shadowed
//            fun(); //90 since the second varible is only available on this scope
//        }
//        static void fun(){
//            System.out.println(x);
//        }
//    }



    }
    public static void swap( int a ,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static String changeName(String str){ // str is reference Array which points to same arr
        str= "Bot";
        return str;
    }
    static void changeNums(int[] nums){
        nums[0]=20;
        nums[1]=30;
    }
}
