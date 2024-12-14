package ch10;

//AI서비스_웹과정반 @14일차
public class _04_StringBufferEx {
	public static void main (String[] args) {
		
		   /* 
	       * StringBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다.
	       * - 추가 : append()
	       * - 삽입 : insert(시작위치, 문자열) : 특정 위치에 원하는 문자열을 삽입한다.
	       * - subString(시작위치, 끝위치) : 시작위치에서 끝위치-1 까지의 문자열을 추출한다. 공백포함
	       *                             인덱스는 0부터 시작하며, 끝위치보다 작아야 한다.
	       * - toString() : 메서드를 이용해서 String형으로 변경한다.
	       */
		
		StringBuffer sb = new StringBuffer();
		// 추가 : append()
		sb.append ("맛있게 ");
		sb.append ("먹으면 ");
		sb.append ("0칼로리!! ");
		
		System.out.println("sb1: " + sb); // sb1: 맛있게 먹으면 0칼로리!!
		System.out.println("sb2: " + sb.toString()); // sb2: 맛있게 먹으면 0칼로리!! 
		
		// insert(시작위치, 문자열) : 특정 위치에 원하는 문자열을 삽입한다.
		sb.insert(8,"정말로 ");
		System.out.println("sb3: " + sb.toString()); // sb3: 맛있게 먹으면 정말로 0칼로리
		
		// subString(시작위치, 끝위치) // 시작위치는 0부터 시작, 끝위치 = 끝위치 -1
		System.out.println("sb4: " + sb.substring(4)); // sb4: 먹으면 정말로 0칼로리!! 
		
		// ----------------split("쪼갤 문자") => 중요----------------
		// split("쪼갤 문자") : 입력받는 정규표현식 또는 특정문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴한다.
		// -----------------------------------------------------
		String hpStr = "010-1234-5678";
		String[] hp = hpStr.split("-");
		
		System.out.println("hp1: " + hp[0]);
		System.out.println("hp2: " + hp[1]);
		System.out.println("hp3: " + hp[2]);
		
		System.out.println("------------");
		
		String city = "서울,제주도,부산,광주,대전"; //배열:5
		String[] cty = city.split(",");
		
		for(int i=0; i<cty.length; i++) {
			System.out.println(cty[i]);
		}
		
		System.out.println("------------");
		
		// trim: 공백제거
		String strTrim =  " HI!! ";
		System.out.println(strTrim); // 공백제거전
		System.out.println(strTrim.trim()); // 공백제거
	}
}
