import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class GeopoliticalZoneTest {

    @Test
    public void thatThatNigeriaHas6GeopoliticalZone(){
        GeopoliticalZone [] tribes = GeopoliticalZone.values();
        for(GeopoliticalZone tribe: tribes){
            System.out.println(Arrays.toString(tribe.getGeopolitical()));

        }
    }


}