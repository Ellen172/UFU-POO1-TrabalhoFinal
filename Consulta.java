import java.util.Date;

public class Consulta {

    private Date data;
    private String horario;
    private String medicamento;
    private String obs_geral;
    private String receita;
    private double val_cons;


    public Date getData() {
        return data;
    }

    public void setData(Date data){
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public boolean setHorario(String horario) {
        if(horario.length() > 0) {
            this.horario = horario;
            return true;
        }
        else {
            return false;
        }
    }

    public String getMedicamento() {
        return medicamento;
    }

    public boolean setMedicamento(String medicamento) {
        if(medicamento.length() > 0) {
            this.medicamento = medicamento;
            return true;
        }
        else {
            return false;
        }
    }

    public String getObs_geral() {
        return obs_geral;
    }

    public boolean setObs_geral(String obs_geral) {
        if(obs_geral.length() > 0) {
            this.obs_geral = obs_geral;
            return true;
        }
        else {
            return false;
        }
    }

    public String getReceita() {
        return receita;
    }

    public boolean setReceita(String receita) {
        if(receita.length() > 0) {
            this.receita = receita;
            return true;
        }
        else {
            return false;
        }
    }
    

    public double getVal_cons() {
        return val_cons;
    }

    public boolean setVal_cons(double val_cons) {
        if(val_cons > 0) {
            this.val_cons = val_cons;
            return true;
        }
        else {
            return false;
        }
    }

}

