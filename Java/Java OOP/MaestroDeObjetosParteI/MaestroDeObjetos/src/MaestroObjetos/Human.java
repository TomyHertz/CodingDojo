package MaestroObjetos;

public class Human {
    private int strength = 3;
    private int intelligence = 3;
    private int stealth = 3;
    private int health = 100;

    public void attack(Human target) {
        int damage = this.strength;
        target.health -= damage;
        System.out.println("Attacked the target. Target's health is now: " + target.health);
    }

    // Getters and setters for properties if needed
    // ...

    // Display human's stats
    public void displayStats() {
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Stealth: " + stealth);
        System.out.println("Health: " + health);
    }
}
