package Question;

import java.util.Hashtable;

public class UniqueCharactersInString1_1 {

    /**
     * Method checks the unique character in a string and prints true/false
         * Below is console output of the program:
         * Does 'test' has unique characters::: false
         * Does 'morning' has unique characters::: false
         * Does 'eyes' has unique characters::: false
         * Does 'I am a girl' has unique characters::: false
         * Does 'Night' has unique characters::: true
     * @param args: not in use
     */
    public static void main(String[] args) {
        System.out.println("Does 'test' has unique characters::: " +isThisUniqueCharacterOfString("test"));
        System.out.println("Does 'morning' has unique characters::: " +isThisUniqueCharacterOfString("morning"));
        System.out.println("Does 'eyes' has unique characters::: " +isThisUniqueCharacterOfString("eyes"));
        System.out.println("Does 'I am a girl' has unique characters::: " +isThisUniqueCharacterOfString("I am a girl"));
        System.out.println("Does 'Night' has unique characters::: " +isThisUniqueCharacterOfString("Night"));
    }

    private static Boolean isThisUniqueCharacterOfString(String word) {
        Hashtable<Character,Integer> characterHashTable = new Hashtable<>();
        char[] chArray = word.toCharArray();
        for(char ch: chArray) {
            if (characterHashTable.containsKey(ch)) return false;
            characterHashTable.put(ch, characterHashTable.containsKey(ch)? characterHashTable.get(ch)+1 : 1);
        }
        return true;
    }
}
