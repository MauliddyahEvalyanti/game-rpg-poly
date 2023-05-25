public class Fighter extends Hero {
    public Fighter(String name, int atk) {
        super(name, atk);
        }
    

    @Override
    public void move() {
        System.out.println("---------------------------------");
        System.out.println("Fighter menyerang dengan attack : " + getAtk());
        System.out.println("---------------------------------");
    }

    @Override
    public void moveUp() {
       
      
        System.out.println(" Fighter bergerak ke atas dengan attack : " + getAtk());
    }
}
