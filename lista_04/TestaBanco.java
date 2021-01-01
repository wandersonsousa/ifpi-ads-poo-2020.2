package lista_04;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco(2);
		Conta c1 = new Conta("1", 500);
		banco.inserir(c1);
		
		Conta c2 = new Conta("2", 100);
		banco.inserir(c2);

		Conta c3 = new Conta("3", 100);
		banco.inserir(c3);

		banco.creditar("1", 100);
		System.out.println(c1.saldo);
		banco.creditar("4", 100);
		
		banco.transferir("1", "4", 10);
		banco.transferir("1", "2", 600);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		banco.creditar("1", 100);
		System.out.println("Contas cadastradas: " + banco.retornaQuantidade());
		System.out.println("Total de valores: " + banco.retornaValorTotal());
		System.out.println("M�dia de valores: " + banco.retornaMediaValores());
	}
}
