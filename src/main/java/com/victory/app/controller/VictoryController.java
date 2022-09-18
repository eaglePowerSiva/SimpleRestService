package com.victory.app.controller;

import com.victory.app.entity.ResearcherEntity;
import com.victory.app.model.ResearcherModel;
import com.victory.app.service.ResearcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class VictoryController {

    @Autowired
    private ResearcherService researcherService;

    @GetMapping("/v1/api/victory/{name}")
    public ResponseEntity<List<ResearcherEntity>> getNameWithPathVariable(@PathVariable String name) {
        return getListResponseEntity(name);
    }

    @PostMapping("/v1/api/victory/{name}")
    public ResponseEntity<Object> saveResearch(@PathVariable String name, @RequestBody ResearcherModel researcherModel) {
        researcherService.save(researcherModel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/v2/api/victory/get")
    public ResponseEntity<List<ResearcherEntity>> getNameWithRequestParam(@RequestParam String name) {
        return getListResponseEntity(name);
    }

    @GetMapping("/v3/api/victory")
    public void getNameWithOptionalRequestParam(@RequestParam(required = false) Optional<String> name) {
        System.out.println("name: " + name.orElse("Not available"));
    }

    @GetMapping("/v4/api/victory/default")
    public ResponseEntity<List<ResearcherEntity>> getNameWithDefaultValue(@RequestParam(defaultValue = "test") String name) {
        return getListResponseEntity(name);

    }

    @GetMapping("/v5/api/victories")
    public void getAllNameWithRequestParam(@RequestParam Map<String, String> params) {
        System.out.println("name: " + params.entrySet());
    }

    @GetMapping("/v6/api/lists/victories")
    public void getAllNameWithMultiValueParameters(@RequestParam List<String> values) {
        System.out.println("names: " + values);
    }

    private ResponseEntity<List<ResearcherEntity>> getListResponseEntity(String name) {
        List<ResearcherEntity> res = researcherService.findByName(name);
        if (res.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        System.out.println("name: " + name);
        return ResponseEntity.ok(res);
    }
}
