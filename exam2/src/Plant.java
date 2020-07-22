/*1)  Определить класс Растение с информацией о названии, высоте, продолжительности жизни;
2) Определить класс-наследник КомнатноеРастение с дополнительной информацией о характере полива (часто/средне/редко – перечисление);
3) Определить класс-наследник СадовоеРастение с дополнительной информацией о занимаемой площади;
4) Определить класс-коллекцию МоиРастения для объектов Растение, который предоставляет следующие возможности (методы):
5)	Добавление;
6)	Удаление по названию;
7)	Вывод всех растений на экран в алфавитном порядке названия;
8)	Выбор растений по заданному диапазону высоты;
9)	Выбор растений по заданной продолжительности жизни;
10)	Сохранения в текстовый файл с заданным именем;
11)	Загрузка из текстового файла;
12) При реализации генерировать и обрабатывать исключительные ситуации, в том числе своих классов.
Продемонстрировать все возможности класса МоиРастения.
*/

public abstract class Plant {
    private String name;
    private int height;
    private int life_span;


    public Plant(String name, int height, int life_span) {
        this.name = name;
        this.height = height;
        this.life_span = life_span;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLife_span() {
        return life_span;
    }

    public void setLife_span(int life_span) {
        this.life_span = life_span;
    }

    @Override
    public String toString() {
        return "Plant [name=" + name + ", height=" + height + ", life_span=" + life_span + "]";
    }

    public abstract String toCsv();
}

