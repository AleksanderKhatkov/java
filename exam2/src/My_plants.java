import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class My_plants {
    private List<Plant> list = new ArrayList<>();

    // 5)	Добавление растения
    public void add(Plant plant) {
        list.add(plant);
    }

    @Override
    public String toString() {
        return "My_plants [list=" + list + "]";
    }

    // 6)	Удаление растений по названию
    public void remove(String name) {
        list.removeIf((Plant plant)-> (plant.getName().equals(name)));
    }

    // 7)	Вывод всех растений на экран в алфавитном порядке названия
    public void print() {
        list.sort((Plant plant1, Plant plant2)->(plant1.getName().compareTo(plant2.getName())));
        System.out.println(this);
    }

    // 8)  Выбор растений по заданному диапазону высоты
        public List<Plant> findByHeight(int minHeight, int maxHeight) {
            List<Plant> result = new ArrayList<>(list);
            result.removeIf((Plant plant) -> (plant.getHeight() < minHeight || plant.getHeight() > maxHeight));
            return result;
    }

    //9)  Выбор растений по заданной продолжительности жизни;
    public List<Plant> findByLife_span(int life_span) {
        List<Plant> result = new ArrayList<>(list);
        result.removeIf((Plant plant)->(plant.getLife_span()!=life_span));
        return result;
    }

    // 10)	Сохранения в текстовый файл в заданным именем;
    public void writeToCsvFile(String outputFileName)
            throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(outputFileName);
        for (Plant plant : list) {
            pw.println(plant.toCsv());
        }
        pw.close();
    }

    // 11)	Загрузка из текстового файла;
    public void readFromCsvFile(String inputFileName) throws FileNotFoundException, MyException {
        Scanner sc = new Scanner(new File(inputFileName));
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] fields = line.split(",");

            switch (fields[0]) {
                case "Indoor_plant":
                    list.add(new Indoor_plant(fields[1], Integer.valueOf(fields[2]),
                            Integer.valueOf(fields[3]), Glaze.valueOf(fields[4])));
                    break;
                case "Garden_plant":
                    list.add(new Garden_plant(fields[1], Integer.valueOf(fields[2]),
                            Integer.valueOf(fields[3]), Double.valueOf(fields[4])));
                    break;
                default:
                    throw new MyException("Error in Class Name");
            }
        }
        sc.close();
    }
}
