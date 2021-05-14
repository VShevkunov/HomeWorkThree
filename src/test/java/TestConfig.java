import org.aeonbits.owner.Config;

@Config.Sources({ "classpath:TestConfig.properties" })

public interface TestConfig extends Config {
    String hostnameOtus();
    String hostnameTele2();
    String expectedTitle();
    String contactsBtn();
    String actualAddressElement();
    String expectedAddress();
    String searchNumberField();
    String FAQ();
    String questionBtn();
    String answerText();
    String actualAnswer();
    String emailForm();
    String subscribeTextModule();
    String expectedSubscribeText();
    String subscibeBtn();
}