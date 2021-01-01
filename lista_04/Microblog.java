package lista_04;

public class Microblog {
	Postagem postagens[];
	int indice;
	
	Microblog(int tamanho) {
		postagens = new Postagem[tamanho];
	}
	
	void incluir(Postagem p) {
		if (indice < postagens.length) {
			postagens[indice] = p;
			indice++;
		} else {
			System.out.println("N�mero m�ximo de postagens excedido.");
		}
	}
	
	int consultarIndice(int id) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (postagens[i].id == id) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	void excluir(int id) {
		int posicao = consultarIndice(id);
		if (posicao != -1) {
			for (int i = posicao; i < indice; i++) {
				postagens[i] = postagens[i + 1];
			}

			indice--;
		}
	}

	Postagem retornarMaisCurtida() {
		Postagem maisCurtida = null;
		int curtidas = 0;
		
		for (int i = 0; i < indice; i++) {
			if (curtidas < postagens[i].curtidas) {
				curtidas = postagens[i].curtidas;
				maisCurtida = postagens[i];
			}
		}
		
		return maisCurtida;
	}
	
	void curtir(int id) {
		int idx = consultarIndice(id);
		if (idx != -1) {
			postagens[idx].curtir();
		}
	}
}
