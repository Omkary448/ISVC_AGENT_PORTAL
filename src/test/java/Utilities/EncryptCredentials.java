package Utilities;

public class EncryptCredentials {
	public static void main(String[] args) throws Exception {
        String username = "jW3KPca1glHFqLi2Mwtm5NoQda/HF2nSu9WFZvjJX3A=";
        String password = "7zKjD0lHZtInmUpgP9k/Vg==";
        String encryptedUsername = EncryptionUtil.encrypt(username);
        String encryptedPassword = EncryptionUtil.encrypt(password);
        System.out.println("Encrypted Username: " + encryptedUsername);
        System.out.println("Encrypted Password: " + encryptedPassword);
    }
}
