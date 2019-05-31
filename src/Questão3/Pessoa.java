package Questão3;

public class Pessoa {
    
    private String nome;
    private String endereço;
    private int telefone;
    
    public Pessoa(String n,String e,int t){
        setNome(n);
        setEndereço(e);
        setTelefone(t);
    }
    public String getNome(){
        return this.nome;
    }
    public String getEndereo(){
        return this.endereço;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void setEndereço(String e){
        this.endereço=e;
    }
    public void setTelefone(int t){
        this.telefone=t;
    }
    
}
