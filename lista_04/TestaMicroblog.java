package lista_04;

public class TestaMicroblog {

	public static void main(String[] args) {
		Postagem p1 = new Postagem();
		p1.id = 1;
		p1.texto = "feliz ano novo";
		p1.curtir();
		
		Postagem p2 = new Postagem();
		p2.id = 2;
		p2.texto = "happy new year";
		p2.curtir();
		p2.curtir();
		
		Microblog m = new Microblog(2);
		m.incluir(p1);
		m.incluir(p2);
		
		System.out.println(m.retornarMaisCurtida().texto);

	}

}
