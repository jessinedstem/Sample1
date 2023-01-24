package com.edstem.learning;

import java.util.Scanner;
public class multiplication {
    public static void main(String[] args){
        //Multiplication table from 1 to 10
                for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println("\n");
        }
    }
}
   /*        int num,limit;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            num=scan.nextInt();
            System.out.println("Enter the limit");
            limit=scan.nextInt();
            scan.close();
            int i=1;
            while(i<=limit){
                System.out.println(num+"*"+i+"="+i*num);
                i++;
            }

        }
}*/
//table 2to 10
 /*  int[][]arr=new int[9][10];
   int k;
   for(int m=2;m<=10;m++) {
       for (k = 1; k <= 10; k++) {
         arr[m-2][k-1]=m*k;
           }
              }
       for (int[] x : arr) {
           for (int y : x) {
               System.out.println(y);
           }
           System.out.println("\n");
       }
   }}*/

