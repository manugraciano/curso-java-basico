package cursojava.aula24exercicio;

import java.util.Date;

public class Exerc04 {

    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        Livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro = " + livro.nome);
    }

}
