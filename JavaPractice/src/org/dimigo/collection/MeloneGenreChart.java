/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.collection
 * |_ MeloneChart
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author 	 : 김채린
 * @version  :1.0
 */
public class MeloneGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Map<String,List<Music>> map = new HashMap<>();
		List<Music>balad = new ArrayList<Music>();
		List<Music>dance = new ArrayList<Music>();
		
		dance.add(new Music("피카", "지우"));
		dance.add(new Music("피카피카", "이슬"));
		dance.add(new Music("츄!!!","웅이"));
		
		balad.add(new Music("씨씨", "가랏"));
		balad.add(new Music("이상해 씨!!", "포켓몬!"));
		balad.add(new Music("이상해씨!!덩쿨채찍!!","너밖에 없다!"));
		
		map.put("발라드",balad);
		map.put("댄스", dance);
		
		System.out.println("--<< 녹차 차트 >>--");
		printList(map);
		
		System.out.println("--<< 발라드 3위곡 변경 >>--");
		balad.set(2, new Music("가라!!백만볼트!!","피카피카!!"));
		printList(map);
		
		System.out.println("--<< 발라드 1위곡 삭제 >>--");
		balad.remove(0);
		printList(map);
		
		System.out.println("--<< 전체 삭제 >>--");
		balad.clear();
		printList(map);
		
	}

	
	public static void printList( Map<String,List<Music>> map) {
		int i=0;
		for(Entry<String, List<Music>> entry : map.entrySet()) {
			System.out.println("["+entry.getKey()+ "]");
			i=0;
			for(Music m : entry.getValue()) {
				i++;
				System.out.println(i + ". " + m);
				
			}
		}
		
	}
	
}
