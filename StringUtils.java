// StringUtils
public class StringUtils{
  public static boolean containsChar(String word, char c){
    
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == c){
        return true;
      }
    }
    return false;
  }

  public static String reverse(String word){
    String reversed = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      reversed = reversed +  word.charAt(i);
    }
    return reversed;
  }

  public static String replaceAll(String word, char from, char to){
    String replaced = "";
    for (int i = 0 ; i < word.length(); i++) {
      char c = word.charAt(i);
      replaced += c == from ? to : c;
    }

    return replaced;
  }
}