package one_and_two;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t;
        t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            int n;
            n=sc.nextInt();
            sc.nextLine();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            sc.nextLine();
            int[] record=new int[n];
            if(arr[0]==2){
                record[0]=1;
            }else{
                record[0]=0;
            }
            for(int j=1;j<n;j++){
                if(arr[j]==2){
                    record[j]=record[j-1]+1;
                }else{
                    record[j]=record[j-1];
                }
            }
            int flag=0;
            for(int j=0;j<n-1;j++){
                if(record[j]==(record[n-1]-record[j])){
                    System.out.println(j+1);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(-1);
            }
        }
    }
}
