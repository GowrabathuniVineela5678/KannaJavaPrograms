import java.util.Scanner;//from the sorted array need to search any element
public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" sorted elements:" );
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Element Search
        System.out.println("Enter the element u want to search: ");
        int searchElement = sc.nextInt();
        int result = binarySearch(arr, searchElement);
        if(result==-1)
        {
            System.out.println("Element not found");

        }
        else{
            System.out.println("Element found at index "+result);
        }
        sc.close();
   
    }
//Iterative Binary Search
public static int binarySearch(int[] arr, int searchElement)
{
    int left=0;
    int right=arr.length-1;
    while(left<=right)
    {
        int mid=left+(right-left)/2;//avoid overflow
        if(arr[mid]==searchElement)
        {
            return mid;
        }
        else if(arr[mid]<searchElement)
        {
            left =mid+1;
        }
        else {
            right=mid+1;
        }
    }
    return -1;//not found
}


    
}
