package stream.sand;

import java.math.BigDecimal;

public class Asia implements SandStorage {


    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity= new BigDecimal("242424068094374");
        return sandQuantity;
    }
}
