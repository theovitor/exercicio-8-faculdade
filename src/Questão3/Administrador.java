package Questão3;

public class Administrador extends Empregado{
    
    private double ajudadeCusto;
    
    public Administrador(String n, String e, int t, int s, double x, double i, double a){
        super(n, e, t, s, x, i);
        setAjudaC(a);
        
    }
    public double getAjudaC(){
        return this.ajudadeCusto;
    }
    public void setAjudaC(double a){
        this.ajudadeCusto=a;
    }
    public double calcularSalario(){
        return this.getAjudaC()+super.calcularSalario();
    }
}
