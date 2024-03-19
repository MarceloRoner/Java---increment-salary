package curso_java;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.Classes.Funcionario;

public class Main2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos funcionários serão lidos: ");
		int n = input.nextInt();
		input.nextLine();

		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário: " + (i + 1));
			System.out.println("ID: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.println("Nome: ");
			String nome = input.nextLine();
			System.out.println("Salário: ");
			double salario = input.nextDouble();
			input.nextLine();

			boolean idExist = false;
			for (Funcionario f : funcionarios) {

				if (f.getId() == id) {
					idExist = true;
					break;
				}
			}
			if (idExist == true) {
				System.out.println("Error: o ID informado já existe!");
				break;
			}
			funcionarios.add(new Funcionario(nome, id, salario));

		}
		System.out.println("Digite o ID do funcionário que irá receber algum aumento: ");
		int idAumento = input.nextInt();
		System.out.println("Agora, digite a porcentagem que irá aumentar, e calcularemos seu novo salário: ");
		double porcent = input.nextDouble();
		boolean encontrado = false;
		for (Funcionario f : funcionarios) {
			if (f.getId() == idAumento) {
				f.aumentarSalario(porcent);
				encontrado = true;
				break;
			}

		}
		if (encontrado = false) {
			System.out.println("Error! Id funcionário não encontrado. ");

		}
		System.out.println("Listagem de funcionários atualizada: ");

		for (Funcionario f : funcionarios) {
			System.out.printf("ID: %d, Name: %s , Salário: %.2f\n", f.getId(), f.getName(), f.getSalario());
		}

		input.close();

	}
}
