package com.ias.omega.BackHandyman.infrastructure.controllers;

import com.ias.omega.BackHandyman.infrastructure.models.servicesDetail.ServiceDetailDTO;
import com.ias.omega.BackHandyman.infrastructure.models.servicesDetail.ServiceNumWeek;
import com.ias.omega.BackHandyman.servicesdetail.aplication.services.CreatedServiceDetail;
import com.ias.omega.BackHandyman.servicesdetail.aplication.services.ServicesTechnicalAndNumWeek;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/servicesdetail")
@CrossOrigin(origins = { "http://localhost:4200" })
public class ServiceDetailController {
    @Autowired
    private CreatedServiceDetail createdServiceDetail;
    @Autowired
    private ServicesTechnicalAndNumWeek servicesTechnicalAndNumWeek;

    @PostMapping
    public ResponseEntity<?> createdServiceDetail(@RequestBody ServiceDetailDTO serviceDetailDTO){
        return new ResponseEntity<>(createdServiceDetail.execute(serviceDetailDTO), HttpStatus.OK);
    }
    @PostMapping(value = "/searchnumweek")
    public ResponseEntity<?> getServicesIdTechnicalAndNumWeek(@RequestBody ServiceNumWeek serviceNumWeek){
        List<ServiceDetailDTO> response = servicesTechnicalAndNumWeek.execute(serviceNumWeek.getIdTechnical(),serviceNumWeek.getNumWeek());
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
