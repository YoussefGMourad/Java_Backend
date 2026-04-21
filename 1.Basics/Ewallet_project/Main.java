import service.ApplicationService;
import service.ApplicationServiceImplementation;

public class Main {

    public static void main(String[] args) {

        ApplicationService applicationService = new ApplicationServiceImplementation();
        applicationService.start();

    }
}