package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.management.openmbean.KeyAlreadyExistsException;

//아메리카노, 아이스 아메리카노, 카페라떼
enum CoffeType {
	AMERICANO,
	ICE_AMERICANO,
	CAFE_LATTE
}

public class Mainn {

	int
	
	public static void main(String[] args) {
		
	
		 // 상수 집합 : enum
		System.out.println(CoffeType.AMERICANO);
		 System.out.println(CoffeType.ICE_AMERICANO);
		 System.out.println(CoffeType.CAFE_LATTE);
		 for(CoffeType type : CoffeType.values()) {
			 System.out.println(type);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
