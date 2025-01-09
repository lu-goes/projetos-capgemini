import java.util.Scanner;

public class TrabalhandoArrays {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);

        String [] paises = new String[4];

        for (int i = 0; i < 4 ; i++) {
            System.out.println("Informe um país: ");
            paises [i] = sc.nextLine();
            
        }

        for (String listaPaises : paises) {
            System.out.println(listaPaises);
            
        }

        sc.close();

    }
}
