import java.util.Scanner;

public class BuscaAlunos {
    public static void main(String[] args){
        //Armazenar nomes de alunos em um array
        String[]alunos = {"Alice", "Bob","Carlos","David","Eva"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Nome do Aluno par Buscar:");
        String nomeBusca = scanner.nextLine();
        //Implementar unção de busca e exibir resultado
        if(verificarAluno(alunos, nomeBusca)) {
            System.out.println("O aluno" + nomeBusca + "foi encontrado na lista.");
        }else {
            System.out.println("O aluno"+ nomeBusca +" não foi encontrado.");
        }
        scanner.close();
    }
    public static boolean verificarAluno(String[] listaAlunos, String nomeAlvo) {
        for (String aluno : listaAlunos) {
            // Usa equalsIgnoreCase para ignorar maiúsculas/minúsculas
            if (aluno.equalsIgnoreCase(nomeAlvo)) {
                return true; // Encontrado
            }
        }
        return false; // Não encontrado
    }
}