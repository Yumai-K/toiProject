package com.toi.proto.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toi.proto.dvo.BcUsrDVO;
import com.toi.proto.mapper.BcUsrMapper;

@Service
public class BcUsrService {
	@Resource
	BcUsrMapper mapper;
	
	@Autowired
	BcUsrService(){
		
	}
	
	public List<BcUsrDVO> selectListBcUsr() {
		return mapper.selectListBcUsr();
	}

	public BcUsrDVO selectOneBcUsr(BcUsrDVO bcUsrDVO) {
		return mapper.selectOneBcUsr(bcUsrDVO);
	}

	public int insertBcUsr(BcUsrDVO bcUsrDVO) {
		return mapper.insertBcUsr(bcUsrDVO);
	}

	public int updateBcUsr(BcUsrDVO bcUsrDVO) {
		return mapper.updateBcUsr(bcUsrDVO);
	}
	public int deleteBcUsr(BcUsrDVO bcUsrDVO) {
		return mapper.deleteBcUsr(bcUsrDVO);
	}
	
	public String tryLogin(BcUsrDVO bcUsrDVO) {
		String rtn = "fail";
		int result = 0;
		result = mapper.tryLogin(bcUsrDVO);
		if ( result == 1) {
			rtn = "mindal";
		}
		return rtn;
	}

}
