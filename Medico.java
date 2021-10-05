public class Medico extends Funcionario {
    private String crm;
    private String especialidades;
    private double sal_mensal;
    private Plano planos[];
    private double somaConsultaMes;
    private static int nro_cons;

    Medico(){}

    Medico(String c, Plano p[]){
        super(c);
        setPlanos(p);
    }

    public void calculaSalario(Consulta c){
        somaConsultaMes += c.getVal_cons();
    }

    public void zeraSomaConsultaMes(){
        somaConsultaMes = 0;
    }
    
    public void zeraCons(){
        nro_cons = 0;
    }
    public void incrementaNroCons(){
        nro_cons += 1;
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
    
    public Plano[] getPlanos() {
        return this.planos;
    }
    public void setPlanos(Plano p[]) {
        this.planos = p;
    }
     
    public double getSomaConsultaMes() {
        return somaConsultaMes;
    }

    public void setSomaConsultaMes(double somaConsultaMes) {
        this.somaConsultaMes = somaConsultaMes;
    }

    public static int getNro_cons() {
        return nro_cons;
    }
    public static boolean setNro_cons(int n) {
        if(n>0){
            nro_cons = n;
            return true;
        }
        else {
            return false;
        }
    }
}