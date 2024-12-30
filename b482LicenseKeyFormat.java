public class b482LicenseKeyFormat {
    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(licenseKeyFormatting(s, k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = Character.toUpperCase(s.charAt(i));
            if(c != '-') {
                sb.append(c);
            }
        }
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < sb.length() ; i++) {
            if(count > 0 && count % k == 0) {
                result.append('-');
            }
            count ++;
            result.append(sb.charAt(i));

        }


        return result.reverse().toString();

    }
}
