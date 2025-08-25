package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель данных пользователя банка.
 * Хранит паспорт и имя пользователя.
 * @author Polina
 * @version 1.0
 */
public class User {
    /**
     * Паспорт пользователя, уникальный идентификатор.
     */
    private String passport;
    /**
     * Имя пользователя.
     */
    private String username;

    /**
     * Конструктор для создания пользователя.
     *
     * @param passport паспорт пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает паспорт пользователя.
     *
     * @return паспорт
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Устанавливает паспорт пользователя.
     *
     * @param passport новый паспорт
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return имя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает имя пользователя.
     *
     * @param username новое имя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Сравнивает пользователей по паспорту.
     *
     * @param o объект для сравнения
     * @return true, если паспорта совпадают
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Вычисляет хэшкод на основе паспорта.
     *
     * @return хэшкод
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}