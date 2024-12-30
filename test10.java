//import java.util.HashMap;
//import java.util.Scanner;
//
//public class test10 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print(MinWindowSubstring(s.nextLine()));
//    }
//
//    public static String MinWindowSubstring(String[] strArr) {
//        String n = strArr[0]; // Chuỗi N
//        String k = strArr[1]; // Chuỗi K
//
//        // Đếm tần suất các ký tự trong K
//        HashMap<Character, Integer> kFrequencyMap = new HashMap<>();
//        for (char c : k.toCharArray()) {
//            kFrequencyMap.put(c, kFrequencyMap.getOrDefault(c, 0) + 1);
//        }
//
//        // Các biến cần thiết
//        HashMap<Character, Integer> windowMap = new HashMap<>();
//        int left = 0;
//        int right = 0;
//        int matchCount = 0;
//        int minLength = Integer.MAX_VALUE;
//        int minStart = 0;
//
//        // Duyệt qua N bằng con trỏ phải
//        while (right < n.length()) {
//            char rightChar = n.charAt(right);
//            if (kFrequencyMap.containsKey(rightChar)) {
//                windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);
//                if (windowMap.get(rightChar).intValue() == kFrequencyMap.get(rightChar).intValue()) {
//                    matchCount++;
//                }
//            }
//
//            // Khi đã thỏa mãn tất cả các ký tự trong K
//            while (matchCount == kFrequencyMap.size()) {
//                // Kiểm tra độ dài đoạn con hiện tại
//                if (right - left + 1 < minLength) {
//                    minLength = right - left + 1;
//                    minStart = left;
//                }
//
//                // Thu nhỏ cửa sổ từ bên trái
//                char leftChar = n.charAt(left);
//                if (kFrequencyMap.containsKey(leftChar)) {
//                    if (windowMap.get(leftChar).intValue() == kFrequencyMap.get(leftChar).intValue()) {
//                        matchCount--;
//                    }
//                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
//                }
//                left++;
//            }
//
//            right++;
//        }
//
//        // Trả về kết quả
//        return minLength == Integer.MAX_VALUE ? "" : n.substring(minStart, minStart + minLength);
//    }
//
//}
