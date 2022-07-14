import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời nhập vào số n: ");
		int n = Integer.parseInt(scan.nextLine());
		int count = countNumberDivisible3UsedWhile(n);
		System.out.println("Có " + count + " từ 0 đến " + n + " divisible 3");
	}

	public static int countNumberDivisible3(int n) {
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0) {
				dem++;
			}
		}
		return dem;
	}

	public static int countNumberDivisible3UsedWhile(int n) {
		int count = 0;
		int i = 0;
		while (i < n) {
			if (i % 3 == 0) {
				count++;
			}
			i++;
		}
		return count;
	}
}
