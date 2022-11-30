public class Gerente extends Fucionario{
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public void imprimir() {
        System.out.println("Meu nome e " + this.getNome() + "sou um gerente e tenho um salario de " + this.getSalario() + " e tenho um custo " +
                this.getCusto() + " e utilizo minha senha " + this.getSenha() + " para gerir a empresa");
    }
}
