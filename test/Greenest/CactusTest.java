package Greenest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {

    public Cactus testCactus=new Cactus("CactusTest", 20);

    @Test
    void getTypeOfWater() {
        assert(testCactus.getTypeOfWater().equals(WaterType.MINERALWATER));
        assert (!testCactus.getTypeOfWater().equals(WaterType.PROTEINSOLUTION));
    }

    @Test
    void getWaterRequirements() {
    assert(testCactus.getWaterRequirements().equals("2 cl mineralwater"));
    }
}