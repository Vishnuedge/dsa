package Linear_Search;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,31,4,15};
        int target = 31;
        int answer = linearSearchIndex(arr,target);
        System.out.println(answer);
    }
    // Return index of element if found else return -1;
    static int linearSearchIndex(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i =0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // Return index of element if found else return -1;
    static boolean linearSearchBoolean(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for(int i =0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    // Return element if found

    static int linearSearchElement(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for(int i =0; i < arr.length; i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
}