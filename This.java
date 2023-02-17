class MyClass{
	public int a,b;
	MyClass(int a,int b){
		this.a = a;
		this.b = b;
	}
	public void display(){
		System.out.println(a);
		System.out.println(b);
	}
}
class This{
	public static void main(String[] args){
		MyClass obj = new MyClass(3,4);
		obj.display();
	}
}

