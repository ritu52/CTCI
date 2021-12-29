package Question;

public class ReplaceCharactersForURL1_3 {

    public static void main(String[] args) {
        String urlToCovert = replaceSpaces("this is my request                  ", 18);
        System.out.println(urlToCovert);
        System.out.println(replaceSpaces("Mr John Smith                 ", 13));
    }

    private static String replaceSpaces(String stringToConvert, int length) {
        char[] strArray = stringToConvert.toCharArray();
        int spaceCount = 0;

        for(int i=0; i<length; ++i) {
            if(strArray[i] == ' ')
                spaceCount++;
        }

        int index = length+(spaceCount*2);
        for(int i=length-1;i>=0;i--) {
            if(strArray[i] == ' ') {
                strArray[index-1] = '0';
                strArray[index-2] = '2';
                strArray[index-3] = '%';
                index = index -3;
            } else {
                strArray[index-1] = strArray[i];
                index--;
            }
        }
        return String.valueOf(strArray);
    }
}
