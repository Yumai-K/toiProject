package com.toi.proto.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.toi.proto.domain.TestDomain;

@Mapper
public interface TestMapper {
	public List<TestDomain> getTest();

}
