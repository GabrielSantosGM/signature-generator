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

    private static final String PRIVATE_KEY_DEFAULT = "-----BEGIN PRIVATE KEY-----MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCeiOukDZ69RuKAQhlZywp9JRwi8LhUCJGsJcadQSB30g3Tqx2Vi2y/+LRbLiW4NW0BuIy3JmY2T14PkfGij2kXSyGJ6sb6hajyPZE9aVEe/gS6E0tFhh4YTtw5sZ1LZxAmrS5LbX3n2qKbf1FrkkqU7BWDDfNWKsoV6aTL6+0SyxITRpeSVcwQZIU0ERAGyP20x+DSUJ/yk5Xry2NXKngClbPFgyYyJQUp7WhGym0fI/RK7RFp1JbM0GqX6jSIdd/ly1sKnLLVrfnOsRRr/2pQ+1ZTLPmRzqIYuYi5aqx8iFCaa+K3mUh+Fz8nUb1z36gN79IDBYSbJSBUhley//6hAgMBAAECggEBAJEfFVXfgegR81UlLL+dtcRJLDBv2sxR68eB7QYWj/ofNrkEcthqAOraZ37wB2dQwLBKl8UwSXB9xsTJ/D+qt7Cy/ciaOfsqTzUwVru4pKGSNhF/h+/kjbgCuGW3yR01Avvkm/RADnknEqL1MTsfd1ZLpoWJR68hDExyzIA/P41rC40AsSOxAFhejKpZFRgiHbZZsi+IoT0H91FJHBWeABwi8PvPZwZ93DD78xXmW2UYamaiAkaeREaMcHUi0baWzO+NIuxS5rFUHJat55qS17ZofTgYUxuMYiMsS9zh8yKkZW0dIVL7w8lzF7SOQmx4+7qj44xQX4S8c6AAA6cpn2ECgYEA/6/i0qLW0La3WLFdrjykkfe0wcPdS+4xUxndkBTTmBIYYkGK7nkMOSr6owIIEng1ONhe/55FeCGoU46HHd3wnrTmr1RQ2GlkZr/JCKoCE7OOSJijGH/9SEaoTv1FjfakhaSd6kPBcNV/ydsax8Cpg9iEmhiP8Fr/i0mhRjTFzu8CgYEAnrqYCtTKgwIm0d7h8s1axw4wV094ncPS7n5+g0eNtbxh0MlwRL0R9TSLUL+DS8DTsnkorRXxdW0xe23xe4mcAnPc6TAthqFtmUsmLygepaxGbZ6XE633dWfnt80WM24QRjEF3GQD/Oo1nTTWw3i4AEe35lwNrmDeO4OXQKQZC28CgYBJXrlh5CRsY+Ic61iMhQ5cbI5MA95eyY0R4Zw4miFVw+uHVnN9lvKw/OpLGGwkkKYFF+G6zDn3DQF2aLHRGjzP7e08Zp+EWknbSjFv8QkDikTMBDDY+PE/ajcl43uwDxSK3QALl0HNFRbEX8FBjMGX+eujJGU5fYNS/t/ue3o/tQKBgAufgEiywk2Ll8ogdw0vimkvGc0a7asnzsdWDe+RCsh3Dfaa+ZSe/7Sj71uvWm7upNHZ22epRrAhmdD/AQLZ1cm8MD4HIB5Ordbe0OH9Hxlknxeh2FBBmfBH9ojYBLspYRmyt0onLL+Vau2jE+LmcRrcJZRBw2K0hzF2dlnuakMTAoGBAPNM1hFKLTqVYfD+a6guBL425xk5X8CIVeumX82shSpnu+zBV2IeeV7qCm8k3s3KOS2xgQp5lxILIr6KAaYYNey+uPYguFs3goV2NNMK7MaAg74tP2y0ouRdjmALv44rDTuz/nmFlAMrnMdfXnRBVHVdMygsSmwUA2EmvM8o/x5a-----END PRIVATE KEY-----";

    public static PrivateKey getInstance(String optionalPrivateKey) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec keySpec;

            if (Objects.isNull(optionalPrivateKey)
                    || optionalPrivateKey.trim().length() == 0) {
                keySpec = new PKCS8EncodedKeySpec(decodedFromString(PRIVATE_KEY_DEFAULT));
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
