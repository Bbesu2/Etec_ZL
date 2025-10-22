package SistemadeGestãodeMídia;
public class Main_Herança {
    public static void main(String[] args) {
        Reporter r1 = new Reporter();
        Cameraman c1 = new Cameraman();
        Editor e1 = new Editor();
        
        
        r1.nome = "Joao";
        r1.matricula = "Matriculado";
        r1.salario = 1000;
        r1.areaAtuacao = "Reportagem Aerea";
        r1.numReportagem = 10;
        
        c1.nome = "Pedro";
        c1.matricula = "Matriculado";
        c1.salario = 2000;
        c1.tipoCamera = "Canon";
        c1.tempoExperiencia = 10;
        
        e1.nome = "Joana";
        e1.matricula = "Matriculado";
        e1.salario = 3000;
        e1.softwareEdit = "FilmoraGo";
        
        e1.exibirInfo();
        c1.exibirInfo();
        r1.exibirInfo();
    }
}
