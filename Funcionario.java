public class Funcionario {
    private String nome_func;
    private String cpf_func;
    private String rg_func;
    private boolean est_civ;
    private date dat_adm;
    private String ctps;
    private String login;
    private String senha;
    private int total_cons;

    

    public String getNome_func() {
        return nome_func;
    }
    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }
    public String getCpf_func() {
        return cpf_func;
    }
    public void setCpf_func(String cpf_func) {
        this.cpf_func = cpf_func;
    }
    public String getRg_func() {
        return rg_func;
    }
    public void setRg_func(String rg_func) {
        this.rg_func = rg_func;
    }
    public boolean getEst_Civ() {
        return est_civ;
    }
    public void setEst_civ(boolean est_civ) {
        this.est_civ = est_civ;
    }
    public date getDat_adm() {
        return dat_adm;
    }
    public void setDat_adm(date dat_adm) {
        this.dat_adm = dat_adm;
    }
    public String getCtps() {
        return ctps;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
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
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getTotal_cons() {
        return total_cons;
    }
    public void setTotal_cons(int total_cons) {
        this.total_cons = total_cons;
    }
}
