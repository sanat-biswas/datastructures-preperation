package arrays;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotatedBinarySearch(arr, 9, 0, arr.length - 1));
    }

    static int rotatedBinarySearch(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        //if the element lies in the first half
        if(arr[s] <= arr[mid]) {
            if(target >= arr[s] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, target, s, mid - 1);
            } else {
                return rotatedBinarySearch(arr, target, mid + 1, e);
            }
        }

        if(target >= arr[mid] && target <= arr[e]) {
            return rotatedBinarySearch(arr, target, mid + 1, e);
        }

        return rotatedBinarySearch(arr, target, s, mid - 1);
    }
}
