import java.util.Date;

public class ComPlano extends Paciente {
    private String nro_cart;
    private Date data_ing;
    private boolean per_carencia;

    public String getNro_cart() {
        return nro_cart;
    }

    public boolean setNro_cart(String nro_cart) {
        if(nro_cart.length() > 0){
            this.nro_cart = nro_cart;
            return true;
        }else{
            return false;
        }
    }

    public Date getData_ing() {
        return data_ing;
    }

    public void setData_ing(Date data_ing) {
        this.data_ing = data_ing;
    }

    public boolean getPer_carencia(){
        return this.per_carencia;
    }

    public void setPer_carencia(boolean per_carencia){
        this.per_carencia = per_carencia;
    }
}
