public class MyString {
    
    // FIX: Removed the extra opening brace from the original code
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println("unhappy, happy: " + contains("unhappy", "happy")); // true
        System.out.println("happy, unhappy: " + contains("happy", "unhappy")); // false
        System.out.println("historical, story: " + contains("historical", "story")); // false
        System.out.println("psychology, psycho: " + contains("psychology", "psycho")); // true
        System.out.println("personality, son: " + contains("personality", "son")); // true
        System.out.println("personality, dad: " + contains("personality", "dad")); // false
        System.out.println("resignation, sign: " + contains("resignation", "sign")); // true
    }

    public static String lowerCase(String str) {
         int length= str.length();
         String lower = "";
         for (int i=0; i<length;i++){
            if((Character.isUpperCase(str.charAt(i)))){
                char c= str.charAt(i);
                c = (char) (c+32);
                lower += c;
            }
            else{
                char c = str.charAt(i);
                lower += c;
            }
         }
        return lower;
    }

    public static boolean contains(String str1, String str2) {
        
        if (str2.length() == 0) {
            return true;
        }
        if (str1.length() < str2.length()) {
            return false;
        }
        int n1 = str1.length();
        int n2 = str2.length();
        for (int i = 0; i <= n1 - n2; i++) {
            boolean match = true;
            for (int j = 0; j < n2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {                    
                    match = false;
                    break; 
                }
            }
            
            if (match) {
                return true; 
            }
        }
        return false;
    }
}