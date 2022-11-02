public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String zString) {
        String hash = "";
        for (char character : zString.toCharArray()) {
            switch (character){
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'e':
                case 'E':
                    hash += 3;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'o':
                case 'O':
                    hash += character;
            }
        }
        return hash;
    }
    public static boolean checkPassword(String pass, String hash) {
        return hash.equals(hashPassword(pass));
    }
}
