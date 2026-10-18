import java.util.Scanner;

public class TaskJ{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        for(int i=0;i<100;i++){
            int b = in.nextInt();
            a+=b;
        }
        System.out.println(a);

    }
}
