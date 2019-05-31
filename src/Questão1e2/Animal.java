package Questão1e2;

public class Animal {
    private String nome;
    
    public Animal(String n){
        setNome(n);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void imprime(){
        System.out.println(this.getNome());
    }
    public void talk(){
    }
}
