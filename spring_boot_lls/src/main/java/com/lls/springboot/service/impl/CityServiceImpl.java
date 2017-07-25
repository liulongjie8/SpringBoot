package com.lls.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lls.springboot.bean.City;
import com.lls.springboot.dao.CityDao;
import com.lls.springboot.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;

	@Override
	@Cacheable(key = "#p0", value = "city")
	public City findById(Long id) {
		return cityDao.findById(id);
	}

	@Override
	public List<City> findAllCity() {
		return cityDao.findAllCity();
	}

	@Override
	public String saveCity() {
		return cityDao.saveCity();
	}

	@Override
	@CacheEvict(value = "city", key = "#p0")
	public String updateCity(City city) {
		return cityDao.updateCity(city) + "";
	}

	@Override
	public String deleteCity(Long Id) {
		return cityDao.deleteCity(Id) + "";
	}

}
