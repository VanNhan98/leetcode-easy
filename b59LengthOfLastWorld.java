public class b59LengthOfLastWorld {
    public static void main(String[] args) {
        String s = "Hello World Nhan   ";
        System.out.println(lengthOfLastWord(s)); // Kết quả: 5
    }

    private static int lengthOfLastWord(String s) {
        s = s.trim();
        int index = s.lastIndexOf(' ');
        String newStr ;

        newStr = s.substring(index + 1);
        return newStr.length();
    }
}
