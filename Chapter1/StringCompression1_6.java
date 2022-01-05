package Chapter1;

public class StringCompression1_6 {

  public static void main(String[] args) {
    StringCompression1_6.compressIt("aabbccdAAAVVV");
    StringCompression1_6.compressIt("abb");
    StringCompression1_6.compressIt("rrrtttQQQQppp");
  }

  private static void compressIt(String inputString) {
    System.out.println("Input String: "+inputString);
    int actualInputStringLength = inputString.length();
    StringBuilder stringBuilder = new StringBuilder();
    int counterForCharacters = 0;

    for(int i=0;i<actualInputStringLength;++i) {
      counterForCharacters++;

      if(i+1>= actualInputStringLength || inputString.charAt(i) != inputString.charAt(i+1)) {
        stringBuilder.append(inputString.charAt(i));
        stringBuilder.append(counterForCharacters);
        counterForCharacters = 0;
      }
    }
    if(stringBuilder.toString().length() < inputString.length())
      System.out.println("Compressed String:: "+stringBuilder);
    else
      System.out.println("Compressed String:: "+inputString);
  }


}
