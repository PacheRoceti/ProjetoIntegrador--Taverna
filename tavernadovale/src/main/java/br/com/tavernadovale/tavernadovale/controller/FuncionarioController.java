/* 
   Integrantes do Grupo:
Anderson Cleyton Ferreira Junior
Daniel Filho Oliveira Lima
Felipe Claudiano Synthes
Pedro Gustavo De Campos Teixeira Silva
Pedro Roceti Pache
*/


package br.com.tavernadovale.tavernadovale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class FuncionarioController {

    @GetMapping("/funcionario")
    public String texto(){
        return "Hello World";
    }
}
