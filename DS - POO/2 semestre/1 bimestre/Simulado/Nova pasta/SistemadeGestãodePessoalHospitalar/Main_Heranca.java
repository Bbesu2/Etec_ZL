package SistemadeGestãodePessoalHospitalar;
public class Main_Heranca {
    public static void main(String[] args) {
        Medico m1 = new Medico();
        Enfermeiro e1 = new Enfermeiro();
        
        m1.nome = "Jairo";
        m1.matricula = "Medico";
        m1.salario = 10000.10;
        m1.crm = 10;
        
        e1.nome = "Jaira";
        e1.matricula = "Enfermeiro";
        e1.salario = 5000.10;
        e1.coren = "001";
        
        m1.exibirInfo();
        e1.exibirInfo();
        
    }
    
}
