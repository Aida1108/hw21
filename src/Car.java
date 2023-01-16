public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private Integer year;
    private String country;

    public Car (String brand, String model, double engineVolume, String color, Integer year, String country) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.year = validateYear(year);
        this.country = validateCarParameters(color);
    }

    @Override
    public String toString() {
        return "Car{" + "brand = " + brand + ", model = " + model +
                ", engineVolume = " + engineVolume + ", color = " + color +
                ", year = " + year + ", country = " + country + "}";

    }
    public static double validateEngineVolume(double value) {return  value < 0 ? 1.5 : value;}
    public static Integer validateYear(Integer value){ return  value <= 0 ? 2000 : value;}
    public static String validateCarParameters(String value) { return validateString(value, "default");}
    public static String validateCarColor(String value){ return  validateString(value, "белый");}


    public static String validateString(String value, String defaultValue) {
        return (value == null || value.isBlank() || value.isEmpty()) ? defaultValue : value;
    }
    public static Integer validateNum(Integer value) {return value == null || value < 0 ? 0 : value;}
}
