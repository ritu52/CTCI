package Chapter1;

/**
 * Program to check if one input string is just one edit (one replacement or one insertion or one deletion)
 * away from second input string. The console output is below:::
     * Is 'bake' one edit away from 'cake'? true
     * Is 'bake' one edit away from 'bake'? true
     * Is 'pales' one edit away from 'pale'? true
     * Is 'pale' one edit away from 'bale'? true
     * Is 'bake' one edit away from 'pale'? false
     * Is 'takes' one edit away from 'takers'? true
     * Is 'arm' one edit away from 'armies'? false
 */
public class OneAway1_5 {
  public static void main(String[] args) {
    OneAway1_5 oneAway1_5 = new OneAway1_5();
    System.out.println("Is 'bake' one edit away from 'cake'? "+oneAway1_5.isOneAway("bake", "cake"));
    System.out.println("Is 'bake' one edit away from 'bake'? "+oneAway1_5.isOneAway("bake", "bake"));
    System.out.println("Is 'pales' one edit away from 'pale'? "+oneAway1_5.isOneAway("pales", "pale"));
    System.out.println("Is 'pale' one edit away from 'bale'? "+oneAway1_5.isOneAway("pale", "bale"));
    System.out.println("Is 'bake' one edit away from 'pale'? "+oneAway1_5.isOneAway("bake", "pale"));
    System.out.println("Is 'takes' one edit away from 'takers'? "+oneAway1_5.isOneAway("takes", "takers"));
    System.out.println("Is 'arm' one edit away from 'armies'? "+oneAway1_5.isOneAway("arm", "armies"));
  }


  public boolean isOneAway(String first, String second) {
    if(first.length() == second.length())
      return checkOneEditReplace(first, second);
    else if(first.length()-1 == second.length())
      return checkOneEditInsert(first, second);
    else if(first.length() +1 == second.length())
      return checkOneEditInsert(second, first);

    return false;
  }

  private boolean checkOneEditReplace(String first, String second) {
    boolean foundDifference = false;
    for(int i=0; i<first.length();++i) {
      if(first.charAt(i) != second.charAt(i)) {
        if(foundDifference)
          return false;

        foundDifference = true;
      }
    }
    return true;
  }

  private boolean checkOneEditInsert(String bigger, String smaller) {
    int indexBigger =0;
    int indexSmaller =0;
    while(indexBigger < bigger.length() && indexBigger<smaller.length()) {
      if(bigger.charAt(indexBigger) != smaller.charAt(indexSmaller)){
        if(indexBigger!=indexSmaller)
          return false;

        indexBigger++;
      } else {
        indexBigger++;
        indexSmaller++;
      }
    }
    return true;
  }
}
