package com.toi.proto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toi.proto.service.BcBltnBrdDService;
import com.toi.proto.service.BcBltnBrdMService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
@Slf4j
public class BcBltnBrdController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private BcBltnBrdMService bcBltnBrdMService;
	private BcBltnBrdDService bcBltnBrdDService;
	
	@Autowired
    public BcBltnBrdController(BcBltnBrdController bcBltnBrdController) {
        this.bcBltnBrdMService = bcBltnBrdMService;
        this.bcBltnBrdDService = bcBltnBrdDService;
    }
	
}
