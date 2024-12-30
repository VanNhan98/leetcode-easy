public class test5 {
    public static void main(String[] args) {
        String str = "I Love Code";
        System.out.println(FirstReverse(str));
    }

    public static String FirstReverse(String str) {
        StringBuilder sb  = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();

    }
}
