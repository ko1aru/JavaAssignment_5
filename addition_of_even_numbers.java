import java.util.Scanner;

public class addition_of_even_numbers {

	public static void main(String[] args) {
		
		int n,i,x,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		n = sc.nextInt();
		System.out.println("The even numbers are:");
		for (i=1;i<=n;i++) {
			x=2*i;
			System.out.println(x);
			sum=sum+x;
		}
		System.out.println("The sum of the "+n+" even numbers is: "+sum);

	}

}
