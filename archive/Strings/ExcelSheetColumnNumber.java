package archive.Strings;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        int res = 0;
        for(int i=0; i<columnTitle.length(); i++){
            int val = (int) (columnTitle.charAt(i)-65);
            val += 1;
            res += val * (int) Math.pow(26, columnTitle.length()-1-i);
        }
        System.out.println(res);
    }
}
