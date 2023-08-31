package ResultsGradingSystem;

public class gradingHub {
	int age = 25;


	public static void main(String[] args) {
		gradingHub obj= new gradingHub();
		//obj.ifelse();
		obj.Aleem();
		
		}
	public void ifelse() {
		if(age>18) {
			System.out.println("Adult");
			if (age>=100);
			System.out.println("need to check personally");
		}
		else if (age>0 && age<=18) {
		System.out.println("noy adult");
	} 
		else if(age>0 && age<18) {
		 System.out.println("Not Adult");
	 }
	}
		public void Aleem() {
			
			if  (age<18) {
				System.out.println("This person is not a voter");
			}
			else if (age>=18 && age<40) {
				System.out.println("This person is a young voter");
			}
			else if(age>=80 && age<=100) {
				System.out.println("This person is senior voter");
			}
				else {
					System.out.println("not a voter");
				}
			}
		}
		
		
	