package lista_04;

/**
 * Main
 */
public class TesteSenha {

    public static void main(String[] args) {
        Senha senha = new Senha();
        
        // System.out.println( senha.possuiMaiusculaMinuscula() );
        // System.out.println( senha.possuiNumero() );
        senha.valor = "Senha1MuitoForte01";
        System.out.println( senha.ehValida() );
    }
}