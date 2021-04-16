package com.toi.proto.dvo;

import java.sql.Timestamp;

//공통_게시판_상세 
public class BcBltnBrdDDVO {

	// 게시판_기본_일련번호 
	private Integer bltnBrdMSqn;
	
	// 게시판_상세_일련번호 
	private Integer bltnBrdDSqn;
	
	// 게시판_상세_유형 
	private String bltnBrdDTyp;
	
	// 게시판_상세_명 
	private String bltnBrdDNm;
	
	// 게시판_상세_내용 
	private String bltnBrdDCnt;
	
	// 게시판_상세_상위글번호 
	private Integer bltnBrdDTopSqn;
	
	// 게시글_상세_최상위글번호 
	private Integer bltnBrdDUprSqn;
	
	// 순번 
	private Integer sqn;
	
	// 삭제여부 
	private String delYn;
	
	// 단계 
	private Integer step;
	
	// 첨부파일_일련번호 
	private String atflSqn;
	
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
	
	public Integer getBltnBrdDSqn() {
	    return bltnBrdDSqn;
	}
	
	public void setBltnBrdDSqn(Integer bltnBrdDSqn) {
	    this.bltnBrdDSqn = bltnBrdDSqn;
	}
	
	public String getBltnBrdDTyp() {
	    return bltnBrdDTyp;
	}
	
	public void setBltnBrdDTyp(String bltnBrdDTyp) {
	    this.bltnBrdDTyp = bltnBrdDTyp;
	}
	
	public String getBltnBrdDNm() {
	    return bltnBrdDNm;
	}
	
	public void setBltnBrdDNm(String bltnBrdDNm) {
	    this.bltnBrdDNm = bltnBrdDNm;
	}
	
	public String getBltnBrdDCnt() {
	    return bltnBrdDCnt;
	}
	
	public void setBltnBrdDCnt(String bltnBrdDCnt) {
	    this.bltnBrdDCnt = bltnBrdDCnt;
	}
	
	public Integer getBltnBrdDTopSqn() {
	    return bltnBrdDTopSqn;
	}
	
	public void setBltnBrdDTopSqn(Integer bltnBrdDTopSqn) {
	    this.bltnBrdDTopSqn = bltnBrdDTopSqn;
	}
	
	public Integer getBltnBrdDUprSqn() {
	    return bltnBrdDUprSqn;
	}
	
	public void setBltnBrdDUprSqn(Integer bltnBrdDUprSqn) {
	    this.bltnBrdDUprSqn = bltnBrdDUprSqn;
	}
	
	public Integer getSqn() {
	    return sqn;
	}
	
	public void setSqn(Integer sqn) {
	    this.sqn = sqn;
	}
	
	public String getDelYn() {
	    return delYn;
	}
	
	public void setDelYn(String delYn) {
	    this.delYn = delYn;
	}
	
	public Integer getStep() {
	    return step;
	}
	
	public void setStep(Integer step) {
	    this.step = step;
	}
	
	public String getAtflSqn() {
	    return atflSqn;
	}
	
	public void setAtflSqn(String atflSqn) {
	    this.atflSqn = atflSqn;
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