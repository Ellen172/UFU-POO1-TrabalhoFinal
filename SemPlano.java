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

}
