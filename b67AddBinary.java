public class b67AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "11";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || carry != 0) {
            int sum1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int sum2 = (j >= 0) ? b.charAt(j) - '0': 0;
            int sum = sum1 + sum2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }

       return sb.reverse().toString();
    }
}
