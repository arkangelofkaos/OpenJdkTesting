/* @test
@summary FooTest - a trivial test designed to demonstrate a test failing.
@run main FooTest
 */
public class FooTest {

    public static final String EXPECTED_MESSAGE = "Hello World";

    public static void main(String... ignored) throws Exception {
        String message = Foo.getMessage();

        if (!message.equals(EXPECTED_MESSAGE)) {
            throw new RuntimeException("FooTest failed, expected message was: " + EXPECTED_MESSAGE
                    + " but instead received: " + message);
        }
    }

}
