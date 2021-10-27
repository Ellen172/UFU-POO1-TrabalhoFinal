import java.io.Serializable;

public abstract class Funcionario implements Interface, Serializable{
    private String nome_func;
    private String cpf_func;
    private String rg_func;
    private byte est_civ;
    private String dat_adm;
    private String ctps;
    private String login;
    private String senha;
    private static int lim_cons = 10;

    Funcionario(){}

    Funcionario(String cpf){ 
        setCpf_func(cpf);
        setLogin(cpf);
    }

    Funcionario(String nome_func, String cpf_func, String rg_func, byte est_civ, String dat_adm, String ctps, String senha){
        setNome_func(nome_func);
        setCpf_func(cpf_func);
        setRg_func(rg_func);
        setEst_civ(est_civ);
        setDat_adm(dat_adm);
        setCtps(ctps);
        cadastro(senha);
        setLogin(cpf_func);
    }

    public abstract void calculaSalario();

    public abstract void cadastro(String s); // cadastro do login e senha, para medicos login serÃ¡ crm, para outro_funcionario o cpf

    public void mostrarDados(){        
        System.out.println("Nome: " + this.getNome_func() + "\n" + "Cpf: " + ValidaCpf.imprimeCPF(this.getCpf_func()) + "\n" +
        		"Rg: " + this.getRg_func() + "\n" + "Estado Civil: " + this.getEst_Civ() + "\n" + "Ctps: " + this.getCtps()
        		+ "\n" + "Data de Admissão: " + this.getDat_adm() + "\n");
    }

    public String getNome_func() {
        return nome_func;
    }
    public boolean setNome_func(String nome_func) {
        if(nome_func.length()>0){
            this.nome_func = nome_func;
            return true;
        } else {
            return false;
        }
    }
    public String getCpf_func() {
        return cpf_func;
    }
    public boolean setCpf_func(String cpf_func) {
        if(ValidaCpf.isCPF(cpf_func) == true){
            this.cpf_func = cpf_func;
            return true;
        } else {
            return false;
        }
    }
    public String getRg_func() {
        return rg_func;
    }
    public boolean setRg_func(String rg_func) {
        if(rg_func.length()>0){
            this.rg_func = rg_func;
            return true;
        } else {
            return false;
        }
    }
    public String getEst_Civ() {
        if(est_civ == 0){
            return "Solteiro";
        } else if(est_civ == 1){
            return "Casado";
        } else if(est_civ == 2){
            return "Divorciado";
        } else {
            return "";
        }
    }
    public void setEst_civ(byte est_civ) {
        this.est_civ = est_civ;
    }
    public String getDat_adm() {
        return dat_adm;
    }
    public void setDat_adm(String dat_adm) {
        this.dat_adm = dat_adm;
    }
    public String getCtps() {
        return ctps;
    }
    public boolean setCtps(String ctps) {
        if(ctps.length()>0){
            this.ctps = ctps;
            return true;
        } else {
            return false;
        }
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
    	this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public boolean setSenha(String senha) {
        if(senha.length()>0){
            this.senha = senha;
            return true;
        } else {
            return false;
        }
    }
    public static int getLim_cons() {
        return lim_cons;
    }

    public static void setLim_cons(int lim_cons) {
        Funcionario.lim_cons = lim_cons;
    }
}
