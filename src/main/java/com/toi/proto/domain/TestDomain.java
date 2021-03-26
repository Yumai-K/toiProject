package com.toi.proto.domain;

public class TestDomain {
	private int id;
	private String platformName;
	public TestDomain(int id, String platformName) {
		super();
		this.id = id;
		this.platformName = platformName;
	}
	public TestDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	@Override
	public String toString() {
		return "TestDomain [id=" + id + ", platformName=" + platformName + "]";
	}

}
