package com.kouliet.service.de.livraison.de.colis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
 @GetMapping("/test")
    public String tes(){
        return "test";
    }
}
