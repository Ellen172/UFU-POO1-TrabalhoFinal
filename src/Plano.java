import java.io.Serializable;

public class Plano implements Serializable{
    private String nome_plano;
    private String cnpj;

    Plano(String n, String c){
        setNome_plano(n); 
        setCnpj(c);
    }
    
    public String getNome_plano() {
        return nome_plano;
    }
    public boolean setNome_plano(String nome_plano) {
        if(nome_plano.length()>0){
            this.nome_plano = nome_plano;
            return true;
        } else {
            return false;
        }
    }
    public String getCnpj() {
        return cnpj;
    }
    public boolean setCnpj(String cnpj) {
        if(cnpj.length()>0){
            this.cnpj = cnpj;
            return true;
        } else {
            return false;
        }
    }
}
