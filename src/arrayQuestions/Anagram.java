package arrayQuestions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        isAnagram("car","rat");

    }
    public static boolean isAnagram(String wordA,String wordB){
        if (wordA.length() == wordB.length()){
            char[] arrWordA = wordA.toCharArray();
            char[] arrWordB = wordB.toCharArray();

            Arrays.sort(arrWordA);
            Arrays.sort(arrWordB);

            boolean isAnagram = Arrays.equals(arrWordA,arrWordB);
            if (isAnagram) {
                return true;
            }

        }


        return false;
    }
}
