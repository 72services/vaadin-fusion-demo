package io.seventytwo.vaadin.fusion.data.service;

import io.seventytwo.vaadin.fusion.data.entity.SampleAddress;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vaadin.fusion.Nonnull;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, Integer> {

}