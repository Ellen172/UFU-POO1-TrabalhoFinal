import java.util.Calendar;
import java.util.Date;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class Paciente implements Interface, Serializable{
    private String nome_pac;
    private String cpf_pac;
    private String rg_pac;
    private byte est_civ;
    private String sexo;
    private String dat_nas;
    private Date dat_cad;
    private String ult_cons;
 
    
    public String getNome_pac() {
        return nome_pac;
    }

    public boolean setNome_pac(String nome_pac) {
        if(nome_pac.length() > 0){
            this.nome_pac = nome_pac; 
            return true;
        }    
        else{
            return false;  
        }      
    }

    public void mostrarDados(){
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome: " + getNome_pac() + "\nCpf: " + ValidaCpf.imprimeCPF(getCpf_pac()) + "\nRg: " + getRg_pac()
        		+ "\nEstado Civil: " + getEst_civ() + "\nSexo: " + getSexo() + "\nData de Nascimento: " + getDat_nas()
        		+ "\nData de cadastro: " + formatarData.format(getDat_cad()) + "\nUltima consulta: " + getUlt_cons() + "\n");
    }

    public String getCpf_pac() {
        return cpf_pac;
    }

    public boolean setCpf_pac(String cpf_pac) {
        if(ValidaCpf.isCPF(cpf_pac) == true){
            this.cpf_pac = cpf_pac;
            return true;
        }else{
            return false;
        }
    }

    public String getRg_pac() {
        return rg_pac;
    }

    public boolean setRg_pac(String rg_pac) {
        if(rg_pac.length() > 0){
            this.rg_pac = rg_pac;
            return true;
        }else{
            return false;
        }
    }

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }

    public String getDat_nas() {
        return dat_nas;
    }
    
    public void setDat_nas(String dat_nas) {
        this.dat_nas = dat_nas;
    }

    public String getEst_civ() {
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

    public String getSexo() {
        return sexo;
    }

    public boolean setSexo(String sexo) {
        if(sexo.length() > 0){
            this.sexo = sexo;
            return true;
        }else{
            return false;
        }
    }

    public String getUlt_cons() {
        return ult_cons;
    }

    public void setUlt_cons(String ult_cons) {
        this.ult_cons = ult_cons;
    }

    public Paciente(String nome_pac, String cpf_pac, String rg_pac, byte est_civ, String sexo, String dat_nas){
        
        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
        String strDate = formatter.format(date);  
        
        this.dat_cad = date;
        this.ult_cons = strDate;
        
        setCpf_pac(cpf_pac);
        setDat_nas(dat_nas);
        setEst_civ(est_civ);
        setNome_pac(nome_pac);
        setRg_pac(rg_pac);
        setSexo(sexo);
    }

}
