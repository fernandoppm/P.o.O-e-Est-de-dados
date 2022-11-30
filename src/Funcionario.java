public class Funcionario {
        private String nome;
        private double salario;
        private double custo;

        protected double getPERCENTUAL_CUSTO(){
            return 1.8;
        }

        public double getCusto() {
            return custo;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
            this.custo = salario * getPERCENTUAL_CUSTO();
        }
        public void setAumento(Double percentual){
            double mult = (100 + percentual)/ 100;
            this.setSalario(this.getSalario() * mult);
        }

        public void setAumento(){
            this.setAumento(10.0);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void imprimir(){
            System.out.println(" meu nome é: " + this.nome + ". Eu recebo " + this.salario + " de salário."
                    + " E tenho um custo de " + this.custo + " para a empresa!");
        }
        protected  void imprimir(String cabecalho) {
            System.out.println("Cabeçalho: " + cabecalho);
            System.out.println("Texto: texto para nada.");
            System.out.println("Nome: " + this.getNome() + "Salário: " + getSalario() +"\n");

        }
        protected  void imprimir(String cabecalho, String tx , String roda) {
            System.out.println("Cabeçalho: " + cabecalho);
            System.out.println("Texto: " + tx);
            System.out.println("NOME: " + this.getNome() + "Salário: " + getSalario());
            System.out.println("Rodapé: " + roda + "\n");
        }
        protected void imprimir(String tx , String roda ) {
            System.out.println("Texto: "  + tx);
            System.out.println("Nome: " + this.getNome() + "Salário: " + getSalario());
            System.out.println("Rodapé: " + roda);
        }

    }

