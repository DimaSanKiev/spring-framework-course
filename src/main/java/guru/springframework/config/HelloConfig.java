package guru.springframework.config;

import guru.springframework.services.HelloWorldFactory;
import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("es");
    }

    @Bean
    @Profile("french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory) {
        return factory.createHelloWorldService("fr");
    }

    @Bean
    @Profile("german")
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
        return factory.createHelloWorldService("de");
    }

    @Bean
    @Profile("ukrainian")
    public HelloWorldService helloWorldServiceUkrainian(HelloWorldFactory factory) {
        return factory.createHelloWorldService("ua");
    }
}
