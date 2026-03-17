public class MainTask4 {
        public static void main(String[] args) {
            UserDto user = new UserDto();
            user.setUsername("Veronika");
            user.setEmail("test@example.com");

            Price price = new Price(150.50, "UAH");

            CheckoutRequest request = CheckoutRequest.builder()
                    .orderId("ORD-001")
                    .user(user)
                    .price(price)
                    .build();

            System.out.println("Замовлення: " + request.toString());
        }
}
