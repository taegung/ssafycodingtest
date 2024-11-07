import java.util.*;
public class sw3143 {
    public static void main(String[] args){

        Scanner in =new Scanner(System.in);
        int T = in.nextInt();
        for(int i=1;i<T+1;i++) {
            String A = in.next();
            String B = in.next();
            A = A.replace(B, " ");
            int lenth = A.length();
            System.out.println("#"+i+" "+lenth);

        }
    }

}
