public class Str {
    public static void main(String[] args) {
        String s="baccaaada";
        String a=removea(s," ",0);
        System.out.println(a);
    }
    public static String removea(String s,String ans,int i){
         if(i==s.length()){
            return ans;
         }
         if(s.charAt(i)!='a'){
            ans+=s.charAt(i);
         }
         return removea(s,ans,i+1);
    }
}
