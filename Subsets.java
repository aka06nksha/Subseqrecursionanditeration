public class Subsets{
      public static void main(String[] args) {
         String s="abc";
         int i=0,j=0;
           while(i<s.length()){
              j=i+1;
              while(j<=s.length()){
                System.out.println(s.substring(i, j));
                j++;
              }
             i++;
      }
    }
}
