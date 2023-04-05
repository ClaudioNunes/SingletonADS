// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Aluno aluno = Aluno.getInstance();

        aluno.setNome("Ozonio");
        Aluno aluno1 = Aluno.getInstance();

        System.out.println(aluno1.getNome());




        }
    }
