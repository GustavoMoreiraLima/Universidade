import java.util.ArrayList;

public class Departamento {
    String nome;
    ArrayList<Funcionario> funcdep;

    public Departamento(String nome) {
        this.nome = nome;
        funcdep = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void addFuncionario(Funcionario f) {
        funcdep.add(f);
    }
    public void mostraFuncionarios(){
        System.out.println("Departamento: " + nome + "\nFuncionários:");
        for(int x = 0 ; x < funcdep.size() ; x++){
            System.out.println(x + 1 + ". " + funcdep.get(x).getNome() + ": " + funcdep.get(x).getSalario() + " Tipo: " + funcdep.get(x).getTipo());
        }
    }
    public double mediaSalarial(){
        double media = 0;
        for(int x = 0 ; x < funcdep.size() ; x++){
            media += funcdep.get(x).getSalario();
        }
        return media / funcdep.size();
    }
    public double gastoTotal(){
        double total = 0;
        for(int x = 0 ; x < funcdep.size() ; x++){
            total += funcdep.get(x).getSalario();
        }
        return total;
    }
}