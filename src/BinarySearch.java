public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 66, 78};

        int target = 66;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1; //the element is not found;
        }

        int mid = s + (e -s ) /2;
        System.out.println(arr[mid] + "mid");

        if(arr[mid] == target) {
            return mid; //if the mid-element is the target;
        }

        if(target < arr[mid]) {
            //if the target is less than the mid-element then search in the left-side of the array
            return binarySearch(arr, target, s, mid - 1);
        }

        //if the target is greater than the mid-element then search in the right-side of the array
        return binarySearch(arr, target, mid + 1, e);
    }
}
