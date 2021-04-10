package com.toi.proto.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.toi.proto.dvo.BcUsrDVO;

@Mapper
public interface BcUsrMapper {
	// selectList
	public List<BcUsrDVO> selectListBcUsr();
	// selectOne
	public BcUsrDVO selectOneBcUsr(BcUsrDVO bcUsrDVO);
	// insert
	public int insertBcUsr(BcUsrDVO bcUsrDVO);
	// update
	public int updateBcUsr(BcUsrDVO bcUsrDVO);
	// delete
	public int deleteBcUsr(BcUsrDVO bcUsrDVO);
	
	// 로그인 시도
	public int tryLogin(BcUsrDVO bcUsrDVO);
}
