package noakhalianDeer;

public class Practice {
	int a=20;
	int b=30;
	int c=40;
	int e=24;
	int d= 100;
	static int p=120;
	static int q=200;


	public static void main(String[] args) {
		Practice obj=new Practice();
		obj.kle();
		obj.tumi();
		obj.kletumi(50, 30, 80);
		obj.letumi();
System.out.println("Hi this is mo, try to learn Java at old age");
	}

	public void kle() {
		int a=10;
		int b=20;
		int c= a+b;
		int d=a*c;
		int e=c/a;
		System.out.println("The results for local c ="+c );
		System.out.println("The results for local d ="+d );
		System.out.println("The results for local e ="+e );
		
	}
	public void tumi() {
		int g=a*b;
		int h=c/a;
		int i=e-c;
		int f= d+e;
		System.out.println("The results for global g="+g);
		System.out.println("The results for global h="+h);
		System.out.println("The results for global i="+i);
		System.out.println("The results for global f="+f);
		
	}
	public void kletumi(int a, int b, int c) {
		int k=a*b*c;
		int l=k-(b*c);
		System.out.println("The results for parameters k="+k);
		System.out.println("The results for parameters l="+l);
		
		}
	public static void letumi() {
		int R=p*q;
		int n=p+q;
		System.out.println("The results for static R="+R);
		System.out.println("The results for static n="+n);
	}

}
