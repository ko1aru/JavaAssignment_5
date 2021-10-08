import java.util.Scanner;
public class count_no_of_digits {

	public static void main(String[] args) {
		
		int num,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		while (num!=0) {
			num=num/10;
			count+=1;
		}
		System.out.println("Number of digits is: "+count);

	}

}
