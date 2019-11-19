import java.util.Calendar;
import java.util.Date;

public class Main{
    public static void main(String[] args){

        //ENDERECO
        Endereco end1 = new Endereco("Rua 9", 10, "60789-30", "Fortaleza", "Serrinha");

        // FILMES
        Filme f1 = new Filme("Doutor Sono", 9120, 2019, "DVD");
        Filme f2 = new Filme("Coringa", 7320, 2019, "DVD");
        Filme f3 = new Filme("Se Eu Fosse Você", 5640, 2006, "DVD");
        
        //COPIAS
        Copia c1 = new Copia(f1, 2, 5.90);
        Copia c2 = new Copia(f2, 10, 8.80);
        Copia c3 = new Copia(f3, 6, 2.30);
        
        // SOCIO
        Date datas1 = Calendar.getInstance().getTime();
        System.out.println("Data:"+datas1);
        Socio s1 = new Socio("Arnaldo", "12345678901", "55486391225", datas1, end1);

        //ALUGUEL
        int codigo1 = (int)(Math.random() * 10000);
        Locacao l1 = new Locacao(codigo1, s1, c1, datas1);
        l1.addFilme(c2);
        System.out.println(l1.getTotal());
        l1.setTotal(c1.getPreco()+c2.getPreco());
       

        int codigo2 = (int)(Math.random() * 10000);
        Locacao l2 = new Locacao(codigo2, s1, c2, datas1);
        l2.setTotal(c2.getPreco());

        int codigo3 = (int)(Math.random() * 10000);
        Locacao l3 = new Locacao(codigo3, s1, c3, datas1);
        l3.setTotal(c2.getPreco());

        //ADD LOCACAO
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