
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no of elements: ");
            int size = sc.nextInt();
            if (size < 2) {
                System.out.println("Atleast two elements are required: ");
                return;
            }
            int[] arr = new int[size];
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int secondLargest = findSecondLargest(arr);
            System.out.println("Second Largest element is: " + secondLargest);
            sc.close();

        }
    

        public static int findSecondLargest(int[] arr) 
        {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        boolean found = false;
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (!found || arr[i] > secondMax) {
                    secondMax = arr[i];
                    found = true;
                }
            }
        }
        if (found) {
            return secondMax;
        } else {
            System.out.println("No second largest (means all elements are same).");
            System.exit(0);
            return -1;
        }
        }
    }

