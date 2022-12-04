package Week1.day1;

public class PrimeNumber {
	
	public void checkPrimeNumber(int n) {
		
		for(int i=2;i<=n-1;i++) {
			if(n%2==0) {
				System.out.println("Is Not a prime number!!!!!");
			}else
				System.out.println("Is a prime number!!!!!!");
			
		}
		
	}

	public static void main(String[] args) {
		PrimeNumber p=new PrimeNumber();
		p.checkPrimeNumber(2);
		
	}

}
