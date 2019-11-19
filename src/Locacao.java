import java.util.ArrayList;
import java.util.Date;

public class Locacao{
    private int codigo;
	private Socio socio;
	private ArrayList<Copia> filmes = new ArrayList<>();
    private Date data;
    private Double total;
    
	public Locacao(int codigo, Socio socio, Copia filme, Date data){
        this.codigo = codigo;
		this.socio = socio;
        this.data = data;
		filmes.add(filme);
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public Socio getSocio(){
        return this.socio;
    }

    public ArrayList<Copia> getFilmes(){
        return this.filmes;
    }
    public void addFilme(Copia filme){ 
        filmes.add(filme);
    }

    public Date getData(){
        return this.data;
    }

    public void setData(Date data){
        this.data = data;
    }

    public Double getTotal(){
        if(total == null)
            return 0.0;
        else
            return this.total;
    }

    public void setTotal(Double total){
        if(getTotal() == 0.0)
            this.total = total;
        else
            this.total += total;
    }

    public void printLocacao(){
        System.out.println("Codigo:"+this.codigo);
        System.out.println("Socio: "+this.socio.getNome());

        for (Copia x : this.filmes){
            System.out.println("\nFilme : "+x.getFilme().getTitulo()+"\nCopias: "+x.getQuantidade());
            System.out.printf("Preco: R$%.2f\n", x.getPreco());
		}

        System.out.println("Data da Locacao: "+this.data);
        System.out.printf("TOTAL: R$%.2f\n", this.total);
        System.out.println("-----------------------------------------------------");
    }


}
