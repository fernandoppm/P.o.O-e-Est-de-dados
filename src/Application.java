public class Application {
    public static void main(String[] args) {
        Funcionario lucas = new Funcionario();
        lucas.setNome("lucas fernando");
        lucas.setSalario(1500.8);
        lucas.setAumento();
        lucas.imprimir();

        Gerente maria = new Gerente();
        maria.setNome("Maria marta");
        maria.setSalario(7500.0);
        maria.setSenha(12345);
        maria.setAumento();
        maria.imprimir("meu nome e maria", "tenho mais de 10 anos de experiencia");

        Programador carlos = new Programador();
        carlos.setNome("carlos andre");
        carlos.setSalario(3500.9);
        carlos.setIDEA("Intellij");
        carlos.setAumento(26.0);
        carlos.imprimir("meu nome e carlos," " e sou um bom programador");

        Secretaria carla = new Secretaria();
        carla.setNome("Carla de santana");
        carla.setSalario(4388);
        carla.setPlanilha(" planilha de organização");
        carla.setAumento(2.0);
        carla.imprimir("sou uma boa secretaria tem mais de 5 anos de carreira", "quizer me contratar e so ligar");

    }
}
