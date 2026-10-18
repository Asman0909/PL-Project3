import java.util.Scanner;

public class TaskN{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int zero = 0;
        int pos = 0;
        int neg = 0;
        for(int i=0;i<n;i++){
            int b = in.nextInt();
            if(b==0){
                zero+=1;
            }
            if(b>0){
                pos+=1;
            }
            if(b<0){
                neg+=1;
            }
        }
        System.out.print(zero+" "+pos+" "+neg+" ");
    }
}