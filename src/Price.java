import lombok.Value;

import java.math.BigDecimal;

@Value
public class Price {
    double amount;
    String currency;
}
