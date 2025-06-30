package com.richarddev.to_do_list.Repository;

import com.richarddev.to_do_list.Model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTarefa extends JpaRepository<Tarefa, Long> {
}
