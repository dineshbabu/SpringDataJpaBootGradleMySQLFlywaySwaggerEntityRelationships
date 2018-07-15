package tutorial.springdata.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ConfigSettings {

    @Autowired
    private Environment environment;

    @Bean
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        return (container -> {
            container.setPort(environment.getProperty("tomcat.port", Integer.class));
            container.setContextPath(environment.getProperty("tomcat.contextPath"));
        });
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("tutorial.springdata.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return (String... args ) -> {
            Logger logger = LoggerFactory.getLogger(ConfigSettings.class);
            logger.info(String.format("Swagger Url: http://localhost:%1s%2s/swagger-ui.html",
                    environment.getProperty("tomcat.port"),
                    environment.getProperty("tomcat.contextPath")));
        };
    }
}
