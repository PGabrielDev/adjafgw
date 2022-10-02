package oi.github.pgabrieldev.adjafgw;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class AppConfig {

    @Value("${config.base.louvor}")
    private String urlLouvor;
    @Bean
    public WebClient registerWebClient(){
        return WebClient.create(urlLouvor);
    }
}
