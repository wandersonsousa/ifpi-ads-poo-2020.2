package lista_04;

public class Postagem {
	int id;
	String texto;
	int curtidas;
	
	void curtir() {
		curtidas++;
	}
	
	@Override
	public String toString() {
		return "Texto: " + texto + " | curtidas: " + curtidas;
	}
}
