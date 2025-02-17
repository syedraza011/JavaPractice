import java.util.HashMap;
import java.util.HashSet;

public static void main(String[] args) {
  
    isPrimeNumber(107); 
    sumOfDigits(150); 
    ReverseNumber(150); 
    perfectSquare(26);
    int arr[] = {1, 2, 4, 55, 108, 9}; 
    minMaxInAnArray(arr);
    String str="helefsdjklhhl";
    findingRepeatingElement(str);
    String targetStr="hheteleffsdjklhhl";
    findingNonRepeatingElement(targetStr);
}
 //  Find the longest consecutive sequence in an array.

  //  Find the duplicate elements in an array.

  
 //  Find the first non-repeating element in an array.
 public static void findingNonRepeatingElement(String targetStr){
HashMap<Character, Integer> map= new HashMap<>();
  for(char ch: targetStr.toCharArray()){
    map.put(ch, map.getOrDefault(ch,0)+1);
    
  }
  for(char ch: targetStr.toCharArray()){
    if(map.get(ch)==1){
      System.out.println("NON-Repeating number is: "+ch);
      return;
    }
  }
}


//  Find the first repeating element in an array.
public static void findingRepeatingElement(String str){
  HashSet<Character> map= new HashSet<>();
  for(char ch: str.toCharArray()){
    if(map.contains(ch)){
      System.out.println("this is a first repeating character :"+ch);
      break;
    } 
    map.add(ch);

  }
}
 //  Find the maximum and minimum elements in an array.
 public static void  minMaxInAnArray(int[] arr) {
  int min=arr[0];
  int max=0;
  for(int i=0;i<arr.length;i++){
    int curr= arr[i];
    if(min>=curr){
      min=curr;
    }
    if(max <=curr){
      max=curr;
    }
  }
  System.out.println("Minimum num of the array is: "+min+"\n"+"Max num of the array is:"+max);
  
 }

  //  Write a program to check if a number is a perfect square.
  public static void perfectSquare(int target) {
    double sq =0;
    sq=Math.sqrt(target);
      if(sq==(int) sq){
        System.out.println("Perfect sq");
      }else {
        System.out.println("not Perfect sq");
      }
    }
  
  //Write a program to check if a number is even or odd.
public static void isPrimeNumber(int target) {
  if(target%2==0){
    System.out.println("Enetered Number is an EVEN number");
   }else {
    System.out.println("Enetered Number is an ODD number");
   }
}
 //  Find the sum of digits of a given number.
public static void sumOfDigits(int target) {
  String str=Integer.toString(target);
    int sum=0;
    for(int i=0;i<str.length();i++){
      sum +=str.charAt(i) - '0';
      
    }
    System.out.println("sum of the number is: "+sum);
  }
    //  Reverse an integer number (e.g., 123 → 321).
public static void ReverseNumber(int target){
  String str=Integer.toString(target);
  String changedNumber="";
  for(int i=str.length()-1;i>=0;i--){
changedNumber +=str.charAt(i);
   
  }
  System.out.println("changed number = "+changedNumber);
}
  
    //  Find the sum of the first N natural numbers.
    //  Write a program to find the LCM (Least Common Multiple) of two numbers.
    //  Implement a program to print the multiplication table of a given number.
    //  Count the number of vowels and consonants in a string.
    //  Check if a number is an Armstrong number (e.g., 153 → 1³ + 5³ + 3³ = 153).
    //  Convert a decimal number to binary.
    //  Convert a binary number to decimal.
    //  Find the power of a number (x^y) without using the built-in Math.pow().
    //  Swap two numbers using bitwise XOR.
    //  Implement a program to print all prime numbers in a given range.
    //  Check if a number is a strong number (sum of factorials of digits equals the number).
    //  Implement a simple calculator that supports +, -, *, / operations.
    //  Find the square root of a number without using Math.sqrt().
    //  Check whether a given year is a leap year or not.
    //  Convert a character to uppercase/lowercase without using built-in functions.
    //  Write a program to check if a number is Harshad (Niven) number (sum of digits divides the number).
    //  More Array Problems
   
    //  Calculate the sum and average of elements in an array.
    //  Find the frequency of each element in an array.
    //  Find common elements between two arrays.
    //  Write a program to rotate an array to the left by k positions.
    //  Write a program to rotate an array to the right by k positions.
    //  Merge two sorted arrays into a single sorted array.
    //  Find the intersection of two arrays.
    //  Find the union of two arrays.
    
    //  Find the first non-repeating element in an array.
    //  Find pairs in an array that sum to a given number.
    //  Move all zeroes to the end of an array while maintaining order.
   
    //  Implement a function to remove duplicates from an array.
    //  Write a program to segregate even and odd numbers in an array.
    //  Check if two arrays are equal (contain the same elements in any order).
    //  Find the k-th smallest/largest element in an array.
    //  Find the second smallest element in an array.
    

