package io.microservice.SpringbootLogging.genericLogging;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generic")
public class LoggingController {

    Logger logger= LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/loggers")
    public String getLevelOfLogging(){
        logger.trace("Trace Logs");
        logger.debug("Debug Logs") ;
        logger.warn("Warn Logs");
        logger.error("Error Logs");
        return "Springboot Logging demo";
    }


}
