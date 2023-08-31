package hW;

public class Science extends main{
	void eng(){
		double science = 34;

	if(science<40) {
		System.out.println("F");
	}
	else if(science<0 && science>100) {
		System.out.println("Error");
	}
	else if(science<=40 && science>49) {
		System.out.println("D");
	}else if(science<=50 && science>59) {
		System.out.println("C");
	}else if(science<=60 && science>69) {
		System.out.println("B");
	}else if(science<=70 && science>79) {
		System.out.println("A-");
	}else if(science<=80 && science>89) {
		System.out.println("A");
	}
	else if(science<=90 && science>100) {
		System.out.println("A+");
	}

	}

}
