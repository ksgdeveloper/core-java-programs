package dsa.geeksforgeeks;

/**
 * Input:
 * n = 9
 * arr[] = {1,15,25,45,42,21,17,12,11}
 * Output: 45
 * Explanation: Maximum element is 45.
 */
public class BitonicArray {
    public static void main(String[] args) {
        int arr[] = {1,15,25,45,42,21,17,12,11};
        System.out.println(findMaximum(arr, 9));
    }

    private static int findMaximum(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n-1  ; i++) {
            if(arr[i]  < arr[i+1]){
                temp = i+1;
            }else{
                temp = i;
                break;
            }
        }
        return arr[temp];
    }
}
