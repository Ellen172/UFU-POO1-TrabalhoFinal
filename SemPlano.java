import java.util.Date;

public class SemPlano extends Paciente{
    private boolean desc_esp;
    private double val_pago;

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

    public boolean getDes_esp(){
        return this.desc_esp;
    }

    public void setDesc_esp(boolean desc_esp){
        this.desc_esp = desc_esp;
    }

    public SemPlano(String nome_pac, String cpf_pac, String rg_pac, Byte est_civ, String sexo, Date dat_nas,
            String ult_cons, boolean desc_esp, double val_pago) {
        super(nome_pac, cpf_pac, rg_pac, est_civ, sexo, dat_nas, ult_cons);
        setDesc_esp(desc_esp);
        setVal_pago(val_pago);
    }
}
