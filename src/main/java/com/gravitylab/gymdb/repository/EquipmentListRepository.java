package com.gravitylab.gymdb.repository;

import com.gravitylab.gymdb.model.EquipmentList;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EquipmentListRepository extends MongoRepository<EquipmentList, ObjectId> {
    Optional<EquipmentList> findByName(String name);
}
