import java.util.Scanner;
public class PrimeCheck
{
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
    System.out.print("enter a number");
    int num = sc.nextInt();
if(isPrime(num))
{
    System.out.println(num+" is a prime no");
}
else{
    System.out.println(num+" is not a prime no");
}
sc.close();
    }
    
public static boolean isPrime(int n)
{
    if(n<=1)
    return false;
    if(n==2 || n==3)
    {
        return true;
    }
    if(n%2==0||n%3==0)
    return false;
    for(int i=5;i*i<=n;i+=6)
    {
if(n%i==0||n%(i+2)==0)
return false;
    }
    return true;
}
}