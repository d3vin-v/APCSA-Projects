package interpreter;

public class Main {

  public static void main(String[] args) {
    Lexicon lex = new Lexicon();

    String newWord = lex.translate("food");
    System.out.println(newWord);

  }

  /**
   * This method decodes a single word.
   * 
   * @param word The single word to be decoded.
   */
  public static String decode(String word)
  {
    return "";
  }

  /**
   * This method should not have code copy/pasted from the decode method.
   * 
   * @param message The sentence (multiple words) to be decoded.
   */
  public static String decodeMessage(String message)
  {
    return "";
  }
}