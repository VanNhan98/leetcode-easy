public class b476NumberComplement {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }

    public static int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
       while(num  > 0) {
           int lastBit =  num % 2;
           sb.append(lastBit == 0 ? 1 : 0);
           num = num / 2;

       }
        return Integer.parseInt(sb.reverse().toString(),2);

    }
}
