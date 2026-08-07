package archive.Strings;
public class RemoveDigitFromNumber {
    public static void main(String[] args) {
        String number = "133235";
        char digit = '3';
        int index = -1;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                index = i;
                if (i + 1 < number.length() && number.charAt(i + 1) > digit) {
                    break;
                }
            }
        }
        String result = number.substring(0, index) + number.substring(index + 1);
        System.out.println(result);
    }
}
