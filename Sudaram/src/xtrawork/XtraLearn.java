package xtrawork;
import java.util.Scanner;

public class XtraLearn {
	static Scanner kle=new Scanner(System.in);
	static int marks;
	 static Double a,b,c,d,e;
    marks=kle.nextint();
	public static void main(String[] args) {
	XtraLearn obj=new XtraLearn();
	
	if (marks<40 && marks>=0) {
		System.out.println("F");
	}
	else if (marks<50 && marks>=40) {
		System.out.println("D");
	}else if (marks<60 && marks>=50) {
		System.out.println("C");
	}
	else if (marks<70 && marks>=60) {
		System.out.println("B");
	}else if (marks<80 && marks>=70) {
		System.out.println("A-");
	}else if (marks<90 && marks>=80) {
		System.out.println("A");
	}else if (marks<=100 && marks>=90) {
		System.out.println("A+");
	}else {
		System.out.println("Error");
	}
	}

}
