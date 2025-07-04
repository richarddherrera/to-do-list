package com.richarddev.to_do_list.Repository;

import com.richarddev.to_do_list.Model.Tarefa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    Page<Tarefa> findAllByOrderByPrioridadeAsc(Pageable paginacao);

}
