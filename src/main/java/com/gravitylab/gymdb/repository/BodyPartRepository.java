package com.gravitylab.gymdb.repository;

import com.gravitylab.gymdb.model.BodyPart;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BodyPartRepository extends MongoRepository<BodyPart, ObjectId> {
    Optional<BodyPart> findByName(String name);
}
