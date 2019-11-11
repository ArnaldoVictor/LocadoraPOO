public class Copia {
	private Filme filme;
	private int quantidade;
	
	public Copia(Filme filme, int quantidade){
		this.filme = filme;
		this.quantidade = quantidade;
	}
	
	public Filme getFilme() {
		return filme;
    }
    
	public void setFilme(Filme filme) {
		this.filme = filme;
    }
    
	public int getQuantidade() {
		return quantidade;
    }
    
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}