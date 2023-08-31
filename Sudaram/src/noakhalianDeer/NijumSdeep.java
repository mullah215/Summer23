package noakhalianDeer;

public class NijumSdeep {
	int a = 10;
	int b = 30;
	int c = 50;
	int d = 60;
	int f = 120;
	static int k =100;
	static int l = 120;
	public static void main(String[]args) {
		NijumSdeep obj = new NijumSdeep();
		obj.myFirstMethod();
		obj.hatiya(10, 50);
		obj.companygonj(50,60);
		obj.senbag();
		obj.feni(10,50,60);
		obj.fulgazi();
		obj.kabirhat();
		obj.ifTest();
	

}
	public void myFirstMethod() {
		int a = 10;
		int b = 30;
		int c = a+b;
		System.out.println("the total is"+ c);
}
	public void hatiya(int a, int c) {
			int d = a+c;
			System.out.println("my 2nd results="+d);
}
	public void companygonj(int c, int d) {
		int e = c+d;
		System.out.println("my 3rd results="+e);
}
	public void senbag() {
		int d = a+c;
		System.out.println("my 3rd results="+d);
}
	public void feni(int a, int c, int d) {
		int  f = a+c+d;
		System.out.println("my 4th results="+f);
}
	public void fulgazi() {
		int g = b+d+f;
		System.out.println("my 5th results"+g);
}
	public static void kabirhat() {
		int h=k+l;
		System.out.println("my 6th results "+h);
	}
	public void ifTest() {
		int age= 10;
		if(age>18) {
			System.out.println("Adult");
		}
	}
	
} 