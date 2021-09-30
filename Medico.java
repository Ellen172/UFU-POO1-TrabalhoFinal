public class Medico extends Funcionario {
    private String crm;
    private String especialidades;
    private double sal_mensal;
    private int nro_cons;
    private Plano planos[];

    Medico(){}
    
    Medico(String c, Plano p[]){
        super(c);
        setPlanos(p);
    }

    public String getCrm() {
        return crm;
    }
    public boolean setCrm(String crm) {
        if(crm.length()>0){
            this.crm = crm;
            return true;
        } else {
            return false;
        }
    }
    public String getEspecialidades() {
        return especialidades;
    }
    public boolean setEspecialidades(String especialidades) {
        if(especialidades.length()>0){
            this.especialidades = especialidades;
            return true;
        } else {
            return false;
        }
    }
    public double getSal_mensal() {
        return sal_mensal;
    }
    public boolean setSal_mensal(double sal_mensal) {
        if(sal_mensal>0){
            this.sal_mensal = sal_mensal;
            return true;
        }
        else {
            return false;
        }
    }
    public int getNro_cons() {
        return nro_cons;
    }
    public boolean setNro_cons(int nro_cons) {
        if(nro_cons>0){
            this.nro_cons = nro_cons;
            return true;
        }
        else {
            return false;
        }
    }
    public Plano[] getPlanos() {
        return p;
    }
    public void setPlanos(Plano p[]) {
        this.p = p;
    }

}