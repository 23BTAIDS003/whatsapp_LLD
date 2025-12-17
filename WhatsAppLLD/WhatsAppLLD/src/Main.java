import model.*;
import service.WhatsAppService;

public class Main {

    public static void main(String[] args) {

        WhatsAppService service = new WhatsAppService();

        User abisha = new User("1", "Abisha", "9999999999");
        User preethi = new User("2", "Preethi", "8888888888");

        service.registerUser(abisha);
        service.registerUser(preethi);

        // Users come online
        abisha.goOnline();
        preethi.goOnline();

        PersonalChat chat = new PersonalChat(abisha, preethi);

        Message m1 = new Message("m1", abisha, "Hi Preethi!");
        chat.sendMessage(m1);

        System.out.println("----");

        Message m2 = new Message("m2", preethi, "Hi Abisha!");
        chat.sendMessage(m2);
    }
}
