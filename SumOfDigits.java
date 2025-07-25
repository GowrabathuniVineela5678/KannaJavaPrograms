import java.util.Scanner;
public class SumOfDigits
{public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    int sum = DigitsSum(num);
    System.out.println("Sum of digits: "+sum);
    sc.close();
}
public static int DigitsSum(int n)
{
    n = Math.abs(n);//Handle negative numbers
    int sum =0;
    while(n>0)
    {
        sum +=n%10;//Add last digit
        n=n/10;//Remove last digit
    }
    return sum;
}
}