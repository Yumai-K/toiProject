package com.toi.proto.dvo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 기본_사용자
@AllArgsConstructor // 자동으로 모든 매개변수를 받는 생성자를 생성
@Getter // Getter 생성
@Setter // Setter 생성
public class BcUserDVO {

    // 사용자_ID 
    private String userId;

    // 사용자_이메일 
    private String userEml;

    // 사용자_명 
    private String userNm;

    // 사용자_전화번호 
    private String userTel;

    // 사용자_생년월일 
    private String userBrtDt;

    // 사용자_비밀번호 
    private String userPwd;

}