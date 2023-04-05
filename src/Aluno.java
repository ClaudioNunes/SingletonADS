public class Aluno {

    private static Aluno instancia;
    private String nome;
    private int idade;
    private String ra;

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public  static  Aluno getInstance()
    {
      if (instancia == null) {
          instancia = new Aluno();
      }
      return  instancia;
    }

    private Aluno() {
    }
}
