package ourFirstProject;

public class FirstClass {
	int a = 20;
	int b = 60;
	static int h = 70;
	static int y = 40;
	String student = "Ullah21221";


	public static void main(String[] args) {
		FirstClass obj = new FirstClass();
		obj.myFirstMethod();
		obj.AAA(10, 20);
		obj.BBB();
		FirstClass.JJJ();
		}
	
    public void myFirstMethod () {
        int a= 10;
        int b= 50;
        int c= a+b;
        System.out.println("The total is:"+ c);
    }
    public void AAA(int a, int b) {
    	int d = a+b;
    	System.out.println("My 2nd method results="+d);
    }
    public  void BBB () {
        int c = a+b;
        System.out.println("The total is:"+ c);
    }
     public static void JJJ() {
    	int I = h+y;
    	System.out.println("Just Print static value="+I);
    	
    }
            
}
