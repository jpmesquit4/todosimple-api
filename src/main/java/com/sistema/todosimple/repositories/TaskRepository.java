package com.sistema.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sistema.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


    // Fazendo com o extensao do spring
    List<Task> findByUser_Id(Long id);

    
    // Fazendo no modelo Query com automaçãp
    // @Query(value = "SELECT t FROM Task t WHERE t.user_id = :id")
    // List<Task> findByUser_Id(@Param("id") Long id);
    
    // Fazendo no modelo Query SQL
    // @Query(value = "select * from task t where t.user_id = :id",nativeQuery = true)
    // List<Task> findByUser_Id(@Param("id") Long id);

}
