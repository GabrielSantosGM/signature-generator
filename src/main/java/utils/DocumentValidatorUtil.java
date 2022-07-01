package utils;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import exception.DocumentException;
import java.util.Objects;
import java.util.regex.Pattern;

public class DocumentValidatorUtil {

    private static final int CNPJ_LENGTH = 14;
    private static final Pattern ONLY_DIGITS = Pattern.compile("\\D");

    public static void validate(String value) {
        String document = extractOnlyDigits(value);
        CNPJValidator validatorCnpj = new CNPJValidator();
        CPFValidator validatorCpf = new CPFValidator();
        
        if (Objects.isNull(document) 
                || document.trim().length() == 0) {
            throw new DocumentException("Documento não pode ser nulo ou vazio!");
        }
        
        try {
            if (document.length() == CNPJ_LENGTH)
                validatorCnpj.assertValid(document);
            else
                validatorCpf.assertValid(document);
        } catch (InvalidStateException ex) {
            throw new DocumentException(ex.getMessage());
        }
    }

    private static String extractOnlyDigits(String document) {
        return ONLY_DIGITS.matcher(document).replaceAll("");
    }
}
