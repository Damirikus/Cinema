package ru.damirikus.cinema.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.damirikus.cinema.model.Hall;
import ru.damirikus.cinema.repository.HallRepository;

import java.util.List;

@Slf4j
@Service
public class HallServiceImpl implements HallService{

    public static final String errorUserExists = "Hall with name = %s already exists!";

    private final HallRepository repository;

    public HallServiceImpl(HallRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Hall> getHalls() {
        return repository.findAll();
    }

    @Override
    public boolean createHall(Hall hall) {
        if (repository.findByName(hall.getName()) != null){
            log.info(String.format(errorUserExists, hall.getName()));
            return false;
        }
        repository.save(hall);
        log.info("Added new hall: " + hall);
        return true;
    }

    @Override
    public void deleteHall(Long id) {
        repository.deleteById(id);
    }
}
