package Binary_Search;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = findPeak(arr);
        int firstHalf = search(arr, target, 0, peak, true);
        System.out.println(firstHalf);
        if(arr[firstHalf] != target){
            int secondHalf = search(arr, target, peak + 1, arr.length - 1,false);
            System.out.println(secondHalf);
        }
    }
    static int search(int[] arr, int target, int start, int end, boolean isAsc){
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
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int middle = start + (end - start) / 2;
            if(arr[middle] > arr[middle + 1]){
                end = middle;
            } else if(arr[middle] < arr[middle + 1]) {
                start = middle + 1;
            }
        }
        return arr[start];
    }
}
