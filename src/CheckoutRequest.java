import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class CheckoutRequest {
    private String orderId;
    private UserDto user;
    private Price price;
}
