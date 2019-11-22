package devops.factorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Factorial {
    @GetMapping("/factorial/{n}")
    public int factorial(@PathVariable int n) {
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        return (fact);
    }

}
