import java.util.Calendar;

public class Main{
    public static void main(String[] args){

        //ENDERECO
        Endereco end1 = new Endereco("Rua 9", 10, "60789-30", "Fortaleza", "Serrinha");

        // FILME
        Filme f1 = new Filme("Matrix", 2000, 2018, "AVI");
        Copia c1 = new Copia(f1, 20);
        
        // SOCIO
        Calendar datas1 = Calendar.getInstance();
        Socio s1 = new Socio("Arnaldo", "12345678901", "55486391225", datas1, end1);

        //ALUGUEL
        int codigo = (int)(Math.random() * 10000);
        Locacao l1 = new Locacao(codigo, s1, c1);
        s1.addLocacao(l1);


      
        //SAIDA DE DADOS
        //Locacoes
        l1.printLocacao();
        s1.printLocacoes();

        //Copias
        f1.setCopias(c1);
        f1.printCopias();

        // String titulo1 = f1.getTitulo();
        // System.out.println("TITULO:"+titulo1);
    }
}