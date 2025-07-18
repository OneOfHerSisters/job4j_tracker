package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(1);
        box.music(2);
        box.music(3);
    }

    public void music(int position) {
        if (position == 1) {
            System.out.println("""
            Прилетит вдруг волшебник
            В голубом вертолёте
            И бесплатно покажет кино.
            С днём рожденья поздравит
            И, наверно, оставит
            Мне в подарок пятьсот эскимо.
            """);
        } else if (position == 2) {
            System.out.println("""
            Обязательно по дому в этот час
            Тихо-тихо ходит дрема возле нас.
            За окошком всё темнее,
            Утро ночи мудренее.
            Глазки закрывай,
            Баю-бай.
            """);
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
