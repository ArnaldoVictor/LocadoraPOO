public class Copia {
	private Filme filme;
	private int quantidade;
	private Double preco;
	
	public Copia(Filme filme, int quantidade, Double preco){
		this.filme = filme;
		this.quantidade = quantidade;
		this.preco = preco;
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

	public Double getPreco(){
		if(preco == null){
			return 0.00;
		}else{
			return this.preco;
		}
	}

	public void setPreco(Double preco){
		this.preco = preco;
	}

}