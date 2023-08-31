package IfElse;

public class sonagazi {
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	int f=20;
	static int q=25;
	static int w=35;
	static int k=45;
	

	public static void main(String[] args) {
		sonagazi obj=new sonagazi();
		obj.kamal();
		obj.faruq();
		obj.pijush(20,20,10);
		obj.prince();
		

	}
	public void kamal() {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int f= a+b+c-d;
		System.out.println("local variable result is="+f);
		
		
	}
	public void faruq() {
		int g=f+b-a;
		System.out.println("Instance or global variables results="+g);
	}
	public void pijush(int f, int b, int a) {
		int i=f-b+a;
		System.out.println("parameter variable result is ="+i);
	}
	public static void prince() {
		 int L=q=w=k;
		System.out.println("static variable result is="+L);
	}

}
