package com.kh.home.entity;

import java.sql.Date;

public class MemberDto {
	private String memberId; 
	private String memberPw;
	private String memberNick;
	private String memberPhone;
	private String memberEmail;
	private String memberBirth;
	private String memberPost;
	private String memberBasicAddress;
	private String memberDetailAddress;
	private int memberPoint;
	private String memberGrade;
	private Date memberJoindate;
	private Date memberLogindate;
	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberPw=" + memberPw + ", memberNick=" + memberNick
				+ ", memberPhone=" + memberPhone + ", memberEmail=" + memberEmail + ", memberBirth=" + memberBirth
				+ ", memberPost=" + memberPost + ", memberBasicAddress=" + memberBasicAddress + ", memberDetailAddress="
				+ memberDetailAddress + ", memberPoint=" + memberPoint + ", memberGrade=" + memberGrade
				+ ", memberJoindate=" + memberJoindate + ", memberLogindate=" + memberLogindate + "]";
	}
	public MemberDto() {
		super();
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberNick() {
		return memberNick;
	}
	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberPost() {
		return memberPost;
	}
	public void setMemberPost(String memberPost) {
		this.memberPost = memberPost;
	}
	public String getMemberBasicAddress() {
		return memberBasicAddress;
	}
	public void setMemberBasicAddress(String memberBasicAddress) {
		this.memberBasicAddress = memberBasicAddress;
	}
	public String getMemberDetailAddress() {
		return memberDetailAddress;
	}
	public void setMemberDetailAddress(String memberDetailAddress) {
		this.memberDetailAddress = memberDetailAddress;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	public String getMemberGrade() {
		return memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	public Date getMemberJoindate() {
		return memberJoindate;
	}
	public void setMemberJoindate(Date memberJoindate) {
		this.memberJoindate = memberJoindate;
	}
	public Date getMemberLogindate() {
		return memberLogindate;
	}
	public void setMemberLogindate(Date memberLogindate) {
		this.memberLogindate = memberLogindate;
	}
	
	public String getMemberEmailString() {
		if(this.memberEmail == null) return "";
		else return this.memberEmail;
	}
	
	public String getMemberPostString() {
		if(this.memberPost == null) return "";
		else return this.memberPost;
	}
	public String getMemberBasicAddressString() {
		if(this.memberBasicAddress == null) return "";
		else return this.memberBasicAddress;
	}
	public String getMemberDetailAddressString() {
		if(this.memberDetailAddress == null) return "";
		else return this.memberDetailAddress;
	}
}
