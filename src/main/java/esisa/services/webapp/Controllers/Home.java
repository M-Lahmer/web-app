package esisa.services.webapp.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  Home {
    
    @GetMapping("/")
    public ResponseEntity<String> index(){

        return new ResponseEntity<String>("Heroku", HttpStatus.OK);
    }
}
