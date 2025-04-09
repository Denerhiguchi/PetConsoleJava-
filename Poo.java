class Calculadora{
    //Atributos da ClassCast
    
    private int a;
    private int b;
    
    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
        
    }
public int somar(){
    return a + b;
}
    public int subtrair(){
        return a - b ;
    }
    
}
public class Main {
    public static void main(String[] args) {
    Calculadora calc = new Calculadora(10,4);
    
    System.out.println(calc.somar());
    System.out.println(calc.subtrair());
}

}