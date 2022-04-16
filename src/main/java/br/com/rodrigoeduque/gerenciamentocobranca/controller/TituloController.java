package br.com.rodrigoeduque.gerenciamentocobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TituloController {

    @RequestMapping("/titulos/novo")
    public String novo(){
        return "CadastroTitulos";
    }

}
