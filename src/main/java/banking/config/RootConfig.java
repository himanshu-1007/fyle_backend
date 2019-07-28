package banking.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan( basePackages = "banking",excludeFilters = @ComponentScan.Filter(Controller.class))
public class RootConfig {
}
