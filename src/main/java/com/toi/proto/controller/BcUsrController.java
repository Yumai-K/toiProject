package com.toi.proto.controller;

import java.util.List;

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

@RestController
@RequestMapping("/users")
public class BcUsrController {
	
	private BcUsrService bcUsrService;
	
    @Autowired
    public BcUsrController(BcUsrService bcUsrService) {
        this.bcUsrService = bcUsrService;
    }
    
	@GetMapping("")
    public List<BcUsrDVO> getAllUsers() {
    	return bcUsrService.selectListBcUsr();
    }
	
    
    @GetMapping("/{usrId}")
    public BcUsrDVO getUserByUsrId(String usrId) {
    	
    	BcUsrDVO bcUsrDVO = new BcUsrDVO();
    	bcUsrDVO.setUsrId(usrId);
        return bcUsrService.selectOneBcUsr(bcUsrDVO);
    }
 
    @PostMapping("")
    public void addUser(@RequestBody BcUsrDVO bcUsrDVO) {
    	
    	bcUsrService.insertBcUsr(bcUsrDVO);
    }
 
    @PutMapping("/{usrId}")
    public int setUser(@PathVariable  String usrid, @RequestBody BcUsrDVO bcUsrDVO) {
    	return bcUsrService.updateBcUsr(bcUsrDVO);
    }
 
    @DeleteMapping("/usrid")
    public int popUser(@PathVariable  String usrId) {
    	BcUsrDVO bcUsrDVO = new BcUsrDVO();
    	bcUsrDVO.setUsrId(usrId);
    	return bcUsrService.deleteBcUsr(bcUsrDVO);
    }
    
    @GetMapping("/login")
    public String tryLogin(@RequestBody BcUsrDVO bcUsrDVO) {
    	return bcUsrService.tryLogin(bcUsrDVO);
    }
}