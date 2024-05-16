public class stringBulder {
    public static void main(String[] args) {
        StringBuilder str =  new StringBuilder("Hello");
        System.out.println(str);
        str.setCharAt(0,'M');
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);
    }
}
