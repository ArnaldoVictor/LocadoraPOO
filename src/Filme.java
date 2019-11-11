import java.util.ArrayList;

public class Filme{
    private String titulo;
    private int duracao;
    private int anoLancamento;
    private String formato;
    private ArrayList<Copia> copias = new ArrayList<>();
    private ArrayList<String> atores = new ArrayList<>();

    public Filme(String titulo, int duracao, int anoLancamento, String formato){
        this.titulo = titulo;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.formato = formato;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    
    public ArrayList<Copia> getCopias(){
        return this.copias;
    }
    
    public void setCopias(Copia copia){
        this.copias.add(copia);
    }
    
    public ArrayList<String> getAtores(){
        return this.atores;
    }

    public void setAtores(String ator){
        this.atores.add(ator);
    }
    
    public int getDuracao(){
        return this.duracao;
    } 

    public int getAnoLancamento(){
        return this.anoLancamento;
    } 

    public String getFormato(){
        return this.formato;
    } 

    public void printCopias(){
		for (Copia x : this.copias){
			System.out.println("Filme : "+x.getFilme().getTitulo()+"\nCopias: "+x.getQuantidade());
		}
	}

}