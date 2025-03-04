package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	Scanner sc = new Scanner(System.in);
	
	Set<String> toy = new HashSet<>();
	
	private List<Toy> toyList = new ArrayList<>();
	
	private Map<Integer, String> materials = new HashMap<>();
	
	
	public ToyFactory() {
		
		
		
		
		materials.put(1, "면직물");
		materials.put(2, "플라스틱");
		materials.put(3, "유리");
		materials.put(4, "고무");
		
		
		toyList.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", "면직물, 고무"));
		toyList.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", "면직물, 플라스틱"));
		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", "면직물, 플라스틱"));
		toyList.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", "면직물, 플라스틱"));
		toyList.add(new Toy("파피", 12, 57000, "빨간색", "19931225", "면직물, 플라스틱, 고무"));
		
	}
	
	public void displayMenu() {
		
		int menuNum = 0;	// 메뉴 선택용 변수
		
		do {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			
			System.out.print("선택 : ");
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine();
				
				switch(menuNum) {
				case 1 : allToy(); break;
				case 2 : System.out.println(addToy());break;
				case 3 : System.out.println(removeToy());break;
				case 4 : sortByMade(); break;
				case 5 :  break;
				case 6 : addMaterials(); break;
				case 7 : System.out.println(removeMaterials()); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요");
				}
				
				
			} catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해 주십시오!");
				
				sc.nextLine();
				
				menuNum = -1;
			}
		} while(menuNum != 0);
	}
	
	/**
	 * 1. 전체 장난감 조회하기 메서드
	 */
	public void allToy() {
		System.out.println("<전체 장난감 목록>");
		
		if(toyList.isEmpty()) {
			System.out.println("장난감이 없습니다.");
			return;
		}	
			int index = 0;
			for(Toy toy : toyList) {
				System.out.print((++index)+".");
				System.out.println(toy);
			}
			
			
			
		}
	
	/**
	 * 2. 새로운 장난감 만들기 메서드
	 */
	public String addToy() {
		System.out.println("새로운 장난감 추가");
		
		System.out.print("장난감 이름: ");
		String name = sc.next();
		
		System.out.print("사용 가능 연령: ");
		int age = sc.nextInt();
		
		System.out.print("가격: ");
		int price = sc.nextInt();
		
		System.out.print("색상: ");
		String color = sc.next();
		
		System.out.print("제조일(YYYYMMDD형식으로 입력): ");
		String made = sc.next();
		
		 String materials = "";
		 
		while (true) {
            System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요): ");
            String material = sc.next();
            
            if (material.equals("q")) { // 'q' 입력 시 종료
                break;
            }
            if (!materials.isEmpty()) { 
                materials += ", ";
            }
          materials += material;
            
		} 
		if(toyList.add(new Toy(name, price, age, color, made, materials))){
			return "새로운 장난감이 추가되었습니다.";
		}
		return "실패";
		
	}
	
	/**
	 * 3. 장난감 삭제 메서드
	 */
	public String removeToy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요: ");
		String name = sc.next();
		
		for(Toy sakje : toyList) {
			if(sakje.getName().equals(name)) {
				toyList.remove(sakje);
				return "장난감이 삭제되었습니다.";
			}
		}
		return "";
		
		
	}
	
	/**
	 * 4. 장난감 제조일순으로 조회 메서드
	 */
	public void sortByMade() {
		
		Collections.sort(toyList, new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
				return o1.getMade().compareTo(o2.getMade());
			}
			
		});
		int index = 0;
		for(Toy day : toyList) {
			System.out.print((++index)+".");
			System.out.println(day);
		}
	
	}
	
	/**
	 * 5. 연령별 사용가능한 장난감 리스트 메서드
	 */
	public void sortByAge() {
		
		Map<Integer, String> age = new HashMap<>();
		// 어렵 ㅠㅠ
	}
	
	/**
	 * 6. 재료 추가
	 * - 재료추가하는 메서드(addMaterials) 작성
		-> 재료가 몇 개 들어올지 정해져있지 않음 (1or2or3개)
		addMaterials (전달인자가 몇개인지 정해져있지 않음)
		--> 가변인자 자료형...변수명 (ex. int...nums)
	 */
	public void addMaterials() {
		System.out.println("<재료 추가>");
		System.out.println("---현재 등록된 재료---");
		
		int index = 0;
		
		for (Map.Entry<Integer, String> entry : materials.entrySet()) { 
			System.out.print(++index + ": ");
	        System.out.println(entry.getValue()); 
	    }
		
		System.out.print("재료 고유번호(Key) 입력: ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력: ");
		String material = sc.next();
		
		materials.put(key, material);
		
		// 재료를 추가하지 않았는데도 
		// 이미 해당키 문구가 계속 뜨는 문제ㅠㅠ
		if (materials.isEmpty()) {
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}
		if(materials.containsKey(key)) {	// ctrl + space해서 찾은 컨테인즈
			System.out.println("이미 해당키에 재료가 등록되어 있습니다.");
			System.out.print("덮어 쓰시겠습니까? (Y/N): ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
			} else {
				System.out.println("취소");
			}
		}	// 가변인자.. 가변배열.. 잘 모르겠어서 활용 못함,,,
		
		
			
		
	}
	
	/**
	 * 7. 재료 제거
	 */
	public String removeMaterials() {
		System.out.println("<재료 삭제>");
		System.out.println("---현재 등록된 재료---");
		
		int index = 0;
		
		for (Map.Entry<Integer, String> entry : materials.entrySet()) { 
			System.out.print(++index + ": ");
	        System.out.println(entry.getValue()); 
	    }
		
		System.out.print("삭제할 재료명 입력: ");
		String sakje = sc.next();
		
		Integer sakjeKey = 0;
		for(Entry<Integer, String> entry : materials.entrySet()) {
			if(entry.getValue().equals(sakje)){
				sakjeKey = entry.getKey();
			}	
				if(sakjeKey != 0) {
				materials.remove(sakjeKey);
				return "재료 '"+sakje+"'가 성공적으로 제거되었습니다.";
		}
	 }
		return "해당 이름의 재료가 존재하지 않습니다.";
	}
}
