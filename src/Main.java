import java.util.Calendar;

public class Main{
    public static void main(String[] args){

        //ENDERECO
        Endereco end1 = new Endereco("Rua 9", 10, "60789-30", "Fortaleza", "Serrinha");

        // FILMES
        Filme f1 = new Filme("Doutor Sono", 9120, 2019, "AVI");
        Copia c1 = new Copia(f1, 2);
        Filme f2 = new Filme("Coringa", 7320, 2019, "AVI");
        Copia c2 = new Copia(f2, 10);
        Filme f3 = new Filme("Se Eu Fosse Você", 5640, 2006, "AVI");
        Copia c3 = new Copia(f3, 6);
        
        // SOCIO
        Calendar datas1 = Calendar.getInstance();
        Socio s1 = new Socio("Arnaldo", "12345678901", "55486391225", datas1, end1);

        //ALUGUEL
        int codigo1 = (int)(Math.random() * 10000);
        Locacao l1 = new Locacao(codigo1, s1, c1);
        int codigo2 = (int)(Math.random() * 10000);
        Locacao l2 = new Locacao(codigo2, s1, c2);
        int codigo3 = (int)(Math.random() * 10000);
        Locacao l3 = new Locacao(codigo3, s1, c3);
        s1.addLocacao(l1);
        s1.addLocacao(l2);
        s1.addLocacao(l3);


      
        //SAIDA DE DADOS
        //Locacoes
        System.out.println("--------------------- Locacao 1  --------------------");
        l1.printLocacao();
        System.out.println();
        s1.printLocacoes();

        //Copias
        System.out.println("------------------ Copias Filme 1 -------------------");
        f1.addCopia(c1);
        f1.printCopias();

        // String titulo1 = f1.getTitulo();
        // System.out.println("TITULO:"+titulo1);
    }
}