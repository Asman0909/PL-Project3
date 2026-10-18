import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = 2;
        while(x%a!=0){
            a++;
        }

        System.out.println(a);


    }
}
