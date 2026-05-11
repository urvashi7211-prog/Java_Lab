import java.util.Scanner;
import java.util.Arrays;

class A {
    int[] arr = new int[5];   

    // method to sort array
    void sortArray() {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    void searchArray(int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at position " + (i+1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + key + " not found in array.");
        }
    }

    void sumArray() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }

    void avgArray() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average of array elements: " + avg);
    }
}

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A obj = new A();

        
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < obj.arr.length; i++) {
            obj.arr[i] = sc.nextInt();
        }

        obj.sortArray();
        obj.sumArray();
        obj.avgArray();

        System.out.println("Enter element to search:");
        int key = sc.nextInt();
        obj.searchArray(key);

        sc.close();
    }
}