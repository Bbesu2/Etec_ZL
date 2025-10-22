package RegistrodeFuncionáriosdeumaEmpresa;
public class Main_Funcionario {
    public static void main(String[] args) {
       Funcionario f1 = new Funcionario();
       
       f1.setNome("Saiko");
       f1.setCargo("Zelador");
       f1.setSalario(100.10);
       
        System.out.println("--- Funcionarios ---");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Salario: " + f1.getSalario());
        System.out.println("---------------------");
    }
    
}
