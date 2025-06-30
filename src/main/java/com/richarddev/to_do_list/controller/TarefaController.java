package com.richarddev.to_do_list.Controller;



import com.richarddev.to_do_list.DTO.DadosTarefaCreate;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @PostMapping
    @Transactional
    public void criar (@RequestBody @Valid DadosTarefaCreate dados){
        System.out.println(dados);
    }

}
