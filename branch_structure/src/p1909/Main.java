package p1909;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pen[] arr=new pen[3];
        int totalNum=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<3;i++){
            arr[i]=new pen();
            arr[i].num=sc.nextInt();
            arr[i].value=sc.nextInt();
            sc.nextLine();
        }
        int minCost=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            int temp=totalNum%arr[i].num==0?totalNum/arr[i].num:totalNum/arr[i].num+1;
            temp*=arr[i].value;
            if(temp<minCost){
                minCost=temp;
            }
        }
        System.out.println(minCost);

    }
    static class pen{
        public int num;
        public int value;
    }
}
