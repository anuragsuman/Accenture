package com.mgl.digital.sds.scrapper.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgl.digital.sds.scrapper.app.service.NumberService;
import com.mgl.digital.sds.scrapper.app.service.TargetNumberService;

@RestController
public class NumberController {
	
	@Autowired
	private NumberService numberService;
	
	@Autowired 
	private TargetNumberService targetNumberService;
	
    @GetMapping("/numbers")
    public ResponseEntity<Map<String, Object>> numbers() {
        return ResponseEntity.ok().body(numberService.getNumbers());
    }
    
    @GetMapping("/targetNumbers")
    public ResponseEntity<int[]> targetNumbers(){
        int arr[] = {0, 29, 10, 8, 19, 2};
        return ResponseEntity.ok().body(targetNumberService.indices(arr, 37));
    }
}