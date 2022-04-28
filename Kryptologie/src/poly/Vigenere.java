package poly;

public class Vigenere {

  public static char shift(char c, int k) {
    return (char) ((( c + k - 65 ) % 26 ) + 65 );
  }
  
  public static String caesar(String arg, int key) {
    String res = "";
    for(int i=0; i<arg.length(); i++) {
      char c = arg.charAt(i);
      res += shift(c, key);
    }
    return res;
  }
  
  public static String vigenereV(String arg, String keyword) {
    String res = "";
    int k;
    int j=0;
    int l = keyword.length();
    
    for(int i=0; i<arg.length(); i++) {
      char c = arg.charAt(i);

      // keyword = BRUTUS
     
     j = j%l;
     //System.out.println("j :"+j);
     k = (int) keyword.charAt(j);
     //System.out.println("k: " +k+ ","+ keyword.charAt(j));
     res += shift(c, k-65);
     j++;
    }
    
    return res;
  }
  
 /* public static String vigenereE(String arg, String keyword) {
	    String res = "";
	    int k;
	    int j=0;
	    int l = keyword.length();
	    
	    for(int i=0; i<arg.length(); i++) {
	      char c = arg.charAt(i);

	      // keyword = BRUTUS
	     
	     j = j%l;
	     System.out.println("j :"+j);
	     k =  (int) keyword.charAt(j);
	     System.out.println("k: " +k+ ","+ keyword.charAt(j));
	     res += shift(c, k-65);
	     j++;
	    }
	    
	    return res;
	  }*/
  
  public static void main(String[] args) {
    String plain = "ZIELPERSON";

    String cipher = vigenereV(plain, "BIGMAC");
    //String cipher2 = vigenereE("AQKXPGSAUZ", "BIGMAC");
    System.out.println( cipher );
    //System.out.println( cipher2 );
  }

}
