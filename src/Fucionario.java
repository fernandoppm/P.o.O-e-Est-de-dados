public class Fucionario {
    private String nome;
    private double salario;
    private double custo;
    private double aumento;
    private double percentual;
    private static final double percentualCusto = 1.8;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public final void setSalario(double salario){
        this.salario = salario;
        this.custo = this.salario * percentualCusto;
    }
    public void setAumento(double percen){
        double multiplicao = (100.0 + percen)/ 100.0;
        this.setSalario(this.getSalario() * multiplicao);
    }

    protected double getCusto() {
        return 1.8;
    }

    protected void setCusto(double custo) {
        this.custo = custo;
    }

    public double getAumento() {
        return aumento;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    public void imprimir(){
        System.out.println("Seu nome e" + this.getNome() + " com um salario de " + this.getSalario() +
                " e um custo de " + this.getCusto());
    }
}
