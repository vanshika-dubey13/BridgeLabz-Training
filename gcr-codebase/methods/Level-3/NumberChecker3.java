//Creating a class to check if num is prime, neon, spy, automorphic, buzz number using methods.

public class NumberChecker3 {

	public static void isPrime(int n) {
		if (n <= 1) {
			System.out.println(n + " is not prime");
			return;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(n + " is not prime");
				return;
			}
		}
		System.out.println(n + " is prime");
	}

	public static void isNeon(int n) {
		int square = n * n;
		int sum = 0;
		while (square > 0) {
			sum += square % 10;
			square /= 10;
		}
		if (sum == n) {
			System.out.println(n + " is neon");
		} else {
			System.out.println(n + " is not neon");
		}
	}

	public static void isSpy(int n) {
		int temp = n;
		int sum = 0;
		int product = 1;
		while (temp != 0) {
			int digit = temp % 10;
			sum += digit;
			product *= digit;
			temp /= 10;
		}

		if (sum == product) {
			System.out.println(n + " is spy");
		} else {
			System.out.println(n + " is not spy");
		}
	}

	public static void isAutomorphic(int n) {
		int square = n * n;
		int temp = n;
		int digits = 0;
		while (temp > 0) {
			digits++;
			temp /= 10;
		}
		int lastDigits = square % (int) Math.pow(10, digits);
		if (lastDigits == n) {
			System.out.println(n + " is automorphic");
		} else {
			System.out.println(n + " is not automorphic");
		}
	}

	public static void isBuzz(int n) {
		if (n % 7 == 0 || n % 10 == 7) {
			System.out.println(n + " is a buzz number");
		} else {
			System.out.println(n + " is not a buzz number");
		}
	}

	public static void main(String[] args) {
		int num = 37;

		isPrime(num);
		isNeon(num);
		isSpy(num);
		isAutomorphic(num);
		isBuzz(num);
	}
}
