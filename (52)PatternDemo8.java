
package javaapplication;

import java.util.Scanner;

public class PatternDemo8 {
    public static void main(String[] args) {
        int num,alfhabet=96;
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Line Number:");
        num=input.nextInt();
        for(int row=1;row<=num;row++)
        {
            for(int colum=1;colum<=row;colum++)
            {
                System.out.print((char)(alfhabet+row)+" ");
            }
          
            System.out.println("");
        }
    }
 
}
