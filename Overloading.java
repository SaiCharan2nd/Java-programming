class MyClass{
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
}
class Overloading{
	public static void main(String[] args){
		MyClass obj = new MyClass();
		System.out.println(obj.add(2,3));
		System.out.println(obj.add(2,3,4));
	}
}

	
