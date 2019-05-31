package Questão1e2;

public class Ave extends Animal {
    
    private boolean voa;
    
    public Ave(String n,boolean v) {
        super(n);
        setVoa(v);
    }
    public boolean getVoa(){
        return this.voa;
    }
    public void setVoa(boolean v){
        this.voa=v;
    }
    public void talk(){
        System.out.println("Piu Piu");
    }
}
