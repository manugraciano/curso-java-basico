package cursojava.aula24exercicio;

public class Exerc03 {

    public static void main (String[] args){

       Livrolivraria livro = new Livrolivraria();

       livro.nome = "Mastering ExtJS";
       livro.autor = "Loiane Groner";
       livro.anoLancamento = 2015;
       livro.preco = 63.39;

       System.out.println("Nome do livro = " + livro.nome);

    }

}
