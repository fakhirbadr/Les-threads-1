public static void main(String[] args) {
    // Créer 10 threads avec des instances de Talkative
    for (int i = 0; i < 10; i++) {
        Thread thread = new Thread(new Talkative(i));
        thread.start();
    }
}
