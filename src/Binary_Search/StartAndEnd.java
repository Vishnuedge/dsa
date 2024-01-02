//  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package Binary_Search;

import java.util.Arrays;

public class StartAndEnd {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] answer = searchRange(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    static int[] searchRange(int[] nums, int target){
        int[] answer = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        answer[0] = start;
        answer[1] = end;
        return answer;
    }
    static int search(int[] arr, int target, Boolean findStartIndex){
        int answer = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(target < arr[middle]){
                end = middle - 1;
            } else if(target > arr[middle]) {
                start = middle + 1;
            } else {
                answer = middle;
                if(findStartIndex){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return answer;
    }
}
