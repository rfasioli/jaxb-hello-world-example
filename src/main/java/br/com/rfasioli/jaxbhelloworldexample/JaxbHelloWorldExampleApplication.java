package br.com.rfasioli.jaxbhelloworldexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rfasioli.jaxbhelloworldexample.service.jaxb.JAXBExample;

@SpringBootApplication
public class JaxbHelloWorldExampleApplication implements CommandLineRunner {

	@Autowired JAXBExample jaxbExample;
	public static void main(String[] args) {
				//disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(JaxbHelloWorldExampleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
	}

    //access command line arguments
    @Override
    public void run(String... args) throws Exception {
    	System.out.println("javaObject2Xml");
    	jaxbExample.javaObject2Xml();
    	System.out.println("Xml2JavaObject");
    	jaxbExample.Xml2JavaObject();
    }
}
