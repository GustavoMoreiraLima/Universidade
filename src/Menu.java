import java.util.Scanner;

public class Menu {
    public Menu(){
        int opcao = 1;
        Scanner leia = new Scanner(System.in);
        Lista lista = new Lista();
        while (opcao != 0 ){
            System.out.println("-----MENU-----\n" +
                    "1. Cadastrar Departamento.\n" +
                    "2. Cadastrar Funcionário Técnico.\n" +
                    "3. Cadastrar Funcionário Docente.\n" +
                    "4. Buscar Departamento por Nome.\n" +
                    "5. Buscar Funcionário por Nome.\n" +
                    "6. Listar Departamentos com Funcionários com Faixa Salarial Específica.\n" +
                    "7. Listar Funcionários com Faixa Salarial Específica.\n" +
                    "8. Listar Departamenos cujo gasto total está entre uma Faixa de Valores Específicas.\n" +
                    "9. Listar todos Funcionários da Universidade.\n" +
                    "10. Listar todos Departamentos da Universidade.\n" +
                    "11. Listar todos Departamentos da Universidade e seus Funcionários.\n" +
                    "12. Listar todos os Funcionários Docente.\n" +
                    "13. Listar todos os Funcionários Técnicos.\n" +
                    "0. Sair");
            opcao = leia.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do Departamento: ");
                    String nomeDepartamento = leia.next();
                    Departamento departamento = new Departamento(nomeDepartamento);
                    lista.adicionarDepartamento(departamento);
                    System.out.println("Departamento cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do Funcionário: ");
                    String nomeFuncionario = leia.next();
                    System.out.println("Digite o salário: ");
                    double salario = leia.nextDouble();
                    Funcionario funcionariotec = new Funcionario(nomeFuncionario, salario, "Técnico");
                    System.out.println("Qual departamento do funcionário ?");
                    int i = 0;
                    do {
                        i = 0;
                        lista.mostrarDepartamentos();
                        int x = leia.nextInt();
                        if (x > lista.universidade.size()){
                            System.out.println("Digite uma opção válida.");
                            i = 1;
                        }else
                            lista.universidade.get(x-1).addFuncionario(funcionariotec);
                    }while (i == 1);
                    lista.adicionarFuncionario(funcionariotec);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o nome do Funcionário: ");
                    nomeFuncionario = leia.next();
                    System.out.println("Digite o salário: ");
                    salario = leia.nextDouble();
                    Funcionario funcionariodoc = new Funcionario(nomeFuncionario, salario, "Docente");
                    System.out.println("Qual departamento do funcionário ?");
                    do {
                        i = 0;
                        lista.mostrarDepartamentos();
                        int x = leia.nextInt();
                        if (x > lista.universidade.size()){
                            System.out.println("Digite uma opção válida.");
                            i = 1;
                        }else
                            lista.universidade.get(x-1).addFuncionario(funcionariodoc);
                    }while (i == 1);
                    lista.adicionarFuncionario(funcionariodoc);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                case 4:
                    System.out.println("Digite o nome do Departamento que deseja buscar: ");
                    nomeDepartamento = leia.next();
                    lista.buscarDepartamento(nomeDepartamento);
                    break;
                case 5:
                    System.out.println("Digite o nome Funcionário que deseja buscar: ");
                    nomeFuncionario = leia.next();
                    lista.buscarFuncionario(nomeFuncionario);
                    break;
                case 6:
                    System.out.println("Faixa salarial de: ");
                    double faixaSalariomenor = leia.nextDouble();
                    System.out.println("Até: ");
                    double faixaSalariomaior = leia.nextDouble();
                    lista.faixaSalarioDepart(faixaSalariomenor, faixaSalariomaior);
                    break;
                case 7:
                    System.out.println("Faixa salarial de: ");
                    faixaSalariomenor = leia.nextDouble();
                    System.out.println("Até: ");
                    faixaSalariomaior = leia.nextDouble();
                    lista.faixaSalarialFuncio(faixaSalariomenor, faixaSalariomaior);
                    break;
                case 8:
                    System.out.println("Faixa entre: ");
                    double faixa = leia.nextDouble();
                    System.out.println("e: ");
                    double e = leia.nextDouble();
                    lista.faixaGastoTotal(faixa, e);
                    break;
                case 9:
                    lista.mostrarFuncionarios(1);
                    break;
                case 10:
                    lista.mostrarDepartamentos();
                    break;
                case 11:
                    lista.departamentoseFuncionarios();
                    break;
                case 12:
                    lista.mostrarFuncionarios(2);
                    break;
                case 13:
                    lista.mostrarFuncionarios(3);
                    break;
                case 0:
                    System.out.println("Saindo do Sistema!!");
                    break;
                default:
                    System.out.println("Digite uma opção válida!!!");
            }
        }
    }
}