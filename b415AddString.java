public class b415AddString {
    public static void main(String[] args) {
        String num1 = "196";
        String num2 = "217";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || c > 0) {
           int d1 = 0, d2 = 0;
           if(i>=0) {
               d1 = num1.charAt(i) - '0';
               i--;
           }
           if(j>=0) {
               d2 = num2.charAt(j) - '0';
               j--;
           }
           int sum = d1 + d2 + c;
           c = sum / 10;
           sb.append(sum % 10);
        }
        return sb.reverse().toString();
    }
}
