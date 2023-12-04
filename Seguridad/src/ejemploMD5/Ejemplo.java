package ejemploMD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Ejemplo {
	
	public static String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashText = number.toString(16);
			
			while (hashText.length() < 32)
				hashText = "0" + hashText;
			
			return hashText;
		} catch (NoSuchAlgorithmException  e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

}
