package Greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    public Palm testPalm = new Palm("PalmeTest", 100);

    @Test
    void getTypeOfWater() {
        assert (testPalm.getTypeOfWater().equals(WaterType.WATER));
        assert (!testPalm.getTypeOfWater().equals(WaterType.MINERALWATER));
    }


    @Test
    void getWaterRequirements() {
        assert (testPalm.getWaterRequirements().equals("0,5 liter water"));
        assert (!testPalm.getWaterRequirements().equals("1,5 liter water"));
        testPalm.setSize(300);
        System.out.println("Size is set to "+testPalm.getSize());
        assert (testPalm.getWaterRequirements().equals("1,5 liter water"));



    }
}