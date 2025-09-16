package Recursion;

public class arraySortedInc {
    public static boolean isSorted(int arr[],int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] >= arr[idx + 1]) {
            return false;
        } else {
            return isSorted(arr, idx + 1);
        }
    }
    static void main() {
        int arr[]= {1,3,4,5,6};
        boolean a = isSorted(arr,0);
        System.out.println(a);

    }
}
