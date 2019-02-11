package stream.sand;

import java.math.BigDecimal;

public class Europe implements SandStorage {


    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("2009564983545");
        return sandQuantity;
    }
}
