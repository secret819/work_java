package test02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> lottList = new ArrayList<Integer>();
		for(int i = 1; i <= 6; i++) {
			int lotto = (int)(Math.random()*45) + 1;
			if(lottList.indexOf(lotto)!=-1) {
				i--;
				continue;
			}
			lottList.add(lotto);
		}
		
		for(int i = 0; i < lottList.size(); i++) {
			System.out.println(i + 1 + "번째 번호 : " + lottList.get(i));
		}
	}
}
