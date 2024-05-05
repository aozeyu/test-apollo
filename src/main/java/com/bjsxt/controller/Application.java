import com.ctrip.framework.apollo.spring.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
@EnableApolloConfig
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class,args);

  }
}