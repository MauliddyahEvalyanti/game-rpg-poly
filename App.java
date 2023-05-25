public class App {

    public static void main(String[] args) {
        Hero hero = new Hero("Batman",10);
        Enemy enemy = new Enemy("Joker", 2);

        // Static Polymorphism pada class Hero
        hero.move(); 
        hero.moveLeft(); 

        // Static Polymorphism pada class Enemy
        enemy.moveUp(); 
        enemy.move(); 

        Character character1 = new Hero("Batman",20);
        Character character2 = new Enemy("Joker",10);
        Character character3 = new Witch("Riddler", 5);
        Character character4 = new Fighter("Cat Woman",10);

        // Dynamic Polymorphism menggunakan referensi class Character ke objek class Hero, Enemy, Witch, Fighter
        character1.move(); 
        character2.move(); 
        character3.move(); 
        character4.move(); 

        // Dynamic Polymorphism dengan casting (mengubah objek Witch menjadi objek Fighter)
        Witch witch = new Witch("Riddler",6);
     
        Character character = (Character) witch;
        character.move(); 
    
    }
}
