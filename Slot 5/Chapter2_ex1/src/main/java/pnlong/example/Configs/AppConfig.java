package pnlong.example.Configs;

import org.springframework.context.annotation.Bean;
import pnlong.example.aspect.LoggingAspect;
import pnlong.example.service.StudentService;
import pnlong.example.service.StudentServiceImpl;

public class AppConfig {
    @Bean
    public StudentService myService(){return new StudentServiceImpl();
    }
    @Bean
    public LoggingAspect loggingAspect(){return new LoggingAspect();
    }

}
