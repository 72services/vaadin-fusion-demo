package io.seventytwo.fusion.data.service;

import io.seventytwo.fusion.data.entity.SamplePerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import javax.annotation.Nullable;

@Service
public class SamplePersonService extends CrudService<SamplePerson, Integer> {

    private SamplePersonRepository repository;

    public SamplePersonService(@Autowired SamplePersonRepository repository) {
        this.repository = repository;
    }

    @Override
    protected SamplePersonRepository getRepository() {
        return repository;
    }

}
