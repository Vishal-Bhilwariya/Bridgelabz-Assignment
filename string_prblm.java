// // 1
// import java.util.*;
// class Questions {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     String str1=sc.next();
//     String str2=sc.next();
//     if(sol(str1,str2)){
//         System.out.println("Strings is equal");}
//     else{
//         System.out.println("Strings is not equal");}
//     }
//     public static boolean sol(String str1,String str2){
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         for(int i=0;i<str1.length();i++){
//             if(str1.charAt(i)!=str2.charAt(i)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }


// // 2
// import java.util.*;

// public class Question2 { 
//     public static String customSubstring(String text, int start, int end) {
//         String result = "";
//         for (int i = start; i < end; i++) {
//             result += text.charAt(i);
//         }
//         return result;
//     }

//     public static boolean compareStrings(String str1, String str2) {
//         if (str1.length() != str2.length()) {
//             return false;
//         }
//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) != str2.charAt(i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String text = sc.next();
//         int start = sc.nextInt();
//         int end = sc.nextInt();

//         String substringUsingCharAt = customSubstring(text, start, end);
//         String substringUsingBuiltIn = text.substring(start, end);
//         boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);

//         System.out.println("Substring using charAt: " + substringUsingCharAt);
//         System.out.println("Substring using built-in: " + substringUsingBuiltIn);
//         System.out.println("Are both substrings equal? " + areEqual);
//     }
    
// }

// 3
// import java.util.Scanner;

// public class Question3 {
//     public static char[] getChars(String text) {
//         char[] result = new char[text.length()];
//         for (int i = 0; i < text.length(); i++) {
//             result[i] = text.charAt(i);
//         }
//         return result;
//     }

//     public static boolean compareCharArrays(char[] arr1, char[] arr2) {
//         if (arr1.length != arr2.length) {
//             return false;
//         }
//         for (int i = 0; i < arr1.length; i++) {
//             if (arr1[i] != arr2[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String text = sc.next();

//         char[] userDefinedArray = getChars(text);
//         char[] builtInArray = text.toCharArray();

//         boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);

//         System.out.print("Characters using user-defined method: ");
//         for (char c : userDefinedArray) {
//             System.out.print(c + " ");
//         }

//         System.out.print("\nCharacters using toCharArray method: ");
//         for (char c : builtInArray) {
//             System.out.print(c + " ");
//         }

//         System.out.println("\nAre both character arrays equal? " + areEqual);
//     }
// }

// // 1
// import java.util.*;
// class Questions {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     String str1=sc.next();
//     String str2=sc.next();
//     if(sol(str1,str2)){
//         System.out.println("Strings is equal");}
//     else{
//         System.out.println("Strings is not equal");}
//     }
//     public static boolean sol(String str1,String str2){
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         for(int i=0;i<str1.length();i++){
//             if(str1.charAt(i)!=str2.charAt(i)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }


// // 6
// import java.util.*;

// public class Question2 { 
//     public static String customSubstring(String text, int start, int end) {
//         String result = "";
//         for (int i = start; i < end; i++) {
//             result += text.charAt(i);
//         }
//         return result;
//     }

//     public static boolean compareStrings(String str1, String str2) {
//         if (str1.length() != str2.length()) {
//             return false;
//         }
//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) != str2.charAt(i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String text = sc.next();
//         int start = sc.nextInt();
//         int end = sc.nextInt();

//         String substringUsingCharAt = customSubstring(text, start, end);
//         String substringUsingBuiltIn = text.substring(start, end);
//         boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);

//         System.out.println("Substring using charAt: " + substringUsingCharAt);
//         System.out.println("Substring using built-in: " + substringUsingBuiltIn);
//         System.out.println("Are both substrings equal? " + areEqual);
//     }
    
// }

// 7
// import java.util.Scanner;

// public class Question3 {
//     public static char[] getChars(String text) {
//         char[] result = new char[text.length()];
//         for (int i = 0; i < text.length(); i++) {
//             result[i] = text.charAt(i);
//         }
//         return result;
//     }

//     public static boolean compareCharArrays(char[] arr1, char[] arr2) {
//         if (arr1.length != arr2.length) {
//             return false;
//         }
//         for (int i = 0; i < arr1.length; i++) {
//             if (arr1[i] != arr2[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String text = sc.next();

//         char[] userDefinedArray = getChars(text);
//         char[] builtInArray = text.toCharArray();

//         boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);

//         System.out.print("Characters using user-defined method: ");
//         for (char c : userDefinedArray) {
//             System.out.print(c + " ");
//         }

//         System.out.print("\nCharacters using toCharArray method: ");
//         for (char c : builtInArray) {
//             System.out.print(c + " ");
//         }

//         System.out.println("\nAre both character arrays equal? " + areEqual);
//     }
// }


// 9
import java.util.Scanner;

public class Question4 {
   public static void main(String[] args) {
     
   }
}
