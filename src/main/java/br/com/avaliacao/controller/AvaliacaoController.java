package br.com.avaliacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Usuário on 23/12/2016.
 */
@Controller
public class AvaliacaoController {

    @RequestMapping(value = "/avaliacao")
    public String index(){
        return "index";
    }
}
