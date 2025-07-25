package ru.job4j.enumeration;

public class CarService {

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);

        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
            switch (s) {
                case ACCEPTED:
                    System.out.println("Статус: Автомобиль принят на СТО");
                    break;
                case IN_WORK:
                    System.out.println("Статус: Автомобиль в работе");
                    break;
                case WAITING:
                    System.out.println("Статус: Автомобиль ожидает запчасти");
                    break;
                case FINISHED:
                    System.out.println("Статус: Все работы завершены");
                    break;
                default:
                    System.out.println("Статус неизвестен");
                    break;
            }

        }
    }
}