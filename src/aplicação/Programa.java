package aplicação;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitadades.ProdutoImportado;
import entitadades.ProdutoUsado;
import entitadades.Produtos;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produtos> prod = new ArrayList<>();

		System.out.println("Quantos produtos: ");

		int quant = sc.nextInt();

		for (int i = 0; i < quant; i++) {

			System.out.println("produto " + (i + 1) + " dados: ");
			System.out.println("comum, usado ou importado? (c - comum; u - usado; i - importado.");
			char escolha = sc.next().charAt(0);

			switch (escolha) {
			case 'c':
				System.out.println("nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("preço: ");
				double price = sc.nextDouble();
				prod.add(new Produtos(name, price));
				break;

			case 'u':
				System.out.println("nome: ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("preço: ");
				price = sc.nextDouble();
				System.out.println("data de fabicação: (dd/mm/aaaa)");
				int dia = sc.nextInt();
				int mes = sc.nextInt();
				int ano = sc.nextInt();
				prod.add(new ProdutoUsado(name, price, LocalDate.of(ano, mes, dia)));

				break;

			case 'i':
				System.out.println("nome: ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("preço: ");
				price = sc.nextDouble();
				System.out.println("taxa alfandegária: ");
				double taxaAlfandega = sc.nextDouble();
				prod.add(new ProdutoImportado(name, price, taxaAlfandega));
				break;
			}

		}
		for (int i = 0; i < prod.size(); i++) {
			System.out.println(prod.get(i).etiquetaPreco());
		}

		sc.close();
	}

}
