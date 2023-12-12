package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,4},
                {6,3,5},
                {9,44,12}
        };
        int target = 3;
        int answer = max(arr, target);
        System.out.println(answer);
    }

    // Check element is in array or not
    static boolean search(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(target == arr[row][col]){
                    return true;
                }
            }
        }
        return false;
    }

    static int[] searchIndex(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Find max in 2D array
    static int max(int[][] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if( max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}
