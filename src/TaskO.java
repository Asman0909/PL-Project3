import java.util.Scanner;

public class TaskO{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean t = false;
        for(int i=0;i<n;i++) {
            int b = in.nextInt();
            if(b==0) {
                t = true;
            }
        }
            if(t){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
    }
}