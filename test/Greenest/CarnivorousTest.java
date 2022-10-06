package Greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousTest {

    public Carnivorous testCarni=new Carnivorous("CarniTest", 50);

    @Test
    void getTypeOfWater() {

        assert (testCarni.getTypeOfWater().equals(WaterType.PROTEINSOLUTION));
        assert (!testCarni.getTypeOfWater().equals(WaterType.MINERALWATER));


    }

    @Test
    void getWaterRequirements() {
        assert (testCarni.getWaterRequirements().equals("0,2 liter proteinsolution"));
        assert (!testCarni.getWaterRequirements().equals("4 liter proteinsolution"));
        testCarni.setSize(150);
        System.out.println("Size is set to "+testCarni.getSize());
        assert (testCarni.getWaterRequirements().equals("0,4 liter proteinsolution"));
    }
}