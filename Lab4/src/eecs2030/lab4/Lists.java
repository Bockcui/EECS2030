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
		List<T> copyList = List.copyOf(list);
		if (copyList.size() < 1) {
			return;
		}
		
		T min = copyList.get(0);
		for(int j = 0; j< copyList.size(); j++) {
			T temp = copyList.get(j);
			if(temp.compareTo(min) < 0) {
				min = temp;
			}
		}

		copyList.remove(min);
		copyList.add(0, min);
		
		Lists.selectionSortRecursive(copyList.subList(1, copyList.size()));
	}
	
	public static <T extends Comparable <? super T>> void selectionSortIterative(List <T> list){
		//TODO implement the Iterative solution
		List<T> copyList = List.copyOf(list);
		for(int i = 0; i< copyList.size(); i++) {
			int k = i;
			for(int j = k + 1; j< copyList.size(); j++) {
				if(copyList.get(j).compareTo(copyList.get(k)) < 0) {
					k = j;
				}
			}
			
			if (i != k) {
				T temp = copyList.get(i);
				copyList.set(i,copyList.get(k));
				copyList.set(k, temp);
			}
		}
	}

}
