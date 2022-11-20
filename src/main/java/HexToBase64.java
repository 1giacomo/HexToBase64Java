import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

public class HexToBase64 {

    public HexToBase64() {
    }

    public static void main(String[] args) throws DecoderException {
        String hexString = "4a1b48d7322394a78326cd283f0834093e65421a7e98e90e5b452d160b5d07d8";

        char[] charArray = hexString.toCharArray();
        byte[] decodedHex = Hex.decodeHex(charArray);

        String converted = Base64.encodeBase64String(decodedHex);
        System.out.println(converted);

    }
}