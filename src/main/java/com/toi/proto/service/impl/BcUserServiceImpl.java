package com.toi.proto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toi.proto.dvo.BcUserDVO;
import com.toi.proto.mapper.BcUserMapper;
import com.toi.proto.service.BcUserService;
 
@Service
public class BcUserServiceImpl implements BcUserService {
	// 모든 Autowired Mapper에 대해 mapper라고 선언한다.
	// 
	@Autowired
	private BcUserMapper mapper;
	
	@Override
	public List<BcUserDVO> selectListBcUser(BcUserDVO bcUserDVO) {
		// TODO Auto-generated method stub
		List<BcUserDVO> list = mapper.selectListBcUser(bcUserDVO);
		return list;
	}

	@Override
	public BcUserDVO selectOneBcUser(BcUserDVO bcUserDVO) {
		// TODO Auto-generated method stub
		return mapper.selectOneBcUser(bcUserDVO);
	}

	@Override
	public int insertBcUser(BcUserDVO bcUserDVO) {
		// TODO Auto-generated method stub
		return mapper.insertBcUser(bcUserDVO);
	}

	@Override
	public int updateBcUser(BcUserDVO bcUserDVO) {
		// TODO Auto-generated method stub
		return mapper.updateBcUser(bcUserDVO);
	}

	@Override
	public int deleteBcUser(BcUserDVO bcUserDVO) {
		// TODO Auto-generated method stub
		return mapper.deleteBcUser(bcUserDVO);
	}

}