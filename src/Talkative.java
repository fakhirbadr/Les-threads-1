public class Talkative implements Runnable {
    private int attribut;

    public Talkative(int attribut) {
        this.attribut = attribut;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Valeur de l'attribut : " + attribut);
        }
    }
}