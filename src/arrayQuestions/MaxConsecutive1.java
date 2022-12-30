package arrayQuestions;

public class MaxConsecutive1 {
    public static void main(String[] args) {
        int [] num = {1,1,0,1,1,1};
        MaxConsecutive1 maxLength = new MaxConsecutive1();
        maxLength.findMaxConsecutiveOnes(num);
    }
    public int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int maxVal = 0;
        for (int i =0;i < nums.length;i++){
            if (nums[i] == 1){
                count++;
                if (maxVal < count) maxVal = count;
                System.out.println(maxVal);
//                maxVal = Math.max(maxVal,count);
//
            }else {
                count = 0;
            }
        }
        return maxVal;
    }
}
