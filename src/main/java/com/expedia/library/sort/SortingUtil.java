package com.expedia.library.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class SortingUtil {

	public static <T> List<T> bubbleSort(List<T> list, Comparator<T> comp) {
		for (int i = list.size() - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (comp.compare(list.get(j), list.get(j + 1)) > 0) {
					T temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		return list;
	}

	public static <T> List<T> insertionSort(List<T> list, Comparator<T> comp) {
		int in, out;
		for (out = 1; out < list.size(); out++) {
			T temp = list.get(out);
			in = out;
			while (in > 0 && comp.compare(list.get(in - 1), temp) > 0) {
				list.set(in, list.get(in - 1));
				--in;
			}
			list.set(in, temp);
		}
		return list;
	}

	public static <T> void quickSort(List<T> list, Comparator<T> comp) {
		quickSortBetweenLowToHigh(list, comp, 0, list.size() - 1);
	}

	private static <T> void quickSortBetweenLowToHigh(List<T> list, Comparator<T> comp, int low, int high) {
		if (list == null || list.size() == 0)
			return;

		if (low >= high)
			return;
		
		int middle = low + (high - low) / 2;
        T pivot = list.get(middle);

        int i = low, j = high;
		while (i <= j) {
			while (comp.compare(list.get(i), pivot) < 0)
				i++;
			while (comp.compare(pivot, list.get(j)) < 0)
				j--;

			if (i <= j) {
				Collections.swap(list, i, j);
				i++;
				j--;
			}

		}
		if (low < j) {
			quickSortBetweenLowToHigh(list, comp, low, j);
		}

		if (i < high) {
			quickSortBetweenLowToHigh(list, comp, i, high);
		}
	}

	public static <T extends Comparable<T>> int findMinIndex(final List<T> xs) {
		int minIndex;
		if (xs.isEmpty()) {
			minIndex = -1;
		} else {
			final ListIterator<T> itr = xs.listIterator();
			T min = itr.next(); // first element as the current minimum
			minIndex = itr.previousIndex();
			while (itr.hasNext()) {
				final T curr = itr.next();
				if (curr.compareTo(min) < 0) {
					min = curr;
					minIndex = itr.previousIndex();
				}
			}
		}
		return minIndex;
	}

	public static <T extends Comparable<T>> T findMinValue(final List<T> xs) {
		T minValue = null;
		if (!xs.isEmpty()) {
			final ListIterator<T> itr = xs.listIterator();
			T min = itr.next(); // first element as the current minimum
			minValue = itr.previous();
			while (itr.hasNext()) {
				final T curr = itr.next();
				if (curr.compareTo(min) < 0) {
					min = curr;
					minValue = itr.previous();
				}
			}
		}
		return minValue;
	}
}