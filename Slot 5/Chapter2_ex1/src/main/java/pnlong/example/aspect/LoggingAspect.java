package pnlong.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger(LoggingAspect.class);
    public LoggingAspect(){

    }
    @Before("execution(* pnlong.example.service.StudentServiceImpl.save(..))")
    public void logBefore() {
        logger.info("LoggingAspect :Before method save Student()");
        System.out.println("LoggingAspect :Before method save Student()");
    }
    @After("execution(* pnlong.example.service.StudentServiceImpl.save(..))")
    public void logAfter() {
        logger.info("LoggingAspect :After method save Student()");
        System.out.println("LoggingAspect :After method save Student()");
    }
}
