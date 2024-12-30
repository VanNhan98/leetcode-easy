public class b205IsomorphicStrings1 {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        char []a=new char[256];
        char []b=new char[256];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]=t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)]!=t.charAt(i)){
                return false;
            }
        }
        for(int i=0;i<s.length();i++){
            b[t.charAt(i)]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(b[t.charAt(i)]!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
