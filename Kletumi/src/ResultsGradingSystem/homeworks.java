package ResultsGradingSystem;

public class homeworks {
	int marks =80;

	public static void main(String[] args) {
		homeworks obj = new homeworks();
		obj.kalam();
		
		

	}
	public void kalam() {

		if(marks<40) {
			System.out.println("Fail");
			
		}
		else if (marks>40 && marks<50) {
			System.out.println("B-");
		}
		else if (marks>50 && marks<60) {
			System.out.println("B");
		}
		else if (marks>60 && marks<70) {
			System.out.println("B+");
		}
		else if (marks>70 && marks<80) {
			System.out.println("A-");
		}
		else if (marks>80 && marks<90) {
			System.out.println("A");
		}
		else if (marks>90 && marks<=100) {
			System.out.println("A+");
		}
		
		
}
}
