package Guardai;

public class Bat extends Mammal{
    public Bat() {
        this.energyLevel = 300; // Valor predeterminado
    }

    public void fly() {
        System.out.println("The bat takes off and makes a whooshing sound!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Well, never mind... it's not that bad.");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("The city is on fire! You can hear the chaos!");
        energyLevel -= 100;
    }
}
