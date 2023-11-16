// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);

        System.out.println(" Задача 2 ");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + " " + cat + " " + paper);

        System.out.println(" Задача 3 ");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + " " + paper);

        System.out.println(" Задача 4 ");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println(" Задача 5 ");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println(" Задача 6 ");

        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var result = fighterWeight1 + fighterWeight2;
        System.out.println(" Вместе бойцы весят " + result + " кг ");
        var result2 = fighterWeight1 - fighterWeight2;
        System.out.println(" Разница между бойцами " + result2 + " кг ");

        System.out.println(" Задача 7 ");

        var result3 = fighterWeight2 - fighterWeight1;
        System.out.println(" Вычитание из большей массы меньшей " + result3 + " кг ");
        var result4 = fighterWeight2 % fighterWeight1;
        System.out.println(" С функцией остаток от деления  " + result4 + " кг " + " ");

        System.out.println(" Задача 8 ");

        var Time = 640;
        var WorkTime = 8;
        var Workers = Time / WorkTime;
        System.out.println("Всего работников в компании " + Workers + " человек ");
        var Reinforcement = 94;
        System.out.println("Допустим что в компании работает на " + Reinforcement + " сотрудника больше ");
        var Pull = Workers + Reinforcement;
        var FinalTime = Pull * 8;
        System.out.println("Если в компании работает " + Pull + " человека ," + " то всего " + FinalTime + " часов работы может быть поделено между сотрудниками ");


    }
}