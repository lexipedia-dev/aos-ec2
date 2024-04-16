package io.lexipedia.awsec2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class Controller {

    @GetMapping
    public ResponseEntity<String>ping(){
        return ResponseEntity.ok("PINGING");
    }
}
