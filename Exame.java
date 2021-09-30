package Trabalho2;

public class Exame extends Consulta{

    private String nome_exame;

    public String getNome_exame() {
        return nome_exame;
    }

    public boolean setNome_exame(String nome_exame) {
        if(nome_exame.length() > 0) {
            this.nome_exame = nome_exame;
            return true;
        }
        else {
            return false;
        }
    }

}
