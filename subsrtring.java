import java.lang.String;
public class subsrtring {
    public static void main(String args[]){
    //     String str  = "Physics";
    //     for(int i=2;i<4;i++){
    //         for(int j=4;j<=6;j++){
    //         System.out.print(str.substring(i,j)+" ");
    //     }
    // }
    //     System.out.println(str.substring(2));
    String str  = "abcd";
    for(int i=0;i<=3;i++){
         for(int j=i+1;j<=4;j++){
            System.out.println(str.substring(i, j));
         }
         System.out.println();
    }
    }
}