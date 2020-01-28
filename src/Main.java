import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        boolean isNegative = isNegative(number);
        String value = isNegative ? String.valueOf(number * (-1)) : String.valueOf(number);
        StringBuilder sb = revertNumber(value);
        String result = isNegative ? sb.insert(0, "-").toString() : sb.toString();
        System.out.println(result);
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }

    private static StringBuilder revertNumber(String value) {
        char[] chars = String.valueOf(value).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        long l = Long.valueOf(sb.toString());
        return sb;
    }
}
