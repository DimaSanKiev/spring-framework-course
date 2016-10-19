package guru.springframework.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null;

        switch (language) {
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "ua":
                service = new HelloWorldServiceUkrainianImpl();
                break;
            default:
                new HelloWorldServiceEnglishImpl();
        }

        return service;
    }
}
