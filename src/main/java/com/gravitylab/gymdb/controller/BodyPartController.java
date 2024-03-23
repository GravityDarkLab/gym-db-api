package com.gravitylab.gymdb.controller;

import com.gravitylab.gymdb.model.BodyPart;
import com.gravitylab.gymdb.service.BodyPartService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gym-api/v1/body-parts")
public class BodyPartController {

  @Autowired private BodyPartService bodyPartService;

  @GetMapping
  public ResponseEntity<List<BodyPart>> getAllBodyParts() {
    try {
      return ResponseEntity.ok(bodyPartService.getAllBodyParts());
    } catch (Exception e) {
      return ResponseEntity.noContent().build();
    }
  }

  @GetMapping("/id/{id}")
  public ResponseEntity<Optional<BodyPart>> getBodyPartById(@PathVariable ObjectId id) {
    try {
      return ResponseEntity.ok(bodyPartService.getBodyPartById(id));
    } catch (Exception e) {
      return ResponseEntity.notFound().build();
    }
  }

  @GetMapping("/{name}")
  public ResponseEntity<Optional<BodyPart>> getBodyPartByName(@PathVariable String name) {
    try {
      return ResponseEntity.ok(bodyPartService.getBodyPartByName(name));
    } catch (Exception e) {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<BodyPart> addBodyPart(String bodyPartName) {
    try {
      return ResponseEntity.ok(bodyPartService.addBodyPart(bodyPartName));
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }
}
