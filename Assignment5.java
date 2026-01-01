1.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int num =1; num<=50; num++) {
			sum = num + sum;
			
		}
		System.out.println(sum);

	}

}


2. package assignment_5;

public class Program2_countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int num = 45678;
		while(num>0) {
			total++;
			num = num/10;
		}
		System.out.println(total);
		

	}

}

3. package assignment_5;

public class Program3_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method 
        int fact = 1;
		int num = 6;
		for(int i =1; i<=num; i++) {
			fact = fact*i;
			
		}
		System.out.println(fact);

	}

}

4.package assignment_5;

public class Program4_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenDigits = 0;
		int oddDigits = 0;
		int num = 24879;
		while(num>0) {
			int lastDigit = num%10;
			if(lastDigit%2==0)
				evenDigits++;
		else
			oddDigits++;
		num = num/10;
		}
		System.out.println("EVEN:" + evenDigits);
		System.out.println("ODD:" + oddDigits);
		
	}
}
		

	
5.package assignment_5;

public class Program5_PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");

	}
		}

}
}
