public class Main {

    public static void main(String[] args) {


        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        MOTService motService = new MOTService();

        CarService carService = new CarService(
                carDAO,
                emailService,
                motService
        );

        

    }
}
