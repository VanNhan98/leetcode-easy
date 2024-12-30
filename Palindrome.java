public class Palindrome {
    public static void main(String[] args) {
        int  x = 0;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
       if(x < 0 ) {
           return false;
       }
       int original = x;
       int reversed = 0;
       while(x > 0) {
           reversed = reversed * 10 +  x % 10;
           x /= 10;

       }
       if( original == reversed) {
           return true;
       }
        return false;
    }
}
