
public class DesafioFatorial {
	public static void main(String[] args) {
		int n = 1;
		System.out.println("O fatorial de 0 é: " + n);

		for (int i = 0; i <= 10; i++) {
			if (i == 0)
				continue;
			System.out.print("O Fatorial de " + i + " é: ");
			n *= i;
			System.out.println(n);
		}
	}
}