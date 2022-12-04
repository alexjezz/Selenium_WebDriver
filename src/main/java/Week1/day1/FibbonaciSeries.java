package Week1.day1;

public class FibbonaciSeries {
			public void printFib(int n) {
			int number1=0,number2=1,sum=0;
			 
			System.out.print(number1+ " ");
			System.out.print(number2+ " ");
			for(int i=0; i<11;i++)
			{
				sum=number1+number2;
				number1=number2;
				number2=sum;
				System.out.print(sum + " ");
			}

		}

		public static void main(String[] args) {
			FibbonaciSeries fb=new FibbonaciSeries();
			fb.printFib(11);
		}

}


