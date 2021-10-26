import java.io.Serializable;

public class Medico extends Funcionario implements Serializable{
    private String crm;
    private String especialidades;
    private double sal_mensal;
    private Plano planos[];
    private double somaConsultaMes;
    private static int nro_cons;

    Medico(){}

    Medico(String cpf_func, Plano p[]){
        super(cpf_func);
        setPlanos(p);
    }
    
    Medico(String nome_func, String cpf_func, String rg_func, byte est_civ, String dat_adm, String ctps, String senha, 
    		String crm, String especialidades, Plano planos[]){
    	super(nome_func, cpf_func, rg_func, est_civ, dat_adm, ctps, senha);
    	setCrm(crm);
    	setEspecialidades(especialidades);
    	setPlanos(planos);
    }
 
    public void mostrarDados() {
        super.mostrarDados();
        this.calculaSalario();
        System.out.println("=============================");
        System.out.println("CRM: " + this.getCrm());
        System.out.println("Especialidades: " + this.getEspecialidades());
        System.out.println("Salário Mensal: " + this.getSal_mensal());
        System.out.println("Planos: " + this.getPlanosNro());
        System.out.println("Soma das Consultas: " + this.getSomaConsultaMes());
        System.out.println("Número de consultas: " + getNro_cons());
        System.out.println("=============================");
    }

    public void cadastro(String s){
        setLogin(crm);
        setSenha(s);
    }

    public void calculaSalario(){
        sal_mensal += somaConsultaMes;
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
    
    public String getPlanosNro() {
        int nro = this.planos.length;
        String p = "";
        for(int i = 0; i<nro; i++){
           p = p.concat(this.planos[i].getNome_plano() + " ");
        }

        return p;
    }

    public String getPlanosIndex(int index) {
        return this.planos[index].getNome_plano();
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