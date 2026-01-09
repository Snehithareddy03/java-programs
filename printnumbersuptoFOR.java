import java.util.Scanner;
public class printnumbersuptoFOR{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a value:");
		int n = input.nextInt();
		for(int count = 1; count <= n; count++){
		System.out.println(count + " ");
		}
	}
}