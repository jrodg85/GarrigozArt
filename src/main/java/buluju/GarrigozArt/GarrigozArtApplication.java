package buluju.GarrigozArt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/jpa-config.xml"})
public class GarrigozArtApplication {

  public static void main(String[] args) {
    SpringApplication.run(GarrigozArtApplication.class, args);
  }

}
