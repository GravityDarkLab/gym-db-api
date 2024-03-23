package com.gravitylab.gymdb.service;

import com.gravitylab.gymdb.model.EquipmentList;
import com.gravitylab.gymdb.repository.EquipmentListRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EquipmentListService {

  @Autowired private EquipmentListRepository equipmentListRepository;

  public List<EquipmentList> getAllEquipmentList() {
    try {
      return equipmentListRepository.findAll();
    } catch (Exception e) {
      log.error("Error occurred while fetching equipment list", e);
      return new ArrayList<>();
    }
  }

  public Optional<EquipmentList> getEquipmentListByName(String name) {
    try {
      return equipmentListRepository.findByName(name);
    } catch (Exception e) {
      log.error("Error occurred while fetching equipment list by name", e);
      return Optional.empty();
    }
  }

  public Optional<EquipmentList> getEquipmentListById(ObjectId id) {
    try {
      return equipmentListRepository.findById(id);
    } catch (Exception e) {
      log.error("Error occurred while fetching equipment list by id", e);
      return Optional.empty();
    }
  }
}
