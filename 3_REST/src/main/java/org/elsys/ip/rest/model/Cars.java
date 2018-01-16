package org.elsys.ip.rest.model;

public class Cars {
  private int id;
  private String brand;
  private String model;
  private String category;
  private String color;
  private double engine_volume;
  private int year;
  private String gearbox;
  private int cost;
  private String engine;
  private String wd;

  public Cars(int id, String brand, String model, String category, String color, double engine_volume, int year, String gearbox,
              int cost, String engine, String wd) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.category = category;
    this.color = color;
    this.engine_volume = engine_volume;
    this.year = year;
    this.gearbox = gearbox;
    this.cost = cost;
    this.engine = engine;
    this.wd = wd;
  }

  public Cars() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getEngine_volume() {
    return engine_volume;
  }

  public void setEngine_volume(double engine_volume) {
    this.engine_volume = engine_volume;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getGearbox() {
    return gearbox;
  }

  public void setGearbox(String gearbox) {
    this.gearbox = gearbox;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getWd() {
    return wd;
  }

  public void setWd(String wd) {
    this.wd = wd;
  }

}