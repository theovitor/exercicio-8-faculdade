package Questão1e2;

public class Vaca extends Mamifero{
    
    private boolean temLeite;
    
    public Vaca(String n, int p,boolean l) {
        super(n, p);
        setTemLeite(l);
    }
    public boolean getTemLeite(){
        return this.temLeite;
    }
    public void setTemLeite(boolean l){
        this.temLeite=l;
    }
    public void talk(){
        System.out.println("Muuu");
       
    }
}
