import java.util.Scanner;
public class PalindromeCheck
{public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string or number");
    String input = sc.nextLine();
    if(isPalindrome(input))
    {
        System.out.println(input+" is a palindrome");
    }
    else
    {
        System.out.println(input+"is not a palindrome");
    }
    sc.close();

}

public static boolean isPalindrome(String s)
{
    s = s.toUpperCase();//case insenstive
    int left =0;
    int right = s.length()-1;
    //without using array we use length();
    //in case of length we use length;
    //Compare charcaters from both ends
    while(left<right)
    {
        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}