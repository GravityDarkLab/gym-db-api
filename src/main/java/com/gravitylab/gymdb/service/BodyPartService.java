package com.gravitylab.gymdb.service;

import com.gravitylab.gymdb.model.BodyPart;
import com.gravitylab.gymdb.repository.BodyPartRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BodyPartService {

    @Autowired
    private BodyPartRepository bodyPartRepository;

        public List<BodyPart> getAllBodyParts() {
            try {
                return bodyPartRepository.findAll();
            } catch (Exception e) {
                log.error("Error occurred while fetching body parts", e);
                throw e;
            }
        }

        public Optional<BodyPart> getBodyPartById(ObjectId id) {
            try {
                return bodyPartRepository.findById(id);
            } catch (Exception e) {
                log.error("Error occurred while fetching body part by id", e);
                throw e;
            }
        }

        public Optional<BodyPart> getBodyPartByName(String name) {
            try {
                return bodyPartRepository.findByName(name);
            } catch (Exception e) {
                log.error("Error occurred while fetching body part by name", e);
                throw e;
            }
        }

        public BodyPart addBodyPart(String bodyPartName) {
            try {
                BodyPart bodyPart = new BodyPart();
                bodyPart.setName(bodyPartName);
                return bodyPartRepository.save(bodyPart);
            } catch (Exception e) {
                log.error("Error occurred while adding body part", e);
                throw e;
            }
        }
}
