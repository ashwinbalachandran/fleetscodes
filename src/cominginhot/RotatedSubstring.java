package cominginhot;

public class RotatedSubstring {
    public static void main(String[] args) {
//        String s1 = "12345",s2 = "34517";
//        int i ,j;
//        String a="", b="";
//        for(i = 0 ; i<s1.length();){
//            for(j = 0;j<s2.length();){
//                if(s1.charAt(i) != s2.charAt(j)){
//                    a = a+s1.charAt(i);
//                    ++i;
//                }
//                else{
//                    b = s1.substring(i);
//                    String n = b+a;
//                    if(n.equals(s2)) {
//                        System.out.println("Fucks");
//                        break;
//                    }
//                }
//            }
//        }
        System.out.println(isRotation("12345","34512"));
    }

    public static boolean isSubstring(String S1, String S2){
        return S1.contains(S2);
    }

    public static boolean isRotation(String S1, String S2){
        String firstCombined = S1+S1;
        return isSubstring(firstCombined,S2);
    }
}
