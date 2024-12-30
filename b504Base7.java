public class b504Base7 {
    public static void main(String[] args) {
        int n  = -7;
        System.out.println(convertToBase7(n));
    }

    public static String convertToBase7(int num) {
        if(num == 0) return "0";

        StringBuilder sb = new StringBuilder();

        boolean isNegative = num < 0;
        num = Math.abs(num);

        while(num > 0) {
            sb.append(num % 7);
            num = num / 7;
        }

        if(isNegative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
