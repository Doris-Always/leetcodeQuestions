package arrayQuestions;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        returnDuplicate(nums);

    }
    public static void returnDuplicate(int []num){
        for (int i = 0;i< num.length;i++){
           for (int j = i+1;j < num.length;j++){
               if (num[i] == num[j]){
                   System.out.println(num[j]);
               }
           }
        }

    }

}
