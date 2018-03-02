package com.ness.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ness.bean.StoreItems;

@Repository
public class OrderItemDao {

	public List<StoreItems> fetchOrderedItems() {
		List<StoreItems> storeItems=new ArrayList<>();
		storeItems.add(new StoreItems("S100",7, 1200.80f, "APPLE"));
		storeItems.add(new StoreItems("S200",7, 1200.80f, "SAMSUNG"));
		storeItems.add(new StoreItems("S300",7, 1200.80f, "NOKIA"));
		storeItems.add(new StoreItems("S400",7, 1200.80f, "ONE+"));
		return storeItems;
	}

}
