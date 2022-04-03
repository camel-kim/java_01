package Quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class Test02 {
	public ArrayList arrayList() {
		ArrayList arr = new ArrayList();
		while (arr.size() < 6) {
			int ran = (int) (Math.random() * 45) + 1;
			if (arr.contains(ran) == false)
				arr.add(ran);
		}
		return arr;
		//ArrayList의 경우 중복값을 허용하기 때문에,
		//arr.contains(ran) == false  / arr에 ran 값이 없을 경우
		//arr.add(ran); arr에 입력.
	}

	public HashSet hashSet() {
		HashSet hs = new HashSet();
		while (hs.size() < 6) {
			hs.add((int) (Math.random() * 45) + 1);
		}
		return hs;
		//HashSet 의 경우 중복값 허용X 
		//hs.size  6개 이하일 경우 명령어 실행해서 입력.
	}
}

