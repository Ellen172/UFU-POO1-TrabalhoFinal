import java.io.Serializable;

public class SemPlano extends Paciente implements Serializable, Interface{
    private boolean desc_esp;
    private double val_pago;
    
    public void mostraDados() {
    	super.mostrarDados();
    	System.out.println("Desconto especial: " + this.getDes_esp() + "\nValor Pago: " + this.getVal_pago() + "\n");
    }

    public double getVal_pago() {
        return val_pago;
    }

    public boolean setVal_pago(double val_pago) {
        if(val_pago > 0){
            this.val_pago = val_pago;
            return true;
        }else{
            return false;
        }
        
    }

    public String getDes_esp(){
        if(desc_esp == false) return "NO";
        else return "YES";
    }

    public void setDesc_esp(boolean desc_esp){
        this.desc_esp = desc_esp;
    }

    public SemPlano(String nome_pac, String cpf_pac, String rg_pac, byte est_civ, String sexo, String dat_nas,
            boolean desc_esp, double val_pago) {
        super(nome_pac, cpf_pac, rg_pac, est_civ, sexo, dat_nas);
        setDesc_esp(desc_esp);
        setVal_pago(val_pago);
    }
}
