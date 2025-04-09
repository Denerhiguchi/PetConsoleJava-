class Pet {
    private String nome; 
    private int idade;
    private String tipo;
    private String raca;

    
    public Pet(String nome, int idade, String tipo, String raca){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.raca = raca;
    }
    
    public String getNome(){
        return nome;
    }
     
    
 public int getIdade(){
        return idade;
 }
 
  
    public String getTipo(){
        return tipo;
 }
 
   
    public String getRaca(){
        return raca;
 }
 
  
   public void setNome(String nome) {
        this.nome = nome;
     }
     
      public void setIdade(int idade){
        this.idade = idade;
  }
  
   public void setTipo(String tipo){
        this.tipo = tipo;
  }
 
   public void setRaca(String raca){
        this.raca = raca;
  }
  
   public void exibirInformacoes(){
       System.out.println("nome: "  + nome);
       System.out.println("idade: " +idade);
       System.out.println("tipo: "  + tipo);
       System.out.println("raça: "  + raca);
   }
    
}

    public class Main {
    public static void main(String[] args) {
        
        Pet pet1 = new Pet("Zeus",3,"Cachoro","Labrador"); 
        Pet pet2 = new Pet("Loki",2,"Gato","Siamês");
        Pet pet3 = new Pet("Juio",5,"Gato","Branco"); 
        Pet pet4 = new Pet("Zé",2,"Gato","Preto");
        
        System.out.printf("%10s | %-5s | %-10s | %-10s%n","Nome","Idade","Tipo","Raça");
        System.out.println("-----------------------------------------");
         System.out.printf("%-10s | %-5d | %-10s | %-10s%n", pet1.getNome(), pet1.getIdade(), pet1.getTipo(), pet1.getRaca());
        System.out.printf("%-10s | %-5d | %-10s | %-10s%n", pet2.getNome(), pet2.getIdade(), pet2.getTipo(), pet2.getRaca());
        System.out.printf("%-10s | %-5d | %-10s | %-10s%n", pet3.getNome(), pet3.getIdade(), pet3.getTipo(), pet3.getRaca());
        System.out.printf("%-10s | %-5d | %-10s | %-10s%n", pet4.getNome(), pet4.getIdade(), pet4.getTipo(), pet4.getRaca());
    }
        
    }
    

        