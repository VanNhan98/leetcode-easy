public class b14LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flight", "flow"};
        System.out.println(longestCommonPrefix(strs1)); // Kết quả: "fl"
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
