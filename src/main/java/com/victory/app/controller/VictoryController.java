package com.victory.app.controller;

import com.victory.app.service.ResearcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public void getNameWithPathVariable(@PathVariable String name) {
        System.out.println("name: " + name);
    }

    @GetMapping("/v2/api/victory/get")
    public void getNameWithRequestParam(@RequestParam String name) {
        System.out.println("name: " + name);
    }

    @GetMapping("/v3/api/victory")
    public void getNameWithOptionalRequestParam(@RequestParam(required = false) Optional<String> name) {
        System.out.println("name: " + name.orElse("Not available"));
    }

    @GetMapping("/v4/api/victory/default")
    public void getNameWithDefaultValue(@RequestParam(defaultValue = "test") String name) {
        System.out.println("name: " + name);
    }

    @GetMapping("/v5/api/victories")
    public void getAllNameWithRequestParam(@RequestParam Map<String, String> params) {
        System.out.println("name: " + params.entrySet());
    }

    @GetMapping("/v6/api/lists/victories")
    public void getAllNameWithMultiValueParameters(@RequestParam List<String> values) {
        System.out.println("names: " + values);
    }
}
