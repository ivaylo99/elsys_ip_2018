package org.elsys.ip.rest.service;

import org.elsys.ip.rest.model.Cars;
import org.elsys.ip.rest.repository.CarsRepository;

import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.List;

public class CarsService {

  private CarsRepository carsRepository = new CarsRepository();

  public List<Cars> getCarsList(MultivaluedMap<String, String> params) {
    return carsRepository.getCarsList(params);
  }

  public Cars getCarsById(Integer id) {
    return carsRepository.getCarsById(id).orElse(null);
  }

  public Cars saveCars(Cars cars) {
    return carsRepository.saveCars(cars);
  }

  public Cars updateCars(Integer id, Cars cars) {
    return carsRepository.updateCars(id, cars);
  }

  public void deleteCars(Integer id) {
    carsRepository.deleteCars(id);
  }
}