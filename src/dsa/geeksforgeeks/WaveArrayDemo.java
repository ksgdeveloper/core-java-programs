package dsa.geeksforgeeks;

import java.util.Arrays;

public class WaveArrayDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;
        convert(n, arr);
    }
    public static void convert(int n, int [] a){
        for (int i = 0; i < n-1 ; i+=2) {
            int temp = 0;
            if(a[i] < a[i+1]){
                temp=a[i+1];
                a[i+1]=a[i];
                a[i]=temp;
            }
        }
        Arrays.stream(a).forEach(System.out::println);
    }
}
