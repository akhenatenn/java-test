import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AminApplication.class, args);
    }
}

@RestController
class AminController {
    @GetMapping("/api")
    public String runCode() {
        // Add your Java code logic here
        return "Hello from Java API";
    }
}

