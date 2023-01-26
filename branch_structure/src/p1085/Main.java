package p1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=1;
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        sc.nextLine();
        int max=n1+n2;
        for(int i=2;i<=7;i++){
            n1=sc.nextInt();
            n2=sc.nextInt();
            sc.nextLine();
            if(n1+n2>max){
                max=n1+n2;
                ans=i;
            }
        }
        if(max>8){
            System.out.println(ans);
        }else{
            System.out.println(0);
        }
    }
}
