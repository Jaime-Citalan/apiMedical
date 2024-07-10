package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DTODatosRegistroMedico;
import med.voll.api.medico.IMedicoRepository;
import med.voll.api.medico.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/medicos")
    public class MedicoController {

       @Autowired //ANOTACIÓN PARA QUE SPRING HAGA LA ANOTACIÓN LA CUÁL NO ES MUY RECOMENDABLE
        private IMedicoRepository iMedicoRepository; //LLAMAR LA INTERFACE

        @PostMapping
        public void registrarMedico(@RequestBody @Valid DTODatosRegistroMedico datosRegistroMedico){
            iMedicoRepository.save(new Medico(datosRegistroMedico));


        }

}
