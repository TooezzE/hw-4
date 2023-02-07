import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if(age>=18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека меньше " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 23;
        if(temperature>5){
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 100;
        if(speed<=60){
            System.out.println("Если скорость меньше 60, то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость больше 60, то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 8;
        if(age >= 2 && age<=6){
            System.out.println("Если возраст человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
        }
        else if(age >= 7 && age <= 18 ){
            System.out.println("Если возраст человека равен от 7 до 18 лет, то ему нужно ходить в школу");
        }
        else if (age >= 18 && age <= 24){
            System.out.println("Если возраст человека равен от 18 до 24 лет, то ему нужно ходить в университет");
        }
        else if (age > 24){
            System.out.println("Если возраст человека больше 24 лет, то ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 9;
        if(age < 5){
            System.out.println("Если возраст ребенка равен меньше 5 лет, то ему нельзя кататься на аттаркционе");
        }
        if(age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен от 5 до 14 лет, то ему можно кататься на аттракционе только в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка больше 14 лет, то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int trainCarPlaces = 102;
        int sitTrainCarPlaces = 60;
        if(trainCarPlaces < 102 && sitTrainCarPlaces < 60){
            System.out.println("В вагоне есть место, в том числе и сидячее");
        }
        if (trainCarPlaces < 102 && sitTrainCarPlaces >= 60){
            System.out.println("В вагоне остались только стоячие места");
        }
        else {
            System.out.println("Вагон уже полностью забит");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 45;
        int two = 12;
        int three = 58;
        if(one > two && one > three){
            System.out.println("Число " + one + " самое большое");
        }
        if(two > one && two > three){
            System.out.println("Число " + two + " самое большое");
        }
        else{
            System.out.println("Число " + three + " самое большое");
        }
    }
}