class MyClass{
	public int a,b,c;
	MyClass(int x,int y,int z){
		a = x;
		b = y;
		c = z;
	}
	MyClass(){
		a = 0;
		b = 0;
		c = 0;
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class ConsOverloading{
	public static void main(String[] args){
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass(1,2,3);
		obj1.display();
		obj2.display();
	}
}
