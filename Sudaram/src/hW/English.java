package hW;

public class English extends main{
	void eng(){
		double english = 34;

	if(english<40) {
		System.out.println("F");
	}
	else if(english<0 && english>100) {
		System.out.println("Error");
	}
	else if(english<=40 && english>49) {
		System.out.println("D");
	}else if(english<=50 && english>59) {
		System.out.println("C");
	}else if(english<=60 && english>69) {
		System.out.println("B");
	}else if(english<=70 && english>79) {
		System.out.println("A-");
	}else if(english<=80 && english>89) {
		System.out.println("A");
	}
	else if(english<=90 && english>100) {
		System.out.println("A+");
	}

	}

}
