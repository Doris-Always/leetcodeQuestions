package arrayQuestions;

public class ConsecutiveFour {
    public static void main(String[] args) {

        int maxSum = 0;
        int [] arr = {1,4,2,10,23,3,1,0,20};
        int k =4;
        for (int i = 0;i < arr.length;i++){
            int sum = 0;
            for (int j = i;j<= k;j++){
                sum+= j;
            }
            if (sum > maxSum){
                maxSum = sum;
                System.out.println(maxSum);
            }

        }

    }

}
