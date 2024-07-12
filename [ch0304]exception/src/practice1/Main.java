package practice1;

import java.util.Random;

class RandomAdapter implements RandomProvider {
    private final Random random = new Random();

    @Override
    public boolean nextBoolean() {
        return random.nextBoolean();
    }
}

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard(new RandomAdapter());

        try {
            wizard.castSpell();
        } catch (SpellException e) {
            System.out.println(e.getMessage());
        }
    }
}
