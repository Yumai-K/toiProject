package com.toi.proto.dvo;

import java.sql.Timestamp;

// 공통_게시판_기본 
public class BcBltnBrdMDVO {

    // 게시판_기본_일련번호 
    private Integer bltnBrdMSqn;

    // 게시판_기본_유형 
    private String bltnBrdMTyp;

    // 게시판_기본_명 
    private String bltnBrdMNm;

    // 삭제여부 
    private String delYn;

    // 최초등록일시 
    private Timestamp fsrRegDtm;

    // 최초등록자ID 
    private String fsrRegUsrId;

    // 최종수정일시 
    private Timestamp lstMdfDtm;

    // 최종등록자ID 
    private String lstMdfUsrId;

    public Integer getBltnBrdMSqn() {
        return bltnBrdMSqn;
    }

    public void setBltnBrdMSqn(Integer bltnBrdMSqn) {
        this.bltnBrdMSqn = bltnBrdMSqn;
    }

    public String getBltnBrdMTyp() {
        return bltnBrdMTyp;
    }

    public void setBltnBrdMTyp(String bltnBrdMTyp) {
        this.bltnBrdMTyp = bltnBrdMTyp;
    }

    public String getBltnBrdMNm() {
        return bltnBrdMNm;
    }

    public void setBltnBrdMNm(String bltnBrdMNm) {
        this.bltnBrdMNm = bltnBrdMNm;
    }

    public String getDelYn() {
        return delYn;
    }

    public void setDelYn(String delYn) {
        this.delYn = delYn;
    }

    public Timestamp getFsrRegDtm() {
        return fsrRegDtm;
    }

    public void setFsrRegDtm(Timestamp fsrRegDtm) {
        this.fsrRegDtm = fsrRegDtm;
    }

    public String getFsrRegUsrId() {
        return fsrRegUsrId;
    }

    public void setFsrRegUsrId(String fsrRegUsrId) {
        this.fsrRegUsrId = fsrRegUsrId;
    }

    public Timestamp getLstMdfDtm() {
        return lstMdfDtm;
    }

    public void setLstMdfDtm(Timestamp lstMdfDtm) {
        this.lstMdfDtm = lstMdfDtm;
    }

    public String getLstMdfUsrId() {
        return lstMdfUsrId;
    }

    public void setLstMdfUsrId(String lstMdfUsrId) {
        this.lstMdfUsrId = lstMdfUsrId;
    }
}