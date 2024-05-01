import java.util.ArrayList;

public class Lista {
    ArrayList<Departamento> universidade;
    ArrayList<Funcionario> funcionarios;
    public Lista() {
        universidade = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }
    public void adicionarDepartamento(Departamento departamento) {
        universidade.add(departamento);
    }
    public void mostrarDepartamentos() {
        System.out.println("Lista de departamentos: ");
        for (int x = 0; x < universidade.size(); x++) {
            System.out.println(x + 1 + ". " + universidade.get(x).getNome());
        }
    }
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    //Mostrando os funcionários. Recebe o parametro para saber qual caso seguir.
    public void mostrarFuncionarios(int n1) {
        switch (n1){
            case 1:
                System.out.println("Lista de funcionarios: ");
                for (int x = 0; x < funcionarios.size(); x++) {
                    System.out.println(x + 1 + ". " + funcionarios.get(x).getNome() + " Salário: " + funcionarios.get(x).getSalario() + " Tipo: " + funcionarios.get(x).getTipo());
                }
                break;
                //Limitando aos Docentes.
            case 2:
                System.out.println("Lista de funcionarios Docentes: ");
                int i = 0;
                for (int x = 0; x < funcionarios.size(); x++) {
                    if (funcionarios.get(x).getTipo().equals("Docente")) {
                        i ++;
                        System.out.println(i + ". " + funcionarios.get(x).getNome() + ": " + funcionarios.get(x).getSalario());
                    }
                }
                break;
                //Limitando aos Técnicos.
            case 3:
                System.out.println("Lista de funcionarios Técnicos : ");
                int j = 0;
                for (int x = 0; x < funcionarios.size(); x++) {
                    if (funcionarios.get(x).getTipo().equals("Técnico")) {
                        j++;
                        System.out.println(j + ". " + funcionarios.get(x).getNome() + ": " + funcionarios.get(x).getSalario());
                    }
                }
                break;
        }
    }
    //Buscando departamento pelo nome.
    public void buscarDepartamento(String nome) {
        int i = 0;
        for (int x = 0; x < universidade.size(); x++) {
            if (universidade.get(x).getNome().equals(nome)) {
                universidade.get(x).mostraFuncionarios();
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("Nenhum Departamento encontrado.");
        }
    }
    //Buscando funcionário pelo nome.
    public void buscarFuncionario(String nome) {
        int i = 0;
        for (int x = 0; x < funcionarios.size(); x++) {
            if (funcionarios.get(x).getNome().equals(nome)) {
                i++;
                System.out.println(i + ". " + funcionarios.get(x).getNome() + " Salário: " + funcionarios.get(x).getSalario() + " Tipo: " + funcionarios.get(x).getTipo());
            }
        }
        if (i == 0) {
            System.out.println("Nenhum Funcionario encontrado.");
        }
    }
    //Buscando departamentos com média salarial dentro da faixa escolhida.(Printa o departamento e seus funcionários).
    public void faixaSalarioDepart(double salariomenor, double salariomaior) {
        int i = 0;
        for (int x = 0; x < universidade.size(); x++) {
            if (salariomenor <= universidade.get(x).mediaSalarial() && salariomaior >= universidade.get(x).mediaSalarial()) {
                universidade.get(x).mostraFuncionarios();
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("Nenhum Departamento encontrado.");
        }
    }
    //Buscando funcionários de mesma faixa salarial.
    public void faixaSalarialFuncio(double salariomenor, double salariomaior) {
        int i = 0;
        for (int x = 0; x < funcionarios.size(); x++) {
            if (salariomenor <= funcionarios.get(x).getSalario() && salariomaior >= funcionarios.get(x).getSalario()) {
                i ++;
                System.out.println(i + ". " + funcionarios.get(x).getNome() + ": " + funcionarios.get(x).getSalario() + " Tipo: " + funcionarios.get(x).getTipo());
            }
        }
        if (i == 0){
            System.out.println("Nenhum Funcionário encontrado.");
        }
    }
    //Buscando Departamentos com gasto total na faixa especificada.
    public void faixaGastoTotal(double faixa, double e){
        int i = 0;
        for (int x = 0; x < universidade.size(); x++) {
            if (faixa <= universidade.get(x).gastoTotal() && e >= universidade.get(x).gastoTotal()) {
                universidade.get(x).mostraFuncionarios();
                i = 1;
            }
        }
        if (i == 0){
            System.out.println("Nenhum departamento encontrado.");
        }
    }
    //Mostrando Todos departamentos e seus funcionários.
    public void departamentoseFuncionarios(){
        for (int x = 0; x < universidade.size(); x++) {
            universidade.get(x).mostraFuncionarios();
        }
    }
}