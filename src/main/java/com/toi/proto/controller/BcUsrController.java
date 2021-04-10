package com.toi.proto.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toi.proto.dvo.BcUsrDVO;
import com.toi.proto.service.BcUsrService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class BcUsrController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private BcUsrService bcUsrService;
	
    @Autowired
    public BcUsrController(BcUsrService bcUsrService) {
        this.bcUsrService = bcUsrService;
    }
    
	@GetMapping("")
    public List<BcUsrDVO> getAllUsers() {
		logger.info("getAllUsers");
    	return bcUsrService.selectListBcUsr();
    }
	
    
    @GetMapping("/{usrId}")
    public BcUsrDVO getUserByUsrId(String usrId) {
    	logger.info("getUserByUsrId");
    	BcUsrDVO bcUsrDVO = new BcUsrDVO();
    	bcUsrDVO.setUsrId(usrId);
        return bcUsrService.selectOneBcUsr(bcUsrDVO);
    }
 
    @PostMapping("")
    public void addUser(@RequestBody BcUsrDVO bcUsrDVO) {
    	logger.info("addUser");
    	bcUsrService.insertBcUsr(bcUsrDVO);
    }
 
    @PutMapping("/{usrId}")
    public int setUser(@PathVariable  String usrid, @RequestBody BcUsrDVO bcUsrDVO) {
      	logger.info("setUser");
    	return bcUsrService.updateBcUsr(bcUsrDVO);
    }
 
    @DeleteMapping("/usrid")
    public int popUser(@PathVariable  String usrId) {
    	logger.info("popUser");
    	BcUsrDVO bcUsrDVO = new BcUsrDVO();
    	bcUsrDVO.setUsrId(usrId);
    	return bcUsrService.deleteBcUsr(bcUsrDVO);
    }
    
    @GetMapping("/login")
    public String tryLogin(@RequestBody BcUsrDVO bcUsrDVO) {
    	logger.info("login");
    	return bcUsrService.tryLogin(bcUsrDVO);
    }
}