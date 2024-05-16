import java.lang.String;
public class immutability {
    public static void main(String[] args) {
        String s = "HEllO";
        s = s.substring(0,3) + 'Q' + s.substring(4);
        System.out.println(s);
    }
}
