public class Outro_funcionario extends Funcionario{

    private String cargo;
    private double sal_fixo;
    private double gratificacao;

    public String getCargo() {
        return cargo;
    }

    public boolean setCargo(String cargo) {
        if(cargo.length() > 0) {
            this.cargo = cargo;
            return true;
        }
        else {
            return false;
        }
    }

    public double getSal_fixo() {
        return sal_fixo;
    }

    public boolean setSal_fixo(double sal_fixo) {
        if(sal_fixo> 0) {
            this.sal_fixo = sal_fixo;
            return true;
        }
        else {
            return false;
        }
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public boolean setBairro(double gratificacao) {
        if(gratificacao >= 0) {
            this.gratificacao = gratificacao;
            return true;
        }
        else {
            return false;
        }
    }
    

}