import service.ApplicationService;
import service.ApplicationServiceimplementation;

public class Main {

    public static void main(String[] args) {

        ApplicationService applicationService = new ApplicationServiceimplementation();
        applicationService.start();

    }
}