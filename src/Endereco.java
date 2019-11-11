public class Endereco{
    private String rua;
    private int numero;
    private String cep;
    private String complemento;
    private String cidade;
    private String bairro;

    public Endereco(String rua, int numero, String cep, String cidade, String bairro){
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
    }
    public String getRua(){
        return this.rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getCep(){
        return this.cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getComplemento(){
        return this.complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getEndereco(){
        return "Rua:"+this.rua+"\nNumero:"+Integer.toString(this.numero)+"\nCEP:"+this.cep+"\nComplemento:"+this.complemento+"\nCidade:"+this.cidade+"\nBairro"+this.bairro;
    }
}