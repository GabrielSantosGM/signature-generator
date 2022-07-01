package service;

import exception.SigException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import utils.DocumentValidatorUtil;
import utils.PrivateKeyUtil;

public class GenerateSignatureImpl {

    private final Signature signature;

    public GenerateSignatureImpl() {
        Security.addProvider(new BouncyCastleProvider());
        try {
            this.signature = Signature.getInstance("SHA256withRSA");
        } catch (NoSuchAlgorithmException ex) {
            throw new SigException("Erro ao inciar a instance de Signature");
        }
    }

    public String generateSignature(String document, String optionalPrivateKey) {
        DocumentValidatorUtil.validate(document);
        PrivateKey privateKey = PrivateKeyUtil.getInstance(optionalPrivateKey);
        try {
            signature.initSign(privateKey);
            signature.update(document.getBytes("UTF-8"));
            
            byte[] signed = signature.sign();
            return Base64.getEncoder().encodeToString(signed);
        } catch (InvalidKeyException | SignatureException | UnsupportedEncodingException ex) {
            throw new SigException("Erro ao gerar assinatura.");
        }
    }

}
