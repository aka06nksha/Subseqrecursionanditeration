public class Skipstr {
    public static void main(String[] args) {
       String ans=skipApple("baccappleacd");
       System.out.println(ans);
    }
    public static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else{
            return s.charAt(0)+skipApple(s.substring(1));
        }

    }
    
}
