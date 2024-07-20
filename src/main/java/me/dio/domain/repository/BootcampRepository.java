package me.dio.domain.repository;

import me.dio.domain.model.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BootcampRepository extends JpaRepository<Bootcamp, Long> {
}
