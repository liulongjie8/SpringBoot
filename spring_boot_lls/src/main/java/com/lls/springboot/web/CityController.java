package com.lls.springboot.web;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lls.springboot.bean.City;
import com.lls.springboot.service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService cityService;

	@ApiOperation(value = "获取城市信息", notes = "根据ID获取城市的信息")
	@ApiImplicitParam(name = "id", value = "城市ID", required = true, dataType = "Long")
	@RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
	public City findOneCity(@PathVariable("id") Long id) {
		return cityService.findById(id);
	}

	@ApiOperation(value = "获取所有的城市信息")
	@RequestMapping(value = "/api/city", method = RequestMethod.GET)
	public List<City> findAllCity() {
		return cityService.findAllCity();
	}

	@RequestMapping(value = "/api/city/update/{id}", method = RequestMethod.GET)
	public String updateCitp(@PathVariable("id") Long id) {
		City city = cityService.findById(id);
		city.setProvinceId(13L);
		return cityService.updateCity(city);
	}
}
