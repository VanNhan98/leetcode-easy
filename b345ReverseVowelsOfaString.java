public class b345ReverseVowelsOfaString {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
//        char[] c = s.toCharArray();
//        int l = 0;
//        int r = s.length() - 1;
//        String v = "aeiouAEIOU";
//        while (l < r) {
//            while (l < r && v.indexOf(c[l]) == -1) {
//                l ++;
//            }
//
//            while (l < r && v.indexOf(c[r]) == -1) {
//                r--;
//            }
//            if(l < r) {
//                char temp = c[l];
//                c[l] = c[r];
//                c[r] = temp;
//                l++;
//                r--;
//            }
//        }
//        return String.valueOf(c);
        // Tìm nguyên âm và đảo ngược chúng
        StringBuilder vowels = new StringBuilder();
        String vowelsSet = "aeiouAEIOU";


        for (char c : s.toCharArray()) {
            if (vowelsSet.indexOf(c) != -1) {
                vowels.append(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int vowelIndex = vowels.length() - 1;

        for (char c : s.toCharArray()) {
            if (vowelsSet.indexOf(c) != -1) {

                result.append(vowels.charAt(vowelIndex));
                vowelIndex--;
            } else {
                // Thêm ký tự không phải nguyên âm
                result.append(c);
            }
        }

        return result.toString(); // Trả về chuỗi đã chỉnh sửa
    }
}
