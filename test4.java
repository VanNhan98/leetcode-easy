import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test4 {
    public static void main(String[] args) {
        String[] strArr =new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
        System.out.println(FindIntersection(strArr));
    }

    public static String FindIntersection(String[] strArr) {
        String[] arr = strArr[0].split(",");
        String[] arr1 = strArr[1].split(",");
        Set<String> set = new HashSet<>();
        for(String str : arr) {
            set.add(str);
        }

        List<String> list = new ArrayList<>();
        for(String str : arr1) {
            if(set.contains(str)) {
                list.add(str);
            }
        }
        if (list.isEmpty()) {
            return "false"; // Trả về "false" nếu không có phần tử giao nhau
        } else {
            return String.join(",", list); // Nối các phần tử với dấu phẩy
        }

    }
}
