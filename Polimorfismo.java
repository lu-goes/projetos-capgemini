public class Polimorfismo {
    public static void main(String[] args) {
        
        Mamiferos mamiferos1 = new Elefante();
        System.out.println("A cota de leite do elefante é de: " + mamiferos1.cotaDiariaLeite());

        Mamiferos rato1 = new Rato();
        System.out.println("A cota de leite do rato é de: " + rato1.cotaDiariaLeite());
    }
}
