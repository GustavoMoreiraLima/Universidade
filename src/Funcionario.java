public class Funcionario {
    String nome;
    double salario;
    String tipo;

    public Funcionario(String nome, double salario, String tipo) {
        this.nome = nome;
        this.salario = salario;
        this.tipo = tipo;

    }
    public String getNome() {
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public String getTipo(){
        return tipo;
    }
}
