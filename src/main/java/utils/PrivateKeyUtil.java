package utils;

import exception.PrivateKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Objects;

public class PrivateKeyUtil {

    private static final String PRIVATE_KEY = "";

    public static PrivateKey getInstance(String optionalPrivateKey) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec keySpec = null;

            if (Objects.isNull(optionalPrivateKey)
                    || optionalPrivateKey.trim().length() == 0) {
                keySpec = new PKCS8EncodedKeySpec(decodedFromString(PRIVATE_KEY));
                return keyFactory.generatePrivate(keySpec);
            }

            keySpec = new PKCS8EncodedKeySpec(decodedFromString(optionalPrivateKey));
            return keyFactory.generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            throw new PrivateKeyException("Erro ao criar PrivateKey");
        }
    }

    private static byte[] decodedFromString(String value) {
        String valueFromString = removeStringPrivateKey(value);
        return Base64.getDecoder().decode(valueFromString);
    }

    private static String removeStringPrivateKey(String value) {
        String pkcs8Pem = value;
        StringBuilder result = new StringBuilder();
        pkcs8Pem = pkcs8Pem.replace("-----BEGIN PRIVATE KEY-----", "");
        pkcs8Pem = pkcs8Pem.replace("-----END PRIVATE KEY-----", "");
        pkcs8Pem = pkcs8Pem.replace("\\s+", "");
        return result.append(pkcs8Pem).toString();
    }
}
