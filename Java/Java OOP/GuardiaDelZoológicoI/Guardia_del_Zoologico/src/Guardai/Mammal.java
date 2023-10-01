package Guardai;

public class Mammal {
    protected int energyLevel;

    public Mammal() {
        this.energyLevel = 100; // Valor predeterminado
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }
}
