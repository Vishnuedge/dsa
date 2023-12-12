package Linear_Search;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int answer = findNumbers(nums);
        System.out.println(answer);
        digits2(-2192);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int element){
       int noOfDigits = digits(element);
       return noOfDigits % 2 == 0;
    }

    // Other way to find length of digits
    static int digits2(int element){
        if(element < 0){
            element = element * -1;
        }
        int length = (int)(Math.log10(element) + 1);
        return length;
    }

    static int digits(int element){
        int count = 0;
        if(element < 0){
            element = element * -1;
        }
        if(element == 0){
            return 1;
        }
        while(element > 0){
            count++;
            element = element / 10;
        }
        return count;
    }
}
