package edu.school21.cinema.service;

import edu.school21.cinema.model.HallModel;
import edu.school21.cinema.repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallServiceImpl implements HallService{

    private final HallRepository repository;

    @Autowired
    public HallServiceImpl(HallRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<HallModel> getHalls() {
        return repository.findAll();
    }
}
