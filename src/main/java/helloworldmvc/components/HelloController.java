package helloworldmvc.components;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // = @Controller + @ResponseBody
public class HelloController
{
  @RequestMapping("/")
  public String index()
  {
    return "Greetings from Spring Boot!";
  }
}