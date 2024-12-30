public class b551StudentAttendanceI {
    public static void main(String[] args) {
        String s = "LALL";
        System.out.println(checkRecord(s)); // true
    }

    public static boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(c == 'A') {
                a++;
                if(a > 1) return false;
            }

            if(c == 'L') {
                l++;
                if(l >= 3) return false;
            }
            else {
                l = 0;
            }
        }
        return true;
    }
}
