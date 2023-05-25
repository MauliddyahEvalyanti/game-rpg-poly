public class Enemy extends Character {
    private int atk;
   private String name;


   public Enemy(String name, int atk) {
    this.name = name;
    this.atk = atk;
}

public String getName() {
    return name;
}

public int getAtk() {
    return atk;
}

public void setAtk(int atk) {
    this.atk = atk;
}

@Override
public void move() {
    System.out.println(name + " Menyerang ");
}

public void moveUp() {
    System.out.println(name + " Bergerak naik : " + atk);
}

public void moveDown() {
    System.out.println(name + " Bergerak ke bawah : " + atk);
}

public void moveLeft() {
    int atk = getAtk();
    atk--;
    setAtk(atk);
    System.out.println(name + " Bergerak ke kiri, attack -1 : " + atk );
}

public void moveRight() {
    int atk = getAtk();
    atk++;
    setAtk(atk);
    System.out.println(name + " Bergerak ke kanan, attack +1 : " + atk );
}
}
