package help.baremetal.hello;

import java.util.List;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
class HelloController {
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    List<String> index() {
        return List.of("hello","world");
    }
}
