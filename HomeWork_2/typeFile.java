package HomeWork_2;

import java.io.File;
/*
Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
4 Расширение файла: jpg
 */
public class typeFile {
    public static void main(String[] args) {
        findFileTypeInFolder();
    }

    public static void findFileTypeInFolder() {
        File folder = new File(
                "C:\\Users\\admin\\Desktop\\GeekBrains\\Обучение\\1 четверть\\Java\\HomeWork\\HomeWork_2");
        for (File file : folder.listFiles()) {
            System.out.print(file.getName() + " -> .");

            String extension = "";
            int pointIndexInFileName = file.getName().lastIndexOf('.');
            
            if (pointIndexInFileName > 0) {
                extension = file.getName().substring(pointIndexInFileName + 1);
                System.out.println(extension);
            }
        }
    }
}
