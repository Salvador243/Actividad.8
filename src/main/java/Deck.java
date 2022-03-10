import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private final String[] Palo = {"corazones", "diamantes", "trébol", "picas"};
    private final String[] Color = {"rojo", "negro"};
    private final String[] Valor = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();

        for (int palo = 0; palo < 2; palo++) {
            for (String s : Valor) {
                deck.add(new Card(Palo[palo], Color[0], s));
            }
        }

        for (int palo = 2; palo < 4; palo++) {
            for (String s : Valor) {
                deck.add(new Card(Palo[palo], Color[1], s));
            }
        }
    }

    public int getSize() {
        return deck.size();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void suflle() {
        Collections.shuffle(deck);
        System.out.println("***************************************************");
        System.out.println("Se mezcló el Deck.");
        for (Object elemento : deck) {
            System.out.println("      " + elemento + "     ");
        }
        System.out.println("***************************************************");
    }

    public void head(){
        System.out.println("***************************************************");
        System.out.println("Primera carta del head");
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas");
        System.out.println("***************************************************");

    }


    public void pick() {
        Random random = new Random();
        int valor = random.nextInt(deck.size());
        System.out.println("***************************************************");
        System.out.println("Metodo pick");
        System.out.println(deck.get(valor));
        deck.remove(valor);
        System.out.println("Quedan " + deck.size() + " cartas");
        System.out.println("***************************************************");

    }

    public void hand() {
        System.out.println("***************************************************");
        System.out.println("Metodo hand");
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
        System.out.println("***************************************************");
    }
}