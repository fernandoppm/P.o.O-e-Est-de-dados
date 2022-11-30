public class Application {
    public static void main(String[] args) {
        Fucionario lucas = new Fucionario();
        lucas.setNome("Lucas Fernando");
        lucas.setSalario(2500.0);
        lucas.setAumento(4);
        lucas.imprimir();

        Gerente maria = new Gerente();
        maria.setNome("Maria marta");
        maria.setSalario(7500.0);
        maria.setSenha(12345);
        maria.setAumento(5);
        maria.imprimir();

        Programador carlos = new Programador();
        carlos.setNome("carlos andre");
        carlos.setSalario(3500.9);
        carlos.setIDEA("Intellij");
        carlos.setAumento(26);
        carlos.imprimir();

        Secretaria carla = new Secretaria();
        carla.setNome("Carla de santana");
        carla.setSalario(4388);
        carla.setPlanilha(" planilha de organização");
        carla.setAumento(2);
        carla.imprimir();

    }
}
