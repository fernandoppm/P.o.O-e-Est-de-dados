public class Secretaria extends Fucionario{
    private String planilha;

    public String getPlanilha() {
        return planilha;
    }

    public void setPlanilha(String planilha) {
        this.planilha = planilha;
    }

    @Override
    public void imprimir() {
        System.out.println("Meu nome e " + this.getNome() + " sou uma secretaria e tenho um salario de " + this.getSalario()
        + " e tenho um custo de " + this.getCusto() + " e utilizo uma " + this.getPlanilha() + " para a organização");
    }
}
