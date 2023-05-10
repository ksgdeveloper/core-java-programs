package hackerrank;

import java.util.Arrays;

public class SubstringComparison {
    public static void main(String[] args) {

        String result = getSmallestAndLargest("welcometojava" , 3);
        System.out.println("Result : "+ result);
    }

    public static String getSmallestAndLargest(String s, int k){
        String smallest = "";
        String largest = "";
        String[] str = new String[s.length()-k+1];
        for (int i = 0; i < s.length()-k+1; i++) {
            str[i] = s.substring(i,i+k);
            System.out.println(str[i]);
        }

        for(int i=0; i< str.length ; i++) {
            for (int j = 0; j < i; j++) {
                if(str[i].compareTo(str[j]) < 0) {
                    String t = str[i];
                    str[i] = str[j];
                    str[j] = t;
                }
            }
        }


        smallest = str[0];
        largest = str[str.length-1];
        return smallest + "\n" + largest;
    }
}
