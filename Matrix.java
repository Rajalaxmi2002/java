import java.util.Scanner;
class Matrix
{
public static void main(String[]args)
{
int row,col,i,j;
Scanner in=new Scanner(System.in);
System.out.println("enter the number of row: ");
row=in.nextInt();
System.out.println("enter the number column");
col=in.nextInt();
int met1[][]=new int[row][col];
int met2[][]=new int[row][col];
int res[][]=new int[row][col];

System.out.println("enter the element of matrix 1:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
met1[i][j]=in.nextInt();
}

System.out.println("enter the element of matrix 2:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
met2[i][j]=in.nextInt();
}

for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
res[i][j]=met1[i][j]+met2[i][j];
}

System.out.println("sum of matrices : ");
for(i=0; i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(res[i][j]+"\t");
}
System.out.println();
}
}
}

