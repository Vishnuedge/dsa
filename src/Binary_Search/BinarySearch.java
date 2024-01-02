package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {90,75,18,12,6,4,3,1};
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int answer = orderAgnosticSearch(arr, 3);
        System.out.println(answer);
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                    end = middle - 1;
            } else if(target > arr[middle]) {
                    start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    static int orderAgnosticSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(arr[middle] == target){
                return middle;
            }
            if(isAsc){
                if(target < arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if(target > arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
