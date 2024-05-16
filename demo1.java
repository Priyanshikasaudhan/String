import java.util.Arrays;
public class demo1{
    public static void main(String[] args) {
        String str = "abcd";
        
        char[] a = str.toUpperCase().toCharArray();
        Arrays.sort(a);
        System.out.println(a);

    }
}