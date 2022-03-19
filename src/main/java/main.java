import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        Deck mazo = new Deck();
        int salida = 0;
        do{
            System.out.println("Bienvenido a Poker!");
            System.out.println("Selecciona una opcion");
            System.out.println("1 Mezclar deck " +
                    "\n\r2 Sacar una carta" +
                    "\n\r3 Carta al azar" +
                    "\n\r4 Generar una mano de 5 cartas" +
                    "\n\r0 Salir");
            int opcion = Integer.parseInt(sc.next());

            switch(opcion){
                case 1:
                    System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());
                    System.out.println("\n");
                    mazo.suflle();
                    System.out.println("Quedan " + mazo.getSize() + " cartas en deck \n\r");
                    break;
                case 2:
                    System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());
                    System.out.println("\n");
                    mazo.head();
                    System.out.println("Quedan " + mazo.getSize() + " cartas en deck \n\r");
                    break;
                case 3:
                    System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());
                    System.out.println("\n");
                    mazo.pick();
                    System.out.println("Quedan " + mazo.getSize() + " cartas en deck \n\r");
                    break;
                case 4:
                    System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());
                    System.out.println("\n");
                    mazo.hand();
                    System.out.println("Quedan " + mazo.getSize() + " cartas en deck \n\r");
                    break;
                case 0:
                    salida = 1;
                    break;
                default:
                    System.out.println("\n\r*** Opcion no valida ***\n\r");
                    break;
            }

        }while(salida != 1);
    }
}