public class b520DetectCapital {
    public static void main(String[] args) {
        String word = "NhAn";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) return true;
        if (word.equals(word.toLowerCase())) return true;
        if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) return true;
        return false;
    }
}
