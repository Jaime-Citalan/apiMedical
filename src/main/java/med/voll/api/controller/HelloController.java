package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ANOTACIONES PARA MAPEAR LA CLASE CONTROLLER LINEA 8 Y 9
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String helloWorld(){
        return "Hello world yei";
    }
}

