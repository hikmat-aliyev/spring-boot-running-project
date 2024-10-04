package dev.hikmat.runnerz.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {
  private List<Run> runs = new ArrayList<>();

  List<Run> findAll() {
    return runs;
  }

  @PostConstruct
  private void init() {
    runs.add(new Run(1, "hello1", LocalDateTime.now(), LocalDateTime.now(), 20, Location.OUTDOOR));
    runs.add(new Run(2, "hello2", LocalDateTime.now(), LocalDateTime.now(), 20, Location.OUTDOOR));
  }

  Run findById(Integer id) {
    return runs.stream()
        .filter(run -> run.id() == id)
        .findFirst()
        .get();
  }
}
