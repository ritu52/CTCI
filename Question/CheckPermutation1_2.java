package Question;

import java.util.Arrays;

/**
 * Method checks if two strings are permutation or not and prints true/false
    * Below is console output of the program:
        Is 'bac' and 'cab' permutation of each other?::: true
        Is 'cccckis' and 'cccckie' permutation of each other?::: false
        Is 'ABCDEF' and 'abcdef' permutation of each other?::: false
        Is 'true' and 'false' permutation of each other?::: false
 */
public class CheckPermutation1_2 {

    public static void main(String[] args) {
        System.out.println("Is 'bac' and 'cab' permutation of each other?::: " + checkIfPermutation("bac", "cab"));
        System.out.println("Is 'cccckis' and 'cccckie' permutation of each other?::: "+ checkIfPermutation("cccckis", "cccckie"));
        System.out.println("Is 'ABCDEF' and 'abcdef' permutation of each other?::: "+checkIfPermutation("ABCDEF", "abcdef"));
        System.out.println("Is 'true' and 'false' permutation of each other?::: "+checkIfPermutation("true", "false"));
        System.out.println("---------Another Approach--------------------------------------------------------");
        System.out.println("Is 'bac' and 'cab' permutation of each other?::: " + checkIfPermutationApproach2("bac", "cab"));
        System.out.println("Is 'cccckis' and 'cccckie' permutation of each other?::: "+ checkIfPermutationApproach2("cccckis", "cccckie"));
        System.out.println("Is 'ABCDEF' and 'abcdef' permutation of each other?::: "+checkIfPermutationApproach2("ABCDEF", "abcdef"));
        System.out.println("Is 'true' and 'false' permutation of each other?::: "+checkIfPermutationApproach2("true", "false"));
    }

    private static Boolean checkIfPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        return sortIt(s1).equals(sortIt(s2));
    }
    private static String sortIt(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    private static Boolean checkIfPermutationApproach2(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] arrayForChar = new int[128];

        //check and increment counter for each character in  the 1st string argument
        for(char c1 : s1.toCharArray()) {
            arrayForChar[c1]++;
        }
        // check the 2nd string argument and decrement the counter at that corresponding array index
        for(int i=0; i<s2.length();i++) {
            char c2 = s2.charAt(i);
            arrayForChar[c2]--;
            // if value is less than 0, meaning it wasn't present in 1st string argument, return false
            if(arrayForChar[c2]<0) return false;
        }
        return true;
    }

}
