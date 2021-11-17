package string;

public class extractDigitfromString {

    public static String extractDigits(String src) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String  src = " geeksforgeeks A-118, Sector-136, Uttar Pradesh-201305";
        System.out.println(extractDigits(src));

    }
}
