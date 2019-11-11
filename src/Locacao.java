import java.util.ArrayList;
import java.util.Calendar;

public class Locacao{
    private int codigo;
	private Socio socio;
	private ArrayList<Copia> filmes = new ArrayList<>();
    private Calendar data;
    
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
    public void setFilmes(Copia filme){
        filmes.add(filme);
    }

    public Calendar getData(){
        return this.data;
    }

    public void setData(Calendar data){
        this.data = data;
    }

    
    public void printLocacao(){
        System.out.println("Codigo:"+this.codigo);
        System.out.println("Socio: "+this.socio.getNome());
        for (Copia x : this.filmes){
            System.out.println("Filme : "+x.getFilme().getTitulo()+"\nCopias: "+x.getQuantidade());
            System.out.println("---------------");
		}
        System.out.println("Data da Locacao: "+this.data.getInstance().getTime());
    }


}
