package com.gravitylab.gymdb.controller;

import com.gravitylab.gymdb.model.EquipmentList;
import com.gravitylab.gymdb.service.EquipmentListService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gym-api/v1/equipment-list")
public class EquipmentListController {

    @Autowired
    private EquipmentListService equipmentListService;

    @GetMapping
    public ResponseEntity<List<EquipmentList>> getAllEquipmentList() {
        return ResponseEntity.ok(equipmentListService.getAllEquipmentList());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Optional<EquipmentList>> getEquipmentListByName(@PathVariable String name) {
        return ResponseEntity.ok(equipmentListService.getEquipmentListByName(name));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<EquipmentList>> getEquipmentListById(@PathVariable ObjectId id) {
        return ResponseEntity.ok(equipmentListService.getEquipmentListById(id));
    }
}
