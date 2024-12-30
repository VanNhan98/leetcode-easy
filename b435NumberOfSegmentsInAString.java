public class b435NumberOfSegmentsInAString {
    public static void main(String[] args) {
//        String s = ", , , ,        a, eaefa";
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }

    public static int countSegments(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        String result = s.trim();
        String[] segments = result.split("\\s+");
        for (int i = 0; i < segments.length; i++) {
            if(!segments[i].isEmpty()) {
                return segments.length;
            }
        }
        return 0 ;

    }
}
