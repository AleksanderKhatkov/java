import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        My_plants my_plants = new My_plants();

        my_plants.add(new Indoor_plant("cactus", 12, 10, Glaze.RARELY));
        my_plants.add(new Indoor_plant("Tree Crassula", 10, 9, Glaze.MEDIUM));
        my_plants.add(new Indoor_plant("Rose flower", 5, 5, Glaze.OFTEN));
        my_plants.add(new Garden_plant("Apple tree", 150, 30, 1.1));
        System.out.println("1=" + my_plants);
        System.out.println("______________________________________________________________________________");

        my_plants.remove("cactus");
        System.out.println("2=" + my_plants);
        System.out.println("______________________________________________________________________________");

        my_plants.add(new Indoor_plant("cactus", 19, 10, Glaze.RARELY));


        System.out.println("3=" + my_plants);
        System.out.println("______________________________________________________________________________");
        my_plants.print();

        System.out.println("______________________________________________________________________________");
        List<Plant> listByheigth = my_plants.findByHeight(5,20);
        System.out.println("listByHeight = " + listByheigth);

        System.out.println("______________________________________________________________________________");
        List<Plant> listBygetLife_span = my_plants.findByLife_span(10);
        System.out.println("listBygetLife_span = " + listBygetLife_span);



        //вызываем метод для записи в файл

        try {
            my_plants.writeToCsvFile("1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //вызываем метод для читения из файла
        try {
            my_plants.readFromCsvFile("1.txt");
            my_plants.print();
        } catch (FileNotFoundException | MyException e) {
            System.out.println(e);
        }
    }
}
