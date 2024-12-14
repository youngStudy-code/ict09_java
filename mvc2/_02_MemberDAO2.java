package mvc2;

public interface _02_MemberDAO2 {
	
	public int memberLogin(_02_MemberDTO2 dto2); 	// 1. 로그인
	public _02_MemberDTO2 memberSelect(String id); 	// 2. ID로만 조회하기 db에서 값 get해서 출력해주기
	public int memberUpdate(_02_MemberDTO2 dto2); 	// 3. ID, 이메일 외 수정하기
	public int memberInsert(_02_MemberDTO2 dto2);  	// 4. 회원가입 하기
	public int memberDelete (_02_MemberDTO2 dto2); 	// 5. 아이디 회원정보 삭제하기 
	
}
