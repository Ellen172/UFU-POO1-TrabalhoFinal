public class Endereco {
 
    private String rua;
    private int numero;
    private String bairro;
    private String comp;
    private String cidade;
    private String cep;

    public String getRua() {
        return rua;
    }

    public boolean setRua(String rua) {
        if(rua.length() > 0) {
            this.rua = rua;
            return true;
        }
        else {
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public boolean setNumero(int numero) {
        if(numero > 0) {
            this.numero = numero;
            return true;
        }
        else {
            return false;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public boolean setBairro(String bairro) {
        if(bairro.length() > 0) {
            this.bairro = bairro;
            return true;
        }
        else {
            return false;
        }
    }

    public String getComp() {
        return comp;
    }

    public boolean setComp(String comp) {
        if(comp.length() > 0) {
            this.comp = comp;
            return true;
        }
        else {
            return false;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public boolean setCidade(String cidade) {
        if(cidade.length() > 0) {
            this.cidade = cidade;
            return true;
        }
        else {
            return false;
        }
    }

    public String getCep() {
        return cep;
    }

    public boolean setCep(String cep) {
        if(cep.length() > 0) {
            this.cep = cep;
            return true;
        }
        else {
            return false;
        }
    }

}
