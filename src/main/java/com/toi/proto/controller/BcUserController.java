package com.toi.proto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toi.proto.dvo.BcUserDVO;
import com.toi.proto.service.BcUserService;

@RestController
@RequestMapping("/users")
public class BcUserController {
	
	private BcUserService bcUserService;
	
    @Autowired
    public BcUserController(BcUserService bcUserService) {
        this.bcUserService = bcUserService;
    }
	@GetMapping("")
    public List<BcUserDVO> getAllUsers(@RequestBody BcUserDVO bcUserDVO) {
    	System.out.println("A");
        return bcUserService.selectListBcUser(bcUserDVO);
    }
    
    @GetMapping("/{userid}")
    public BcUserDVO getUserByUserId(@RequestBody BcUserDVO bcUserDVO) {
    	System.out.println("B");
        return bcUserService.selectOneBcUser(bcUserDVO);
    }
 
    @PostMapping("")
    public void addUser(@RequestBody BcUserDVO bcUserDVO) {
    	System.out.println("C");
    	bcUserService.insertBcUser(bcUserDVO);
    }
 
    @PutMapping("/{userid}")
    public int setUser(@RequestBody BcUserDVO bcUserDVO) {
    	System.out.println("D");
    	return bcUserService.updateBcUser(bcUserDVO);
    }
 
    @DeleteMapping("/userid")
    public int popUser(@RequestBody BcUserDVO bcUserDVO) {
    	System.out.println("E");
       return bcUserService.deleteBcUser(bcUserDVO);
    }
}
