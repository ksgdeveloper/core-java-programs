package dsa.geeksforgeeks;

public class SearchAnElementInArray {
    public static void main(String[] args) {

    }

    private static int search(int arr[], int n, int x){
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if(x == arr[i]){
                pos = i;
            }
        }
        return pos;
    }
}
