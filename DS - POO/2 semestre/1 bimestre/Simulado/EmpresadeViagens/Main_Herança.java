package EmpresadeViagens;
public class Main_Herança {
    public static void main(String[] args) {
        Onibus o1 = new Onibus(50, 100.0, 50);
        Aviao a1 = new Aviao(180, 500.0, 120.0);

        o1.exibirInfo();
        a1.exibirInfo();    
    }
}
