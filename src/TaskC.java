import java.util.Scanner;

public class TaskC{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int root = (int) Math.ceil(Math.sqrt(Math.max(0, a)));
        while(root*root<=b){
            int d =root*root;
            if(d%root==0){
                System.out.println(d);
            }
            root++;
        }

    }

        }