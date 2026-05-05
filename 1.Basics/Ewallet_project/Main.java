import service.ApplicationService;
import service.Implementations.ApplicationServiceImplementation;



public class Main {

    public static void main(String[] args) {

        ApplicationService applicationService = new ApplicationServiceImplementation();
        applicationService.start();


    }
}