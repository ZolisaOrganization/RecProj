/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recproj;

import java.util.Scanner;

/**
 *
 * @author KHANYA_YOLANDA
 */
public class RecProj {
    static Scanner input=new Scanner(System.in);
    public static int factIter(int n1){
    int r=0;
    if(n1>0){
        r=1;
    for(int i=1;i<=n1;i++){
            r=r*i; 
        }
    }
    return r;
}
    public static int factRec(int n1){
        if ((n1==0)|| (n1==1)){
            return 1;
    }
        else{
            return(n1 + factRec(n1-1));
    }     
}
    public static void main(String []args){
        while(true){
            String mess="\nPositive integer please";
            System.out.println(mess);
             String s=input.next();
            int n=Integer.parseInt(s);
            if(((s.isEmpty()==false)&&(n>=0))==true){
                n=Integer.parseInt(s);
                int i=factIter(n);
                int r=factRec(n);
                String ms="factorial of "+" "+n+" "+ "iterative is" +" "+i+ "; "+"recursive is " +" "+r; 
                System.out.println(ms);
            }
        }
    }
}
