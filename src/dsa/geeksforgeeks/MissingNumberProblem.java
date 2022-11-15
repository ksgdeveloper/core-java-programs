package dsa.geeksforgeeks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MissingNumberProblem {
    public static void main(String[] args) {
        int A[] = {1};
        System.out.println(findMissingNumber(A,2));

    }

    private static int findMissingNumber(int array[], int n){
        int missingFlag = 0;
        if(array.length == 1){
            return 1;
        }

        for (int i = 0; i < n ; i++) {
            boolean found = false;
            for(int j = i ; j < n; j++){
                if(j == array[i]){
                    found = true;
                    break;
                }
            }
            if(found == false){
                missingFlag = i+1;
                //System.out.println("position " + i);
                break;
            }
        }
        return missingFlag;
    }
}
