package Linear_Search;

// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
       int answer = maximumWealth(accounts);
        System.out.println(answer);
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int row = 0; row < accounts.length; row++){
            int maxOfCol = 0;
            for(int col = 0; col < accounts[row].length; col++){
                maxOfCol += accounts[row][col];
            }
            if(max < maxOfCol){
                max = maxOfCol;
            }
        }
        return max;
    }
}
