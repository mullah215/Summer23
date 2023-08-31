package hW;

public class main {
	static double bangla = 44;
	static double math = 40;
	static double english = 40;
	static double chemistry = 50;
	static double average = (bangla+math+english+chemistry)/4;

	public static void main(String[] args) {
		English.em=new English();
		
		main obj = new main();
		System.out.println("Exam results average");
		System.out.println(average);
		
		if(average<40) {System.out.println("The REsult is = F");}
		else if(average>=40 && average<49) {System.out.println("The Result is D");}
		else if(average>=50 && average<59) {System.out.println("The Result is C");}
		else if(average>=60 && average<69) {System.out.println("The Result is B");}
		else if(average>=700 && average<79) {System.out.println("The Result is A-");}
		else if(average>=800 && average<899) {System.out.println("The Result is A");}
		else if(average>=90 && average<100) {System.out.println("The Result is ");}
		
		

	}

}
