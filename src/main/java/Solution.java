public class Solution {
    public static void main(String[] args) {

        String v = "Example";
        //Initiation of a new String;
        String strR = "";
        //Make a reverse without stringbuffer and function reverse();
        for (int a = v.length() - 1; a >= 0; a--) {
            strR = strR + v.charAt(a);
        }
        // Using conditional statements "if else" to check equal statement between 2 strings
        if (strR.equalsIgnoreCase(v)) {
            System.out.print("given string is a palindrome");
        } else {
            System.out.println("given string is not a palindrome");
        }

    }
}





