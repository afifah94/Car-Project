package service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import model.Car;

@Service
public class CarService {
	Hashtable<String, model.Car> cars = new Hashtable<String, Car>();
	public CarService() {
		model.Car c = new Car();
		c.setManufacturer("Perodua");
		c.setName("Alza");
		cars.put("1", c);
		
		c = new Car();
		c.setManufacturer("Perodua");
		c.setName("Alza");
		cars.put("2", c);
	}
	public Car getPerson(String manufacturer) {
		if (cars.containsKey(manufacturer))
			return cars.get(manufacturer);
		else
			return null;
	}
	public Hashtable<String, Car> getAll() {
		return cars;
	}
	public Car getCar(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

}
