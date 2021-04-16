package com.toi.proto.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toi.proto.dvo.BcBltnBrdDDVO;
import com.toi.proto.mapper.BcBltnBrdDMapper;

@Service
public class BcBltnBrdDService {
	@Resource
	BcBltnBrdDMapper mapper;
	
	@Autowired
	BcBltnBrdDService(){
		
	}
	
	public List<BcBltnBrdDDVO> selectListBcBltnBrdD() {
		return mapper.selectListBcBltnBrdD();
	}

	public BcBltnBrdDDVO selectOneBcBltnBrdD(BcBltnBrdDDVO bcBltnBrdDDVO) {
		return mapper.selectOneBcBltnBrdD(bcBltnBrdDDVO);
	}

	public int insertBcBltnBrdD(BcBltnBrdDDVO bcBltnBrdDDVO) {
		return mapper.insertBcBltnBrdD(bcBltnBrdDDVO);
	}

	public int updateBcBltnBrdD(BcBltnBrdDDVO bcBltnBrdDDVO) {
		return mapper.updateBcBltnBrdD(bcBltnBrdDDVO);
	}
	public int deleteBcBltnBrdD(BcBltnBrdDDVO bcBltnBrdDDVO) {
		return mapper.deleteBcBltnBrdD(bcBltnBrdDDVO);
	}

}
