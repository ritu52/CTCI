package Chapter1;

/**
 * Program for checking whether any permutation of a string is a palindrome. The output of the program is:
       * Is 'Tact Coa' palindrome permutation: true
       * Is 'Tact Coat' palindrome permutation: false
       * Is 'aabbcbbaad' palindrome permutation: false
       * Is 'civic' palindrome permutation: true
       * Is 'civil' palindrome permutation: false
       * Is 'civil' palindrome permutation: false
       * Is 'tata' palindrome permutation: true
       * Is 'race car' palindrome permutation: true
 */
public class PalindromePermutation1_4 {

  public static void main(String[] args) {
    PalindromePermutation1_4 palindromePermutation14 = new PalindromePermutation1_4();
    System.out.println("Is 'Tact Coa' palindrome permutation: "+ palindromePermutation14.isPermutationOfPalindrome("Tact Coa"));
    System.out.println("Is 'Tact Coat' palindrome permutation: "+ palindromePermutation14.isPermutationOfPalindrome("Tact Coat"));
    System.out.println("Is 'aabbcbbaad' palindrome permutation: "+ palindromePermutation14.isPermutationOfPalindrome("aabbcbbaad"));
    System.out.println("Is 'civic' palindrome permutation: "+ palindromePermutation14.isPermutationOfPalindrome("civic"));
    System.out.println("Is 'civil' palindrome permutation: "+ palindromePermutation14.isPermutationOfPalindrome("civil"));
    System.out.println("Is 'civil' palindrome permutation: "+ palindromePermutation14.isPermutationOfPalindrome("civil"));
    System.out.println("Is 'tata' palindrome permutation: "+ palindromePermutation14.isPermutationOfPalindrome("tata"));
    System.out.println("Is 'race car' palindrome permutation: "+ palindromePermutation14.isPermutationOfPalindrome("race car"));

  }

  public boolean isPermutationOfPalindrome(String s) {
    int[] table = buildCharacterFrequencyTable(s);
    return checkIfPermutationOfPalindrome(table);
  }

  private boolean checkIfPermutationOfPalindrome(int[] table) {
    boolean foundOddNumber = false;
    for(int x: table) {
      if(x%2 == 1) {
        if(foundOddNumber)
          return false;

        foundOddNumber = true;
      }
    }
    return true;
  }

  private int[] buildCharacterFrequencyTable(String s) {
    int[] tableOfFrequency = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];

    for(char c: s.toCharArray()) {
      int intIndexValue = getIndexForChar(c);
      if(intIndexValue != -1)
        tableOfFrequency[intIndexValue]++;
    }
    return  tableOfFrequency;
  }

  private int getIndexForChar(char inputCharacter) {
    int aCharNumber = Character.getNumericValue('a');
    int zCharNumber = Character.getNumericValue('z');
    int inputCharNumber = Character.getNumericValue(inputCharacter);

    if(inputCharNumber>=aCharNumber && inputCharNumber<=zCharNumber) {
      return inputCharNumber-aCharNumber;
    }
    return -1;
  }
}
