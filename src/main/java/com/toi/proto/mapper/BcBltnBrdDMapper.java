package com.toi.proto.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.toi.proto.dvo.BcBltnBrdDDVO;

@Mapper
public interface BcBltnBrdDMapper {

	List<BcBltnBrdDDVO> selectListBcBltnBrdD();

	BcBltnBrdDDVO selectOneBcBltnBrdD(BcBltnBrdDDVO bcBltnBrdDDVO);

	int insertBcBltnBrdD(BcBltnBrdDDVO bcBltnBrdDDVO);

	int updateBcBltnBrdD(BcBltnBrdDDVO bcBltnBrdDDVO);

	int deleteBcBltnBrdD(BcBltnBrdDDVO bcBltnBrdDDVO);


}
