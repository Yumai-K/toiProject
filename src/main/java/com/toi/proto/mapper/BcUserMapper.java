package com.toi.proto.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.toi.proto.dvo.BcUserDVO;

@Mapper
public interface BcUserMapper {
	// selectList
	public List<BcUserDVO> selectListBcUser(BcUserDVO bcUserDVO);
	// selectOne
	public BcUserDVO selectOneBcUser(BcUserDVO bcUserDVO);
	// insert
	public int insertBcUser(BcUserDVO bcUserDVO);
	// update
	public int updateBcUser(BcUserDVO bcUserDVO);
	// delete
	public int deleteBcUser(BcUserDVO bcUserDVO);
}
