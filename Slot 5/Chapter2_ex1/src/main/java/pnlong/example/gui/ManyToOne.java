package pnlong.example.gui;

import org.aspectj.weaver.AnnotationOnTypeMunger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pnlong.example.Configs.AppConfig;
import pnlong.example.pojos.Student;
import pnlong.example.service.StudentService;

public class ManyToOne {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService myService = context.getBean("myService", StudentService.class);
        Student st = new Student("Long", "Pham", 100);
        myService.save(st);
    }

}
