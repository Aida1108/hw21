public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 1.7, "желтый", 2020, "Германия");
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея");
        System.out.println(kia);
        Car hundai = new Car("Hundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(hundai);
    }
}