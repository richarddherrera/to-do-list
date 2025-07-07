package com.richarddev.to_do_list.Controller;



import com.richarddev.to_do_list.DTO.DadosTarefaCreate;
import com.richarddev.to_do_list.DTO.DadosTarefaRead;
import com.richarddev.to_do_list.DTO.DadosTarefaUpdate;
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

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<DadosTarefaRead> listar() {
        return tarefaRepository.findAll().stream()
                .sorted(Comparator.comparingInt(t -> ((Tarefa) t).getPrioridade().getOrder()).reversed())
                .map(DadosTarefaRead::new)
                .collect(Collectors.toList());
    }

    @PutMapping
    @Transactional
    public void atualizarTarefa (@RequestBody @Valid DadosTarefaUpdate dados){
        var tarefa = tarefaRepository.getReferenceById(dados.id());
        tarefa.atualizarDadosTarefa(dados);
    }

    @DeleteMapping("/{id}") // Parâmetro dinâmicp
    @Transactional
    public void excluir(@PathVariable Long id){ // Pega o numero da url na requisiçao e coloque ele como parâmetro
        tarefaRepository.deleteById(id);
    }

}
