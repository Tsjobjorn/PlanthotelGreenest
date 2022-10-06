package Greenest;

public class Cactus extends Plant {

    public Cactus(String name, int size) {
        super(name, size, WaterType.MINERALWATER);
    }

    public String getWaterRequirements() {
        return "2 cl " + this.getTypeOfWater().toString().toLowerCase();
    }
}

