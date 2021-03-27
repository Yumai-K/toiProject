package com.toi.proto.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.toi.proto.dvo.BcUserDVO;
 
@Service
public interface BcUserService {
	
    public List<BcUserDVO> selectListBcUser(BcUserDVO bcUserDVO);
    public BcUserDVO selectOneBcUser(BcUserDVO usbcUserDVOerDVO);
    public int insertBcUser(BcUserDVO bcUserDVO);
    public int updateBcUser(BcUserDVO bcUserDVO);
    public int deleteBcUser(BcUserDVO bcUserDVO);
 
}