package MaestroObjetos;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        // Display initial stats of both humans
        System.out.println("Human 1 stats:");
        human1.displayStats();

        System.out.println("\nHuman 2 stats:");
        human2.displayStats();

        human1.attack(human2); // Human 1 attacks Human 2

        // Display stats after the attack
        System.out.println("\nHuman 1 stats after attack:");
        human1.displayStats();

        System.out.println("\nHuman 2 stats after attack:");
        human2.displayStats();
    }
}
