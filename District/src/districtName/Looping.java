package districtName;

public class Looping {

	public static void main(String[] args) {
		Looping obj = new Looping();
		obj.firstLoop();

	}
public void firstLoop() {
	int i;
	for( i=1; i<30; i=i+1) {
		if(i%2==0) {
			System.out.println("This is a an even number"+i);
		}else {
			System.out.println("This is a an odd number\"+i");
		}
		if(i==7) {
				System.out.println("Got the lucky number="+i);
				break;
			}
		}
		
		
		
}}