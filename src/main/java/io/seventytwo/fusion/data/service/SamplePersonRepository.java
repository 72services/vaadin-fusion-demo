package io.seventytwo.fusion.data.service;

import io.seventytwo.fusion.data.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}
