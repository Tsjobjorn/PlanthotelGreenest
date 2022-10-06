package Greenest;

public class Palm extends Plant {

    public Palm(String name, int size) {
        super(name, size, WaterType.WATER);
    }

    public String getWaterRequirements() {

        return f.format(0.5 * (getSize() / 100d)) + " liter " + this.getTypeOfWater().toString().toLowerCase();
    }
}
