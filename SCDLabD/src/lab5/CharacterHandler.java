package lab5;

public class CharacterHandler extends Thread {
    public static int constraint = 0;
    private volatile boolean running = true;
    public static int seed = 65;

    public CharacterHandler() {

    }

    public static void setConstraint(int constraint){
        CharacterHandler.constraint = constraint;
    }

    public void evaluateConstraint(){
        if (constraint < seed){
            stopRunning();
        }
    }
    public void stopRunning(){
        running = false;
    }

    private char getCharacter() {
        char newCharacter = (char) seed;
        seed += 1;
        return newCharacter;
    }

    public void run() {
        if (constraint == 0) {
            throw new IllegalArgumentException("Constraint must be set and greater than zero.");
        }

        while (running) {
            char generatedChar = getCharacter();
            System.out.println("Generated character: " + generatedChar);

            evaluateConstraint();

            try {
                Thread.sleep(500); // Sleep for half a second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("Thread stopped.");
    }

    public static void main(String[] args) {
        CharacterHandler ch1 = new CharacterHandler();
        CharacterHandler ch3 = new CharacterHandler();
        CharacterHandler ch2 = new CharacterHandler();
        CharacterHandler.setConstraint(121);

        ch1.start();
        ch2.start();
        ch3.start();
    }
}
