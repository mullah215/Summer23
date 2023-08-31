package homeLearn;

public class Grading {
	
public static void main(String[] args) {
	

		int marks = 99;
		if( marks<=40) {
			System.out.println("The Result is = F");
		}else if(marks>=0 && marks<=40) {
			System.out.println("The Result is = D");
		}else if(marks>=41 && marks<=50) {
			System.out.println("The Result is = C");
		}else if(marks>=51 && marks<=60) {
			System.out.println("The Result is = B-");
		}else if(marks>=61 && marks<=70) {
			System.out.println("The Result is = B");
		}else if(marks>=71 && marks<=80) {
			System.out.println("The Result is = B+");
		}else if(marks>=81 && marks<=85) {
			System.out.println("The Result is = A-");
		}else if(marks>=86 && marks<=90) {
			System.out.println("The Result is = A");
		}else if(marks>=91 && marks<=95) {
			System.out.println("The Result is = A+");
		}else if(marks>=96 && marks<=100) {
			System.out.println("The Result is = Golden A+");
		}
		else {
			System.out.println("Error");
		}
	
		}
        }


