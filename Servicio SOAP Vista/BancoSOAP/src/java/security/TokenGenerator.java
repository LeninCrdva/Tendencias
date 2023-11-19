package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class TokenGenerator {

    private static Map<Integer, String> tokenSave;

    public TokenGenerator() {
        tokenSave = new HashMap<>();
    }

    public String generateToken() {
        long currentTimeMillis = System.currentTimeMillis();
        String timestamp = Long.toHexString(currentTimeMillis);

        System.out.println("Generated Timestamp: " + timestamp);

        String tokenData = timestamp + generateRandomString(16);

        int tokenId = generateTokenId();
        tokenSave.put(tokenId, sha256(tokenData));

        return sha256(tokenData);
    }

    public boolean validateToken(String token) {
        // Verificar que el token no sea nulo y tenga la longitud esperada
        if (token == null || token.length() != 64) {
            return false;
        }
        boolean tokenExists = tokenSave.containsValue(token);

        return tokenExists;
    }

    private String generateRandomString(int length) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder randomString = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = secureRandom.nextInt("abcdef0123456789".length());
            randomString.append("abcdef0123456789".charAt(randomIndex));
        }
        return randomString.toString();
    }

    private String sha256(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private int generateTokenId() {
        int valor = 0;

        while (tokenSave.containsKey(valor)) {
            valor++;
        }

        return valor;
    }

    public static void main(String[] args) {
        TokenGenerator tokenGenerator = new TokenGenerator();
        String generatedToken = tokenGenerator.generateToken();
        System.out.println("Token Generado: " + generatedToken);

        boolean isValid = tokenGenerator.validateToken(generatedToken);
        System.out.println("El token es valido: " + isValid);
    }
}
