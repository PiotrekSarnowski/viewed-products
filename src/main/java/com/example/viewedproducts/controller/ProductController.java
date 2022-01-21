package com.example.viewedproducts.controller;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class ProductController {


    private static final Logger LOG = LogManager.getLogger(StockInfoController.class);

    @RequestMapping("/")
    public String index() {
        return "Test!";
    }

    @GetMapping(value = "/{tenantId}", produces = "text/csv")
    public ResponseEntity<FileSystemResource> generateReport(@PathVariable String tenantId) {


    }

    @GetMapping(value = "/{tenantId}/experience/{experienceId}", produces = "text/csv")
    public ResponseEntity<FileSystemResource> generateReportForExperience(@PathVariable String tenantId, @PathVariable String experienceId) {

    }

}
