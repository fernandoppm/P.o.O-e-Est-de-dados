public class Programador extends Fucionario{
    private String IDEA;

    public String getIDEA() {
        return IDEA;
    }

    public void setIDEA(String IDEA) {

        this.IDEA = IDEA;
    }

    @Override
    public void imprimir() {
        System.out.println("Meu nome e " + this.getNome() + "sou um programador e tenho um salario de " + this.getSalario() +
                "e tenho um custo de " + this.getCusto() + " e utilizo uma IDE " + this.getIDEA() + " para programar");
    }
}
