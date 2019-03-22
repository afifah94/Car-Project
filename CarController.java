package controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CarService;
import model.Car;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	CarService cs;
	
	@RequestMapping("/all")
	public Hashtable<String, Car> getAll() {
		return cs.getAll();
	}
	
	@RequestMapping("{manufacturer}")
	public Car getCar(@PathVariable("manufacturer") String manufacturer) {
		return cs.getCar(manufacturer);
	}
}

