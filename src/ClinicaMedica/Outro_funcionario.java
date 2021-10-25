package ClinicaMedica;
import java.io.Serializable;

public class Outro_funcionario extends Funcionario implements Serializable{

    private String cargo;
    private double sal_fixo;
    private static double gratificacao = 80;
    private int total_cons;

    public Outro_funcionario(String c, double s, String cp){
        super(cp);
        setCargo(c);
        setSal_fixo(s);
    }

    public void mostrarDados() {
        super.mostrarDados();
        this.calculaSalario();
        System.out.println("=============================");
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salário Fixo: " + this.getSal_fixo());
        System.out.println("Gratificação: : " + getGratificacao());
        System.out.println("Total de Consultas: " + this.getTotal_cons());
        System.out.println("=============================");
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