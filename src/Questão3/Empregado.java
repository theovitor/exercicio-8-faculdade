package Questão3;

public class Empregado extends Pessoa{
    
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado(String n, String e, int t, int s, double x, double i){
        super(n, e, t);
        setCodSetor(s);
        setSalBase(x);
        setImposto(i);
    }
    public int getCodSetor(){
        return this.codigoSetor;
    }
    public double getSalBase(){
        return this.salarioBase;
    }
    public double getImposto(){
        return this.imposto;
    }
    public void setCodSetor(int s){
        this.codigoSetor=s;
    }
    public void setSalBase(double x){
        this.salarioBase=x;
    }
    public void setImposto(double i){
        this.imposto=i;
    }
    public double calcularSalario(){
        return this.getSalBase()-(this.getSalBase()*this.getImposto())/100;
    }
    
}
