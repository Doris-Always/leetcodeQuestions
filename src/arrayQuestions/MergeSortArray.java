package arrayQuestions;

import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args) {
        int [] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        System.out.println(Arrays.toString(mergeSortArray(num1, 3, num2, 3)));

    }
    public static int [] mergeSortArray(int[] num1,int m,int[] num2,int n){
        int y = m + n -1;
        int i = m - 1;
        int j = n -1;
        while(i >= 0 & j >= 0){
            if(num1[i] < num2[j]){
                num1[y--] = num2[j--];
            }
            else{
                num1[y--] = num1[i--];
            }
        }
        while (j >= 0){
            num1[i--] = num2[j--];
        }
        return num1;
    }
}
