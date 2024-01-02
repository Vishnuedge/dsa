package Binary_Search;

public class InfinateArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,9010,130,140,160,170};
        int target = 10;
        int answer = findingRange(arr, target);
        System.out.println(answer);
    }
    static int findingRange(int[] arr, int target){
        int start = 0;
        int end = 1;

        while( target > arr[end]){
            int newStart = end + 1;
            // previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }

    static int search(int[] arr, int target, int start, int end){
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
}
