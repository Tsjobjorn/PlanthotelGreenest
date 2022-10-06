package Greenest;

import java.text.DecimalFormat;

abstract class Plant implements WaterReq {
    private String name;
    private int size;
    protected WaterType typeOfWater;
    protected DecimalFormat f = new DecimalFormat("###.##");


    public Plant(String name, int size, WaterType waterType) {
        setSize(size);
        setName(name);
        setTypeOfWater(waterType);
    }


    public String getWaterRequirements() {
        return null;
    }


    public WaterType getTypeOfWater() {
        return typeOfWater;
    }

    public void setTypeOfWater(WaterType typeOfWater) {
        this.typeOfWater = typeOfWater;
    }


    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


