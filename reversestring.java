public class reversestring {
    public static void main(String[] args) {
        String s = "i am priyanshi kasaudhan";
        System.out.println(s);
        String ans="";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch!=' ') {
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.print(ans);
    }
}
