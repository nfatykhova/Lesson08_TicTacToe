package ru.levelp;

/**
 * Created by natalie on 18.03.16.
 */

import ru.levelp.ui.GUI; // ui.*

public class Main {

    public static void main(String[] args) {

        // only start

        new GUI().start();
    }
}
/*
Домашнее задание
1) Добавить меню Help в bar, а в Help -> About
    About ->
        окошко с контактными данными разработчика
2) Обработчики для меню и кнопок New game и Quit
3) Сделать View settings JMenu -> Dark, Default (с галочками)
4) Проверка победителя. Если кто-то победил, то выводим окно "Х won".
    При нажатии ok в этом окне, автоматически new game.
 */