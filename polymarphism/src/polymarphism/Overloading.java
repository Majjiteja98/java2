package polymarphism;

class Teja
{
void add(int x, int y)
{
int sum=x+y;
System.out.println("sum of 2 ints:" +sum);
}
void add(int x, int y,int z)
{
int sum=x+y+z;
System.out.println("sum of 3 ints:" +sum);
}
}
class Overloading 
{
	public static void main(String[] args)
{
Teja obj=new Teja();
obj.add(10, 20);
obj.add(10, 20, 30);
}
}
