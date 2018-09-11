package com.expedia.library.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.expedia.library.sort.SortingUtil;

class SortingUtilTests {

	private List<Order> orders;

	@BeforeEach
	public void before() {
		Order order1 = new Order(1234, "abcd");
		Order order2 = new Order(2234, "ebcd");
		Order order3 = new Order(3234, "bbcd");
		Order order4 = new Order(4234, "gbcd");
		Order order5 = new Order(5234, "dbcd");
		Order order6 = new Order(6234, "fbcd");
		Order order7 = new Order(7234, "cbcd");
		this.orders = new ArrayList<>();
		this.orders.add(order1);
		this.orders.add(order2);
		this.orders.add(order3);
		this.orders.add(order4);
		this.orders.add(order5);
		this.orders.add(order6);
		this.orders.add(order7);

	}

	@Test
	void testInsertionSortWithSortOnStringPropertyAscendingOrder() {
		Comparator<Order> comp = (Order order1, Order order2) -> {
			return order1.getOrderName().compareTo(order2.getOrderName());
		};
		SortingUtil.insertionSort(this.orders, comp);
		List<String> orderNames = new ArrayList<>();
		for (Order order : this.orders) {
			orderNames.add(order.getOrderName());
		}
		assertEquals(orderNames, new ArrayList<String>(Arrays.asList("abcd", "bbcd", "cbcd", "dbcd", "ebcd", "fbcd", "gbcd")));

	}
	
	@Test
	void testInsertionSortWithSortOnIntegerPropertDescendingOrder() {
		Comparator<Order> comp = (Order order1, Order order2) -> {
			return order2.getOrderNo().compareTo(order1.getOrderNo());
		};
		SortingUtil.insertionSort(this.orders, comp);
		List<Integer> orderNos = new ArrayList<>();
		for (Order order : this.orders) {
			orderNos.add(order.getOrderNo());
		}
		assertEquals(orderNos, new ArrayList<Integer>(Arrays.asList(7234, 6234, 5234, 4234, 3234, 2234, 1234)));

	}
	
	@Test
	void testQuickSortWithSortOnStringPropertyAscendingOrder() {
		Comparator<Order> comp = (Order order1, Order order2) -> {
			return order1.getOrderName().compareTo(order2.getOrderName());
		};
		SortingUtil.quickSort(this.orders, comp);
		List<String> orderNames = new ArrayList<>();
		for (Order order : this.orders) {
			orderNames.add(order.getOrderName());
		}
		assertEquals(orderNames, new ArrayList<String>(Arrays.asList("abcd", "bbcd", "cbcd", "dbcd", "ebcd", "fbcd", "gbcd")));

	}
	
	@Test
	void testQuickSortWithSortOnIntegerPropertDescendingOrder() {
		Comparator<Order> comp = (Order order1, Order order2) -> {
			return order2.getOrderNo().compareTo(order1.getOrderNo());
		};
		SortingUtil.quickSort(this.orders, comp);
		List<Integer> orderNos = new ArrayList<>();
		for (Order order : this.orders) {
			orderNos.add(order.getOrderNo());
		}
		assertEquals(orderNos, new ArrayList<Integer>(Arrays.asList(7234, 6234, 5234, 4234, 3234, 2234, 1234)));

	}
	
	@Test
	void testBubbleSortWithSortOnStringPropertyAscendingOrder() {
		Comparator<Order> comp = (Order order1, Order order2) -> {
			return order1.getOrderName().compareTo(order2.getOrderName());
		};
		SortingUtil.bubbleSort(this.orders, comp);
		List<String> orderNames = new ArrayList<>();
		for (Order order : this.orders) {
			orderNames.add(order.getOrderName());
		}
		assertEquals(orderNames, new ArrayList<String>(Arrays.asList("abcd", "bbcd", "cbcd", "dbcd", "ebcd", "fbcd", "gbcd")));

	}
	
	@Test
	void testBubbleSortWithSortOnIntegerPropertDescendingOrder() {
		Comparator<Order> comp = (Order order1, Order order2) -> {
			return order2.getOrderNo().compareTo(order1.getOrderNo());
		};
		SortingUtil.bubbleSort(this.orders, comp);
		List<Integer> orderNos = new ArrayList<>();
		for (Order order : this.orders) {
			orderNos.add(order.getOrderNo());
		}
		assertEquals(orderNos, new ArrayList<Integer>(Arrays.asList(7234, 6234, 5234, 4234, 3234, 2234, 1234)));

	}

}
