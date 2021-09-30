public class Medico {
    private String crm;
    private String especialidades;
    private double sal_mensal;
    private int nro_cons;

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
    public double getSal_mensal() {
        return sal_mensal;
    }
    public void setSal_mensal(double sal_mensal) {
        this.sal_mensal = sal_mensal;
    }
    public int getNro_cons() {
        return nro_cons;
    }
    public void setNro_cons(int nro_cons) {
        if(nro_cons<0) this.nro_cons = 0;
        this.nro_cons = nro_cons;
    }
    
    
    

    
}