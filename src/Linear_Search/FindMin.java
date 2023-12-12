package Linear_Search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = { };
        int answer = search(arr);
        System.out.println(answer );
    }

    // Assume arr.length is not empty
    // Return min value
    static int search(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
