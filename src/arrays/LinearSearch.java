package arrays;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 18, 9, 11, 11};
        System.out.println(search(arr, 12, 0));

        System.out.println(searchList(arr, 11, 0, new ArrayList<>()));

        System.out.println(searchList1(arr, 11, 0));
    }

    static int search(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;  //if the element does not exist in the array
        }

        //base condition
        if(arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1);
    }


    static ArrayList<Integer> searchList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;  //if the element does not exist in the array
        }

        //base condition
        if(arr[index] == target) {
            list.add(index);
        }
        return searchList(arr, target, index + 1, list);
    }

    //removing the arraylist from the parameter
    static ArrayList<Integer> searchList1(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) {
            return list;  //if the element does not exist in the array
        }

        //base condition
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> listFromBelowCall = searchList1(arr, target, index + 1);
        list.addAll(listFromBelowCall);

        return list;
    }

}
