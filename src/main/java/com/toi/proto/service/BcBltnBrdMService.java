package com.toi.proto.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toi.proto.dvo.BcBltnBrdMDVO;
import com.toi.proto.mapper.BcBltnBrdMMapper;

@Service
public class BcBltnBrdMService {
	@Resource
	BcBltnBrdMMapper mapper;
	
	@Autowired
	BcBltnBrdMService(){
		
	}
	
	public List<BcBltnBrdMDVO> selectListBcBltnBrdM() {
		return mapper.selectListBcBltnBrdM();
	}

	public BcBltnBrdMDVO selectOneBcBltnBrdM(BcBltnBrdMDVO bcBltnBrdMDVO) {
		return mapper.selectOneBcBltnBrdM(bcBltnBrdMDVO);
	}

	public int insertBcBltnBrdM(BcBltnBrdMDVO bcBltnBrdMDVO) {
		return mapper.insertBcBltnBrdM(bcBltnBrdMDVO);
	}

	public int updateBcBltnBrdM(BcBltnBrdMDVO bcBltnBrdMDVO) {
		return mapper.updateBcBltnBrdM(bcBltnBrdMDVO);
	}
	public int deleteBcBltnBrdM(BcBltnBrdMDVO bcBltnBrdMDVO) {
		return mapper.deleteBcBltnBrdM(bcBltnBrdMDVO);
	}

}
