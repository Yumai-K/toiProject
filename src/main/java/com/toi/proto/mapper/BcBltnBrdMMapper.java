package com.toi.proto.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.toi.proto.dvo.BcBltnBrdMDVO;

@Mapper
public interface BcBltnBrdMMapper {

	List<BcBltnBrdMDVO> selectListBcBltnBrdM();

	BcBltnBrdMDVO selectOneBcBltnBrdM(BcBltnBrdMDVO bcBltnBrdMDVO);

	int insertBcBltnBrdM(BcBltnBrdMDVO bcBltnBrdMDVO);

	int updateBcBltnBrdM(BcBltnBrdMDVO bcBltnBrdMDVO);

	int deleteBcBltnBrdM(BcBltnBrdMDVO bcBltnBrdMDVO);

}
