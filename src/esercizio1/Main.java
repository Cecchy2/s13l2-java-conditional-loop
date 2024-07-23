package esercizio1;

public class Main {
    public static void main(String[] args) {

        System.out.println(stringaPariDispari("Ciao a tutti"));

        System.out.println(annoBisestile(1900));


    }

    public static boolean stringaPariDispari(String str) {
        if ((str.length() % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile (int anno) {
        if (anno % 4 == 0 && anno % 100 == 0 && anno % 400 == 0){
            return true;
        } else {
            return false;
        }
    }
}