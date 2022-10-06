package Greenest;

public class Carnivorous extends Plant {
    public Carnivorous(String name, int size) {
        super(name, size, WaterType.PROTEINSOLUTION);
    }

    public String getWaterRequirements() {
        return f.format(0.1 + (0.2 * getSize() / 100d)) + " liter " + this.getTypeOfWater().toString().toLowerCase();
    }
}

