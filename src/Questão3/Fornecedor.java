package Questão3;

public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida;
    
    public Fornecedor(String n, String e, int t,double c,double d) {
        super(n, e, t);
        setValorC(c);
        setValorD(d);
        
    }
    public double getValorC(){
        return this.valorCredito;
    }
    public double getValorD(){
        return this.valorDivida;
    }
    public void setValorC(double c){
        this.valorCredito=c;
    }
    public void setValorD(double d){
        this.valorDivida=d;
    }
    public double obterSaldo(){
        return this.getValorC()-this.getValorD();
    }
}
