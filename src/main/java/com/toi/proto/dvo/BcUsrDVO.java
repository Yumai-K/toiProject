package com.toi.proto.dvo;

public class BcUsrDVO {

	public BcUsrDVO() {
		super();
	}

	public BcUsrDVO(String usrId, String usrEml, String usrNm, String usrTel, String usrBrtDt, String usrPwd) {
		super();
		this.usrId = usrId;
		this.usrEml = usrEml;
		this.usrNm = usrNm;
		this.usrTel = usrTel;
		this.usrBrtDt = usrBrtDt;
		this.usrPwd = usrPwd;
	}

	// 사용자_ID 
    private String usrId;

    // 사용자_이메일 
    private String usrEml;

    // 사용자_명 
    private String usrNm;

    // 사용자_전화번호 
    private String usrTel;

    // 사용자_생년월일 
    private String usrBrtDt;

    // 사용자_비밀번호 
    private String usrPwd;

    @Override
    public String toString() {
    	return "BcUsrDVO [usrId=" + usrId + ", usrEml=" + usrEml + ", usrNm=" + usrNm + ", usrTel=" + usrTel
    			+ ", usrBrtDt=" + usrBrtDt + ", usrPwd=" + usrPwd + "]";
    }

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getUsrEml() {
		return usrEml;
	}

	public void setUsrEml(String usrEml) {
		this.usrEml = usrEml;
	}

	public String getUsrNm() {
		return usrNm;
	}

	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

	public String getUsrTel() {
		return usrTel;
	}

	public void setUsrTel(String usrTel) {
		this.usrTel = usrTel;
	}

	public String getUsrBrtDt() {
		return usrBrtDt;
	}

	public void setUsrBrtDt(String usrBrtDt) {
		this.usrBrtDt = usrBrtDt;
	}

	public String getUsrPwd() {
		return usrPwd;
	}

	public void setUsrPwd(String usrPwd) {
		this.usrPwd = usrPwd;
	}

}
