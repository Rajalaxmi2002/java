import java.util.Scanner;
class Complex
{
int rp,ip;
Complex(int r,int i)
{
rp=r;
ip=i;
}
void sum(Complex c1,Complex c2)
{
int rsum=c1.rp+c2.rp;
int isum=c1.ip+c2.ip;
System.out.println(rsum+"+"+isum)
}
Public class Complex_program
{
Public static void main(String []args)
{
Scanner sc=new Scanner(System.in)
System.out.println("enter the first number");
System.out.println("enter real part");
int frp=sc.nextInt();
System.out.println("enter imaginary part");
int fip=sc.nextInt();
Sysytem.out.println(frp+"+"+fip+"i");
System.out.println("enter the second number");
System.out.println("enter real part");
int srp=sc.nextInt();
System.out.println("enter imaginary part");
int sip=sc.nextInt();
Sysytem.out.println(srp+"+"+sip+"i");
Complex c1=new Complex(frp,fip)
Complex c2=new Complex(srp,sip)
System.out.println("after addition");
c1.sum(c1,c2);
}
}

enter the first number
enter real part
4
enter imaginary part
6
4+6i
enter the second number
enter real part
7
enter imaginary part
9
7+9i
after addition
11+15i
