import java.util.ArrayList;
import java.util.Date;

public class Socio{
    private String nome;
    private String telefone;
    private String rg;
    private String cpf; 
    private Date adesao; 
    private Endereco endereco;
    private ArrayList<Locacao> locacoes = new ArrayList<>();

    public Socio(String nome, String rg, String cpf, Date adesao, Endereco endereco){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.adesao = adesao;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getRG(){
        return this.rg;
    }

    public String getCpf(){
        return this.cpf;
    }

    public Date getAdesao(){
        return this.adesao;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public ArrayList<Locacao> getLocacoes(){
        return this.locacoes;
    }

    public void addLocacao(Locacao locacao){
        this.locacoes.add(locacao);
    }

    public void printLocacoes(){
        System.out.println("--------------- Historico de Locacoes ---------------");
		for (Locacao x : this.locacoes){
            x.printLocacao();
		}
	}

}