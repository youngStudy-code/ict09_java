package jdbc;

import java.util.List;

public interface _02_MemberDAO {
	public int login (_02_MemberDTO dto); // 로그인 성공
	public int memberInsert(_02_MemberDTO dto); //회원가입 성공
	public int memberUpdate(_02_MemberDTO dto); // 회원수정 성공
	public int memberDelete(_02_MemberDTO dto); // 회원삭제 성공
	public _02_MemberDTO memberSelect(String id); // 회원 조회, String id로 값 받아와서 조회하기, _02_MemberDTO에서 바구니에 담은 전체 값 출력하기
	public List <_02_MemberDTO> memberList(); //회원목록

}