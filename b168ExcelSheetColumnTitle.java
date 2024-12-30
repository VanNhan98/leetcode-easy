public class b168ExcelSheetColumnTitle {
    public static void main(String[] args) {
            int columnNumber = 28;
            System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char remainder = (char) ('A' + (columnNumber % 26));
            result.append(remainder);
            columnNumber /= 26;
        }

        return result.reverse().toString();  // Đảo ngược chuỗi kết quả

    }
}
