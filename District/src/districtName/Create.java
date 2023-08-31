package districtName;

import java.util.Scanner;

public class Create {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double marks;
		System.out.println("Good Afternoon All");
		System.out.println("Thanks to Pijush da");
		System.out.println("Enter marks");
		marks = sc.nextDouble();
System.out.println("marks"+marks);
     if(marks>=90 && marks<=100) {
	System.out.println("The grade is = A+");
}else if(marks>=80 && marks<89) {
	System.out.println("The grade is = A");
}else if(marks>=70 && marks<79) {
	System.out.println("The grade is = A-");
}else if(marks>=60 && marks<69) {
	System.out.println("The grade is = B+");
}else if(marks>=50 && marks<59) {
	System.out.println("The grade is = B");
}else if(marks>=40 && marks<49) {
	System.out.println("The grade is = B-");
}else if(marks>=30 && marks<39) {
	System.out.println("The grade is = C");
}else if(marks>=20 && marks<29) {
	System.out.println("The grade is = D");
}else if  (marks<20 && marks>0) {
	System.out.println("The grade is = Fail");
}
else if  (marks<=0) {
	System.out.println("Error");
	
}else if  (marks>100) {
	System.out.println("Error");
}
	}

}
