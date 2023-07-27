/* W.a.p to print Tribonacci Series */
// 0 1 2 3 6 11 20

import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int term,a=0,b=1,c=2,d;
        System.out.print("Enter term ");
        Scanner r=new Scanner(System.in);
        term=r.nextInt();
        for(int i=1;i<=term;i++)
        {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }

    }
}
