import java.util.Scanner;
public class addition_of_odd_nums {

	public static void main(String[] args) {
		int n,i,x,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		n = sc.nextInt();
		System.out.println("The odd numbers are:");
		for (i=1;i<=n;i++) {
			x=2*i-1;
			System.out.println(x);
			sum=sum+x;
		}
		System.out.println("The sum of the "+n+" odd numbers is: "+sum);
	}
}
