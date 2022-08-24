import java.util.Scanner;
public class Prime{
	public static void checkPrime(int n){
		int i , flag=0;
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				flag++;
				break;
			}
		}
		if(flag==0)
		System.out.println("Given Number is prime");
		else
		System.out.println("Given Number is not prime");
	}
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number do you want to check prime");
		int n=sc.nextInt();
		checkPrime(n);
	}
}
