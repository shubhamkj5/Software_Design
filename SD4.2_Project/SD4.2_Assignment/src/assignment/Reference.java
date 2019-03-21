package assignment;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Random;

public class Reference {
private String ref;

public String getRef() {
	ref=this.getAlphaNumeric();
	return ref;
}
public static String getAlphaNumeric() {

    char[] ch1 = "0123456789".toCharArray();
    char[] ch2 = "012345".toCharArray();
    char[] c = new char[8];
    SecureRandom random = new SecureRandom();
    for (int i = 0; i <4; i++) {
      c[i] = ch1[random.nextInt(ch1.length)];
    }
    for (int i = 4; i <8; i++) {
        c[i] = ch2[random.nextInt(ch2.length)];
      }

    return new String(c);
  }


}
