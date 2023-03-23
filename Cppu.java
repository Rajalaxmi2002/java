class Cppu
{
int price;
  static class processor
{
int cores;
String producer;
processor(int noc,String manu)
{
cores=noc;
producer=manu;
}
void display()
{
System.out.println("\n processor information");
System.out.println("no.of cores="+cores);
System.out.println("manufacture="+producer);
}
}
class Ram
{
int mem;
String manuf;
Ram(int memory,String producer)
{
mem=memory;
manuf=producer;
}
void display()
{
System.out.println("\n ram information");
System.out.println("memory="+manuf);
System.out.println("manufacture="+manuf);
}}
public static void main(String[] args)
{
Cppu.processor obj1=new Cppu.processor(8,"intel");
Cppu obj2=new Cppu();
Cppu.Ram obj3=obj2.new Ram(8,"samsung");
obj1.display();
obj3.display();
}
}

