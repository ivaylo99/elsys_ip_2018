package org.elsys.ip.rest.repository;

import org.elsys.ip.rest.model.Cars;

import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CarsRepository {
  private static List<Cars> carsList = new ArrayList<>(
          Arrays.asList(
                  new Cars(1, "Audi", "A8", "car", "black", 3.0, 2014, "automatic", 50000, "gasoline", "AWD"),
                  new Cars(2, "BMW", "M5", "car", "white", 3.5, 2012, "automatic", 70000, "diesel", "RWD"),
                  new Cars(3, "Lamborghini", "Aventador", "car", "black", 6.0, 2014, "manual", 300000, "gasoline", "FWD"),
                  new Cars(4, "Mercedes", "ML", "jeep", "black", 5.5, 2008, "manual", 40000, "diesel", "AWD")
          ));


  public List<Cars> getCarsList(MultivaluedMap<String, String> params) {
    if (params.size() != 0) {
      List<Cars> filteredCars = new ArrayList<>();
      for (Cars cars : carsList) {

        if (params.get("id") != null &&
                !params.get("id").contains(String.valueOf(cars.getId()))) {
          continue;
        }
        if (params.get("brand") != null &&
                !params.get("brand").contains(cars.getBrand())) {
          continue;
        }
        if (params.get("model") != null &&
                !params.get("model").contains(cars.getModel())) {
          continue;
        }
        if (params.get("category") != null &&
                params.get("category").contains(cars.getCategory())) {
          continue;
        }
        if (params.get("color") != null &&
                params.get("color").contains(cars.getColor())) {
          continue;
        }
        if (params.get("engine_volume") != null &&
                params.get("engine_volume").contains(String.valueOf(cars.getEngine_volume()))) {
          continue;
        }
        if (params.get("year") != null &&
                params.get("year").contains(String.valueOf(cars.getYear()))) {
          continue;
        }
        if (params.get("gearbox") != null &&
                params.get("gearbox").contains(cars.getGearbox())) {
          continue;
        }
        if (params.get("cost") != null &&
                params.get("cost").contains(String.valueOf(cars.getCost()))) {
          continue;
        }
        if (params.get("engine") != null &&
                params.get("engine").contains(cars.getEngine())) {
          continue;
        }
        if (params.get("wd") != null &&
                params.get("wd").contains(cars.getWd())) {
          continue;
        }
        filteredCars.add(cars);
      }
      return filteredCars;
    }
    return carsList;
  }

  public Optional<Cars> getCarsById(Integer id) {
    return carsList.stream().filter(car -> car.getId() == id).findFirst();
  }

  public Cars saveCars(Cars cars) {
    carsList.add(cars);
    return cars;
  }

  public Cars updateCars(Integer id, Cars test) {
    int realId = id - 1;
    carsList.set(realId, test);
    return test;
  }

  public void deleteCars(Integer id) {
    carsList.removeIf(it -> it.getId() == id);
  }
}