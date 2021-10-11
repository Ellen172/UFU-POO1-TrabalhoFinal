public class Principal {
    public static void main(String args[]){
        Plano p[] = new Plano[2];
        p[0] = new Plano("prime", "25.124.145/0048-98");
        p[1] = new Plano("vip", "45.487.748/7841-98");
        
        Medico f1 = new Medico("123.124.215-45", p);
        Outro_funcionario o1 = new Outro_funcionario("Atendente", 1200.5);
        Paciente p1 = new Paciente("Karen", "124.124.451-98", "RJ45.487.487", (byte)0, "Feminino", "12/07/1998", "23/04/2012");
        Consulta c1 = new Consulta(f1, p1);
        c1.realizarConsulta("Lozoprazol, Ameniaki", "2 comprimidos de cada", "a cada 9h", 250.45, f1, o1, p1);

        System.out.println(c1.getData());
        System.out.println(c1.getHorario());
    }
}
