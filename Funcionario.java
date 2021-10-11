
public abstract class  Funcionario {
    private String nome_func;
    private String cpf_func;
    private String rg_func;
    private byte est_civ;
    private String dat_adm;
    private String ctps;
    private String login;
    private String senha;
    private static int lim_cons;

    Funcionario(){}

    Funcionario(String c){
        setCpf_func(c);
    }

    Funcionario(String n, String cp, String rg, byte ec, String d, String ct, String s){
        setNome_func(n);
        setCpf_func(cp);
        setRg_func(rg);
        setEst_civ(ec);
        setDat_adm(d);
        setCtps(ct);
        cadastro(s);
    }

    public abstract void calculaSalario();

    public abstract void cadastro(String s); // cadastro do login e senha, para medicos login será crm, para outro_funcionario o cpf

    public void mostrarDados(){
        System.out.println("Nome: " + getNome_func());
        System.out.println("Cpf: " + getCpf_func());
        System.out.println("Rg: " + getRg_func());
        System.out.println("Estado Civil: " + getEst_Civ());
        System.out.println("Ctps: " + getCtps());
        System.out.println("Data de Admissão: " + getDat_adm());

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
    public boolean setLogin(String login) {
        if(login.length()>0){
            this.login = login;
            return true;
        } else {
            return false;
        }
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
