package buluju.GarrigozArt;

import java.util.Arrays;
import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import com.fasterxml.jackson.databind.ObjectMapper;


@Configuration
@PropertySource({"classpath:config/rest.properties", "classpath:config/jackson.properties"})
@ComponentScan("buluju.GarrigozArt")
public class ConfiguracionPorJava {


  @Bean
  public ObjectMapper getObjectMapper() {

    ObjectMapper mapper = new ObjectMapper();

    return mapper;
  }


  @Bean
  CorsFilter corsFilter() {
    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    final CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(false);
    config.setAllowedOrigins(Collections.singletonList("*"));
    config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept"));
    config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
    source.registerCorsConfiguration("/**", config);

    return new CorsFilter(source);
  }



}
