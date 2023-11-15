// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);

        System.out.println(" ");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + " " + cat + " " + paper);

        System.out.println(" ");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + " " + paper);

        System.out.println(" ");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println(" ");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println(" ");

        var FighterWeight = 78.2;
        var fighterWeight = 82.7;
        var result = FighterWeight + fighterWeight;
        System.out.println(" Вместе бойцы весят " + result + " кг ");
        var result2 = FighterWeight - fighterWeight;
        System.out.println(" Разница между бойцами " + result2 + " кг ");
        var result3 = fighterWeight - FighterWeight;
        System.out.println(" Вычитание из большей массы меньшей " + result3 + " кг ");
        var result4 = (fighterWeight % FighterWeight);
        System.out.println(" С функцией остаток от деления ПО ПОДСКАЗКЕ В УСЛОВИИ УРОКА " + result4 + " кг " + " НО ЭТО ЯВНО НЕПРАВИЛЬНО");


    }
}