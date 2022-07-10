package eecs2030.lab4;

import java.util.Comparator;
import java.util.List;

public class Lists {
	private Lists(){} //no objects of this class are desired
	
	public static <T extends Comparable <? super T>> void defaultSort(List <T> list){
		list.sort(Comparator.naturalOrder()); //will use a built-in variation of mergesort
											//alternative: Collections.sort(list);
	}

	public static <T extends Comparable <? super T>> void selectionSortRecursive(List <T> list){
		//TODO implement the recursive solution
		
		if (list.size() < 1) {
			return;
		}
		
		T min = list.get(0);
		for(int j = 0; j< list.size(); j++) { //找最小值
			T temp = list.get(j);
			if(temp.compareTo(min) < 0) {
				min = temp;
			}
		}

		list.remove(min);//删除最小值
		list.add(0, min);//把找到的最小值放在第一位
		
		Lists.selectionSortRecursive(list.subList(1, list.size())); //用subList来把剩下的list重新找最小值
	}
	
	public static <T extends Comparable <? super T>> void selectionSortIterative(List <T> list){
		//TODO implement the Iterative solution
		
		for(int i = 0; i< list.size(); i++) {
			int k = i;
			for(int j = k + 1; j< list.size(); j++) {
				if(list.get(j).compareTo(list.get(k)) < 0) {
					k = j;
				}
			}
			
			if (i != k) {
				T temp = list.get(i);
				list.set(i,list.get(k));
				list.set(k, temp);
			}
		}
	}

}
