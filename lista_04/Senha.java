package lista_04;

public class Senha {
    public String valor = "senhaforte";
    public Boolean iguais( String valor ){
        return valor == this.valor;
    }
    public Boolean iguaisTrim( String valor ){
        return valor.trim() == this.valor.trim();
    }
    public Boolean tamanhoSeguro(){
        if( valor.length() > 6 ){
            return true;
        }
        return false;
    }
    public Boolean possuiMaiusculaMinuscula(){
        Boolean hasUpperCase = false; 
        Boolean hasLowCase = false;

        for (char ch: this.valor.toCharArray()) {
            int charCode = (int) ch; 
            if( charCode >= 97 && charCode <= 122){
                if( hasUpperCase )return true;
                hasLowCase = true;
            }
            if( charCode >= 65 && charCode <= 90 ){
                if( hasLowCase )return true;
                hasUpperCase = true;
            }
        }
        return false;
    }
    public Boolean possuiNumero(){
        for (char ch: this.valor.toCharArray()) {
            int charCode = (int) ch;
            if( charCode >= 48 && charCode <= 57){
                return true;
            }
        }
        return false;
    }
    public Boolean ehValida(){
        if( this.tamanhoSeguro() && this.possuiMaiusculaMinuscula() && this.possuiNumero() ){
            return true;
        }
        return false;
    }

}
