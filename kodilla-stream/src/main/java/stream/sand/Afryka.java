package stream.sand;

import java.math.BigDecimal;

public class Afryka implements SandStorage {


    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity= new BigDecimal("203935353525028");
        return sandQuantity;
    }
}
