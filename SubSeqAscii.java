public class SubSeqAscii {
    public static void main(String[] args) {
        String s="abc";
        subSeqAscii(" ",s);
    }
    public static void subSeqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSeqAscii(p+ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p+(ch+0), up.substring(1));
    } 
}
