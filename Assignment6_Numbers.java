1.  Replace Number at Odd

package assignment_6;

public class Program1_ReplaceNumberAtOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5678;
		int newnum = 0;
		int count = 0;
		while(num>0) {
			count++;
			int lastDigit = num%10;
			if(count ==2)
				newnum =lastDigit*10+newnum;
			else if(count ==4)
				newnum = lastDigit*1000+newnum;
			num = num/10;
		}
		System.out.println(newnum);

	}

}



2. Trailing Zeroes

package assignment_6;

public class Program2_AddTrailingZeroes {

	public static void main(String[] args) {
		int num = 123;   

        if (num < 10) {
            num = num * 10;
        } else if (num < 100) {
            num = num * 100;
        }

        System.out.println(num);
	}

}

3. Add digits

package assignment_6;

public class Program3_SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 542;
		int sum = 0;
		while(num>0) {
	            int digit=num % 10;
	            sum = sum + digit;    
	            num = num/10;
	        }
         System.out.println(sum);

	}

}


