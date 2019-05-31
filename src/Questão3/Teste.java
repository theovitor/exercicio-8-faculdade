package Questão3;

public class Teste {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Andre","R: 1",999999999);
        Fornecedor f = new Fornecedor("Luiz","R: 5",888888888,2000,500);
        Empregado e = new Empregado("Marcos","R: 7",777777777,0001,1500,7);
        Administrador a = new Administrador("Eliane","R: 21",666666666,0003,1750,5,500);
        Operario o = new Operario("Gustavo","R: 4",555555555,0007,1000,10,300,5);
        
        System.out.println("FORNECEDOR");
        System.out.println(f.obterSaldo());
        
        System.out.println("EMPREGADO");
        System.out.println(e.calcularSalario());

        System.out.println("ADMINISTRADOR");
        System.out.println(a.calcularSalario());
        
        System.out.println("OPERARIO");
        System.out.println(o.calcularSalario());
        
    }    
}
