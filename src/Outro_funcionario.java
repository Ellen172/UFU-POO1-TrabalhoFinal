import java.io.Serializable;

public class Outro_funcionario extends Funcionario implements Serializable{

    private String cargo;
    private double sal_fixo;
    private static double gratificacao = 80;
    private int total_cons;

    public Outro_funcionario(String cargo, double sal_fixo, String cpf){
        super(cpf);
        setCargo(cargo); 
        setSal_fixo(sal_fixo);
    }
    
    public Outro_funcionario(String cargo, double sal_fixo, String nome_func, String cpf_func, 
    		String rg_func, byte est_civ, String dat_adm, String ctps, String senha){
        super(nome_func, cpf_func, rg_func, est_civ, dat_adm, ctps, senha);
        setCargo(cargo); 
        setSal_fixo(sal_fixo);
    }

    public void mostrarDados() {
        super.mostrarDados();
        this.calculaSalario();
        System.out.println("Cargo: " + this.getCargo() + "\nSalário Fixo: " + this.getSal_fixo() + "\nGratificação: " + getGratificacao() 
        		+ "\nTotal de Consultas: " + this.getTotal_cons() + "\n");
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
    
    public void calculaSalario(){
        if(total_cons > getLim_cons()){
            sal_fixo += gratificacao;
        }
    }
    public void cadastro(String s){
        setLogin(getCpf_func());
        setSenha(s);
    }

}
