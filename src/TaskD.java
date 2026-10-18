import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int d = in.nextInt();
        int count = 0;
        while(x!=0){
            int a =x%10;
            if(a==d){
                count++;
            }
            x/=10;
        }
        System.out.println(count);

    }
}
