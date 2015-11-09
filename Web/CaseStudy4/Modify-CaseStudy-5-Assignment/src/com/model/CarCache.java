package com.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import lombok.Data;

@Data
public class CarCache {
	
	
	
	private static Map<Integer,Car> carCacheMap = new ConcurrentHashMap<Integer, Car>();
	private static CarCache carCache ;
	
	public static CarCache getInstance() {
		if(carCache ==null)
			carCache = new CarCache();
		return carCache ;
	}

	private CarCache() {
		
	}
	

	
	public boolean insertCarCache(Car car) {
		Car	isInsert =carCacheMap.put(car.getId(), car);
		if(isInsert!=null)
			return true;
		return false;
	}
	
	public boolean updateCarCache(Car car) {
		Car oldCar =carCacheMap.get(car.getId());
		if(oldCar !=null)
			return insertCarCache(car);
		return false;
	}
	public  boolean deleteCarInCache(Car car) {
		Car isDeleted = carCacheMap.remove(car.getId());
		if(isDeleted !=null)
			return true;
		return false;
		
	}
	
	
}
