package jdbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// DTO (Data Transfer Object : 데이터 전송 객체) 생성
// 메인 함수
public abstract class _02_MemberService {
   
   // 싱글톤을 적용
   static _02_MemberDAOImpl dao = _02_MemberDAOImpl.getInstance();
   static _02_MemberDTO dto = new _02_MemberDTO();
   
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
   
   while(true) {
      
      System.out.println("*------------------------------------------*");
      System.out.println("* 1.회원가입  2.수정  3.삭제  4.조회  5.로그인  6.회원목록  7.종료*");
      System.out.println("*------------------------------------------*");
      System.out.println("♠ 메뉴선택 : ");
      
      int menuNo = scan.nextInt();
      
      switch(menuNo) {
         case 1 : 
            memberInsert(); 
            break;
         
         case 2 :
            memberUpdate();
            break;
            
         case 3 : 
            memberDelete();
            break;
            
         case 4 : 
            memberSelect();
            break;
            
         case 5 : 
            login(); 
            break;
            
         case 6 : 
             memberList(); 
             break;   
      
         case 7 : 
            System.out.println("프로그램을 종료합니다.");
            System.out.println();
            return;
            
         default :
            System.out.println("메뉴를 다시 선택해주세요.");
         }
       }
   }   

   
   // -------------  [1. 회원가입]  -------------
   static void memberInsert() {
      
      _02_MemberDTO dto = new _02_MemberDTO();
      
      System.out.println("아이디를 입력해주세요.");
      dto.setId(scan.next());
      
      System.out.println("비밀번호를 입력해주세요.");
      dto.setPassword(scan.next());
      
      System.out.println("성별을 입력해주세요.");
      dto.setGender(scan.next()); 
      
      System.out.println("이메일을 입력해주세요.");
      dto.setEmail(scan.next());
      
      System.out.println("주소를 입력해주세요.");
      System.out.printf(scan.nextLine());
      
      dto.setAddress(scan.nextLine());
      
      int insertCnt = dao.memberInsert(dto);
      if (insertCnt == 1) {
         System.out.println("회원가입 성공: " + insertCnt);
      } else {
         System.out.println("회원가입 실패: " + insertCnt);
      }
   }
   
   // -------------  [5. 로그인]  ------------- 
   static void login() {
   
   _02_MemberDTO dto = new _02_MemberDTO();   
   
   System.out.println("아이디를 입력해주세요.");
   dto.setId(scan.next());
   
   System.out.println("비밀번호를 입력해주세요.");
   dto.setPassword(scan.next());
   
   int loginCnt = dao.login(dto);
   
      if (loginCnt == 1) {
         System.out.println("로그인 성공: " + loginCnt);
      } else {
         System.out.println("로그인 실패: " + loginCnt);
      }
   }
   
   
   // -------------  [4. 조회] -------------
   public static void memberSelect() {  

         System.out.println("ID를 입력해주세요: ");
         String id = dto.setId(scan.next());
         
         dto = dao.memberSelect(id);
         
         if (dto != null) {   
            System.out.println("조회 성공: " + dao);
         } else {
            System.out.println("조회 실패: " + dao);
         }
    }
   
      
   // ------------- [2. 수정] -------------
   static void memberUpdate() {
      
         _02_MemberDTO dto = new _02_MemberDTO();
         
         System.out.println("수정할 정보를 입력해주세요: ");
         
         System.out.println("ID: ");
         dto.setId(scan.next());
         
         System.out.println("비밀번호: ");
         dto.setPassword(scan.next());
         
         System.out.println("성별: ");
         dto.setGender(scan.next());
         
         System.out.println("이메일: ");
         dto.setEmail(scan.next());
         
         System.out.println("주소: " );
         dto.setAddress(scan.next());   
         
         int updateCnt = dao.memberUpdate(dto);
         
         if (updateCnt == 1){
            System.out.println("수정 성공: " + updateCnt);
         } else {
            System.out.println("수정 실패: " + updateCnt);
         }
      }
   
	// -------------  [6. 회원목록] -------------
   	public static void memberList(){  
		  
	   // 호출
	   List <_02_MemberDTO> list = new ArrayList <_02_MemberDTO>();
	   
	   // _02_MemberDAOImpl memberList를 호출하여 return된 list를 불러온다.
	   list = dao.memberList();
	   
	   // 방법1. 향상된 for문 조회
	   System.out.println("======방법1: 항상된 for문 조회========");
	   
	   for(_02_MemberDTO dto : list){
		   System.out.println(dto.toString());
	   }
	   System.out.println();
	   
	   // 방법2. 반복자 Iterator 조회
	   System.out.println("======방법2: 반복자 Iterator 조회========");
	   Iterator<_02_MemberDTO> iterator = list.iterator();
	   
	   // 값이 존재하는 동안 이동해가면서 출력
	   while(iterator.hasNext()) {
		   //_02_MemberDTO member = iterator.next();
		   System.out.println(iterator.next());
		   //System.out.println(member.toString());
	   }
	   System.out.println();
	  }

   // -------------  [7. 종료] -------------
   static void memberDelete() {
      
      _02_MemberDTO dto = new _02_MemberDTO();
      
      System.out.println("삭제할 ID를 입력해주세요: ");
      dto.setId(scan.next());
      
      int deleteCnt = dao.memberDelete(dto);
      
      if (deleteCnt == 1) {
         System.out.println("삭제 성공: " + deleteCnt);
      } else {
         System.out.println("삭제 실패: " + deleteCnt);
      }
   }
}