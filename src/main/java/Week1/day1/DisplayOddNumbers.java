package Week1.day1;

public class DisplayOddNumbers {
	public static void main(String[] args) {
		int number =20;
		System.out.println("list of even numbers" + number +":");
		for(int i=1; i>=number; i--) {
			if(i%2==0) {
				System.out.println(i+"");
			}
		}
	}

}
