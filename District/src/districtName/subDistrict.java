package districtName;

public class subDistrict {
	int a = 10;
	int b = 20;
	int  c = 30;
	int d = 40;
	static int s=40;
	static int m=70;
	public static void main(String[]args) {
		subDistrict obj= new subDistrict();
		obj.Dhaka();
		obj.Chittagong();
		obj.cumilla(10,20);
		obj.sylhet();
		
	}
	public void Dhaka() {
		int a=10;
		int b=20;
		int c=30;
		int d=a+b+c;
		System.out.println("the First results="+d);
	}
	public void Chittagong() {
	     int e=a+b+c+d;
	System.out.println("the 2nd results ="+e);
	}
	public void cumilla(int a, int b) {
		int g=a+b;
		System.out.println("the 3rd results="+g);
	}
	public static void sylhet() {
		int b =s+m;
	
		System.out.println("the 4th results="+b);
	}
	
	

} 
