public class Outro_funcionario extends Funcionario{

    private String cargo;
    private double sal_fixo;
    private static double gratificacao;
    private int total_cons;

    public Outro_funcionario(String c, double s, double g, int t){
        setCargo(c);
        setSal_fixo(s);
        setGratificacao(g);
        setTotal_cons(t);
    }
    
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

    public static double getGratificacao() {
        return gratificacao;
    }
    public static boolean setGratificacao(double gratificacao) {
        if(gratificacao >= 0) {
            Outro_funcionario.gratificacao = gratificacao;
            return true;
        }
        else {
            return false;
        }
    }
    public int getTotal_cons() {
        return total_cons;
    }
    public boolean setTotal_cons(int total_cons) {
        if(total_cons>0){
            this.total_cons = total_cons;
            return true;
        } else {
            return false;
        }
    }
    

}
