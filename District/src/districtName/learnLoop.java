package districtName;

public class learnLoop {

	public static void main(String[] args) {
		learnLoop obj = new learnLoop();
		obj.Loop();
	}
	public void Loop() {
		int i;
		for(i=1; i<100; i++) {
			if(i%5==0) {
				System.out.println("Red = "+i);
			}
			else if(i%3==0){
				System.out.println("Yellow = "+i);
				
			}else if(i%4==0) {
				System.out.println("green ="+i);
			}
			
		}
		
}
}