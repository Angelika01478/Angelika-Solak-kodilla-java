import org.junit.Assert;
import org.junit.Test;
import stream.sand.Afryka;
import stream.sand.Asia;
import stream.sand.Europe;
import stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.*;

public class SandStorageTestSuite {

    @Test
    public void testGetSandBeansQuantity(){

        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Afryka());
        continents.add(new Asia());

        BigDecimal totalSand= BigDecimal.ZERO;
        for(SandStorage oneOfContinetns : continents){
            totalSand=totalSand.add(oneOfContinetns.getSandBeansQuantity());
        }

        BigDecimal expectedSand= new BigDecimal("448368986602947");
        Assert.assertEquals(expectedSand,totalSand);

    }
    @Test
    public void testGetSandBeansQuantityWithReduce(){
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Afryka());
        continents.add(new Asia());

        BigDecimal totalSand= continents.stream()
                .map(x->x.getSandBeansQuantity())
                .reduce(BigDecimal.ZERO, (sum, current)->sum.add(current));

        BigDecimal expectedSand= new BigDecimal("448368986602947");
        Assert.assertEquals(expectedSand,totalSand);

    }

}
