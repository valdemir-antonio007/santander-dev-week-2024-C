package me.dio.domain.service.impl;

import me.dio.domain.model.Bootcamp;
import me.dio.domain.repository.BootcampRepository;
import me.dio.domain.service.BootcampService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class BootcampServiceImpl implements BootcampService {
    private final BootcampRepository bootcampRepository;

    public BootcampServiceImpl(BootcampRepository bootcampRepository) {
        this.bootcampRepository = bootcampRepository;
    }

    @Override
    public Bootcamp findById(Long id) {
        return bootcampRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Bootcamp create(Bootcamp bootcamp) {
        if(bootcampRepository.existsById(bootcamp.getId())){
            throw new IllegalArgumentException("Bootcamp already exists.");
        }
        return bootcampRepository.save(bootcamp);
    }
}
