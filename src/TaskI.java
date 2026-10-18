import java.util.Scanner;

public class TaskI{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = 0;
        for(int i=1;i*i<=x;i++){
            if(x%i==0){
                if(i*i==x){
                    a+=1;
                } else {
                    a+=2;
                }
            }

        }
        System.out.println(a);
    }
}