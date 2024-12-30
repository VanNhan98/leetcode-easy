public class b28 {
    public static void main(String[] args) {
        String haystack = "sssadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle)); // Kết quả: 0
    }

    private static int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
