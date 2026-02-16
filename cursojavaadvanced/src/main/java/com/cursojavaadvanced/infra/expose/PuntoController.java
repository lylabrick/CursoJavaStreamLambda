package com.cursojavaadvanced.infra.expose;

import com.cursojavaadvanced.app.services.PuntoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PuntoController {

    @GetMapping(path = "/punto")
    public ResponseEntity<?> getPunto(){
        PuntoService puntoService = new PuntoService();
        puntoService.usePunto();
        return ResponseEntity.ok("ok");
    }

}
