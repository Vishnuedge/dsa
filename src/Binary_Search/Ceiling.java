package Binary_Search;

public class Ceiling    {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int answer = search(arr, 19);
        System.out.println(answer);
    }
    // Smallest number greater than equal to target
    static int search(int[] arr, int target){
        if(target > arr[arr.length - 1]){
            return -1;
        }
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
        return start;
    }
}
