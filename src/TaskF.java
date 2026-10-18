import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int reverse = 0;
        while(x!=0){
            int a = x%10;
            reverse=reverse*10+a;
            x/=10;
        }
        System.out.println(reverse);


    }
}

