import java.util.ArrayList;
import java.util.Calendar;

public class Locacao{
    private int codigo;
	private Socio socio;
	private ArrayList<Copia> filmes = new ArrayList<>();
    private Calendar data;
    private Double total;
    
	public Locacao(int codigo, Socio socio, Copia filme){
        this.codigo = codigo;
		this.socio = socio;
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

    public Calendar getData(){
        return this.data;
    }

    public void setData(Calendar data){
        this.data = data;
    }

    public Double getTotal(){
        if(this.total == null){
            return 0.00;
        }else{
            return this.total;
        }
    }

    public void setTotal(Double total){
        this.total = total;
    }

    public void printLocacao(){
        System.out.println("Codigo:"+this.codigo);
        System.out.println("Socio: "+this.socio.getNome());

        for (Copia x : this.filmes){
            System.out.println("\nFilme : "+x.getFilme().getTitulo()+"\nCopias: "+x.getQuantidade());
            System.out.printf("Preco: R$%.2f\n", x.getPreco());
		}
        System.out.println("Data da Locacao: "+this.data.getInstance().getTime());
        System.out.printf("TOTAL: R$%.2f\n", this.total);
        System.out.println("-----------------------------------------------------");
    }


}
