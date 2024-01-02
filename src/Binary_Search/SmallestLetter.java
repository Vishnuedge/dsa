//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

package Binary_Search;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'x', 'x', 'y', 'y' };
        char answer = nextGreatestLetter(letters, 'z');
        System.out.println(answer);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < letters[middle]){
                end = middle - 1;
            } else  {
                start = middle + 1;
            }
        }
        return letters[start % letters.length];
    }
}
