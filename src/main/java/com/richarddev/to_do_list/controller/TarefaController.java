package com.richarddev.to_do_list.Controller;



import com.richarddev.to_do_list.DTO.DadosTarefaCreate;
import com.richarddev.to_do_list.DTO.DadosTarefaRead;
import com.richarddev.to_do_list.Enums.PrioridadeTarefa;
import com.richarddev.to_do_list.Model.Tarefa;
import com.richarddev.to_do_list.Repository.TarefaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @PostMapping
    @Transactional
    public void criar (@RequestBody @Valid DadosTarefaCreate dados){
        tarefaRepository.save(new Tarefa(dados));
    }

    @GetMapping
    public Page<DadosTarefaRead> listar(
            @PageableDefault(size = 10, sort = "prioridade", direction = Sort.Direction.DESC) Pageable paginacao) {
        return tarefaRepository.findAll(paginacao).map(DadosTarefaRead::new);
    }

}
