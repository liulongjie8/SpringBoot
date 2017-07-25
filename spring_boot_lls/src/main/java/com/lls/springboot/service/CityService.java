package com.lls.springboot.service;

import java.util.List;

import com.lls.springboot.bean.City;

public interface CityService {

	public City findById(Long id);

	public List<City> findAllCity();

	public String saveCity();

	public String updateCity(City city);

	public String deleteCity(Long Id);

}
