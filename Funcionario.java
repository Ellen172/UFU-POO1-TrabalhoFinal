import java.util.Date;

public class Funcionario {
    private String nome_func;
    private String cpf_func;
    private String rg_func;
    private byte est_civ;
    private Date dat_adm;
    private String ctps;
    private String login;
    private String senha;
    private int total_cons;

    Funcionario(){}

    Funcionario(String c){
        setCpf_func(c);
    }

    Funcionario(String n, String cp, String rg, byte ec, Date d, String ct, String l, String s, int tc){
        setNome_func(n);
        setCpf_func(cp);
        setRg_func(rg);
        setEst_civ(ec);
        setDat_adm(d);
        setCtps(ct);
        setLogin(l);
        setSenha(s);
        setTotal_cons(tc);
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
        if(cpf_func.length()>0){
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
    public byte getEst_Civ() {
        return est_civ;
    }
    public void setEst_civ(byte est_civ) {
        // 0 - solteiro
        // 1 - casado
        // 2 - divorciado
        this.est_civ = est_civ;
    }
    public Date getDat_adm() {
        return dat_adm;
    }
    public void setDat_adm(Date dat_adm) {
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
