package com.work.model.dto;

/**
 * <pre>
 * 회원 도메인 클래스
 * -- Encapsulation 설계 반영 변경
 * ##회원 검증조건
 * 1. 아이디 : 6자리 ~ 30자리 이내
 * 2. 비밀번호 : 6자리 ~ 20자리 이내
 * 3. 마일리지 : 0 ~ 100,000
 * 4. 등급 : G, S, A
 * 
 * </pre>
 * @author 한나
 * @version ver.1.0
 * @since jdk1.8
 */
public class Member {
	
	/** 아이디 : 식별기 */
	private String memberId;
	/** 비밀번호 : 필수*/
	private String memberPw;
	/** 이름 : 필수*/
	private String name;
	/** 휴대폰 : 필수*/
	private String mobile;
	/** 이메일 : 필수*/
	private String email;
	/** 가입일 : 필수*/
	private String entryDate;
	/** 등급 : 필수*/
	private String grade;
	/** 마일리지 : 선택 */
	private int mileage;
	/** 담당자 : 선택 */
	private String manager;
	
	/**
	 * 기본 생성자
	 */
	public Member() {
	}

	/**
	 * 사용자입력 데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email) {
		//this(); 안해도됨 여기서 아무것도안하니까 밑은 중복된거 호출하려고
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	/**
	 * 필수데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade 등급
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade) {
		this(memberId, memberPw, name, mobile, email);
		this.entryDate = entryDate;
		this.grade = grade;
	}

	/**
	 * 전체데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade 등급
	 * @param mileage 마일리지
	 * @param manager 담당자
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, int mileage, String manager) {
		this(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.mileage = mileage;
		this.manager = manager;
		
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * 아이디 검증규칙 :
	 * -- 최소 6자리, 최대 30자리
	 * -- 문자열길이 메서드 : {@link String#length()}
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		// 길이검증 메서드 호출문
		boolean result = isMemberId(memberId);
		
		if(result) {
			this.memberId = memberId;
		} else {
			System.out.println("[오류] 아이디는 6~30자리 이내로 입력하세요.");
		}
		
	}


	/**
	 * 아이디검증 메서드
	 * @param memberId 아이디
	 * @return 아이디길이가 6~30자리 이내면 true, 그렇지 않으면 false
	 */
		private boolean isMemberId(String memberId) {
			if(memberId.length() >= 6 && memberId.length() <= 30) {
			return true;	
			} else {
				return false;
			}
		}
	
	/**
	 * @return the memberPw
	 */
	public String getMemberPw() {
		return memberPw;
	}

	/**
	 * 비밀번호 검증규칙 :
	 * 검증규칙 : 길이 6자리 ~ 20자리
	 * -- 문자열길이 메서드 : {@link String#length()}
	 * @param memberPw the memberPw to set
	 */
	public void setMemberPw(String memberPw) {
		
		if(isMemberPw(memberPw)) {
			this.memberPw = memberPw;
			return;
		} 
			System.out.println("[오류] 비밀번호는 6~20자리 이내로 입력하세요.");
	}
		
	/**
	 * 비밀번호 검증 메서드
	 * @param memberPw 변경 비밀번호
	 * @return 검증규칙 올바르면 true, 그렇지 않으면 false
	 */
	private boolean isMemberPw(String memberPw) {
		int length = memberPw.length();
		
		if(length >= 6 && length <= 20) {
			return true;	
		} 
		return false;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the entryDate
	 */
	public String getEntryDate() {
		return entryDate;
	}

	/**
	 * @param entryDate the entryDate to set
	 */
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * 등급 검증 규칙
	 * -- G, S, A
	 * -- 문자열 비교 메서드 : {@link String#equals()}
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		if(isGrade(grade)) {
			this.grade = grade;
		} else {
			System.out.println("[오류] 등급은 G, S, A만 입력 가능");
		}
	}
	/**
	 * 등급 검정 메서드
	 * 검증 규칙 : G, S, A
	 * @param grade 변경 등급
	 * @return 
	 */
	private boolean isGrade(String grade) {
		
		//return grade.equals("G") || grade.equals("S") || grade.equals("A"); 
		//이것도 가능하나 this.grade 적용하면 오류남
		
		switch(grade) {
		case "G":
		case "S":
		case "C":
			return true;
		default : 
			return false;
		}
	
	}
	
	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/** 마일리지 검증규칙 :
	 * -- 0 ~ 100,000
	 * 
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
			if(isMileage(mileage)) {
				this.mileage = mileage;
		} else {
			System.out.println("[오류] 마일리지는 0 ~ 100,000 이내로 입력하세요.");
		}
		
	}

	/**
	 * 마일리지 검증 메서드
	 * @param mileage 변경 마일리지
	 * @return 마일리지가 0~100,000 이내면 true, 그렇지 않으면 false
	 */
		private boolean isMileage(int mileage) {
			if(mileage >= 0 && mileage <= 100000) {
				return true;	
			} 
				return false;
		}
	
	
	/**
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return memberId + ", " + memberPw + ", " + name + ", " + mobile + ", " + email + ", " + entryDate + ", " + grade
				+ ", " + mileage + ", " + manager;
	}

//	@Override
//	public String toString() {
//		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", name=" + name + ", mobile=" + mobile
//				+ ", email=" + email + ", entryDate=" + entryDate + ", grade=" + grade + ", mileage=" + mileage
//				+ ", manager=" + manager + "]";
//	}
	
	
	
	
}
	
