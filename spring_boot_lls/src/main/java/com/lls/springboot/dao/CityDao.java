package com.lls.springboot.dao;

import java.util.List;

import com.lls.springboot.bean.City;

public interface CityDao {

	public City findById(Long id);

	public List<City> findAllCity();

	public String saveCity();

	public Integer updateCity(City city);

	public Integer deleteCity(Long Id);

}
