import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum = 0;
        while(x!=0){
            int a = x%10;
            sum+=a;
            x/=10;
        }
        System.out.println(sum);


    }
}
