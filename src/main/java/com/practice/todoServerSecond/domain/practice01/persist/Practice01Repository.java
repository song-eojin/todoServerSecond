package com.practice.todoServerSecond.domain.practice01.persist;

import com.practice.todoServerSecond.domain.practice01.entity.Practice01Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Practice01Repository extends JpaRepository<Practice01Entity, Long> {
}
