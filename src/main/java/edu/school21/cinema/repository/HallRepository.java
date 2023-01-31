package edu.school21.cinema.repository;

import edu.school21.cinema.model.HallModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends JpaRepository<HallModel, Long> {
}
