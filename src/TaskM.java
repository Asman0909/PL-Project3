import java.util.Scanner;

public class TaskM{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int zero = 0;
        for(int i=0;i<n;i++){
            int b = in.nextInt();
            if(b==0){
                zero+=1;
            }
        }
        System.out.println(zero);
    }
}

