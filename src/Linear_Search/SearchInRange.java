package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {4,2,1,7,3,9};
        int target = 1;
        boolean answer = search(3 ,5,arr, target);
        System.out.println(answer);
    }

    // Find element in range of array exists or not if exists return true else false.
    static boolean search(int start, int end, int[] arr, int target){
        if(arr.length == 0 || end > arr.length - 1){
            return false;
        }
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
