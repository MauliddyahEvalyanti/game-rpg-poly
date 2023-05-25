public class Witch extends Enemy {

    public Witch(String name, int atk) {
        super(name, atk);
    }

    @Override
    public void move() {
        System.out.println("Witch menyerang dengan attack  : " + getAtk());
    }

    @Override
    public void moveLeft() {
        int atk = getAtk();
        atk--;
        setAtk(atk);
        
        System.out.println("Witch bergerak ke kanan dengan attack : " + atk);
    }
}
