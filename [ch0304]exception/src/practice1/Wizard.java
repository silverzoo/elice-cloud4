package practice1;

interface RandomProvider {
    boolean nextBoolean();
}

public class Wizard {

    private RandomProvider randomProvider;

    public Wizard(RandomProvider randomProvider) {
        this.randomProvider = randomProvider;
    }

    public void castSpell() throws SpellException {
        boolean spellSuccess = this.randomProvider.nextBoolean();
        if (!spellSuccess) {
            System.out.println("🧙: 주문 실패! 다시 시도해야 한다.");
            throw new SpellException("Spell failed");
        } else {
            System.out.println("🧙: 주문 성공! 마법이 발동되었다.");
        }
    }
}
