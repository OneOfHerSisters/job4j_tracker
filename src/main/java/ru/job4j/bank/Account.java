/**
 * Класс Account представляет банковский счет пользователя с реквизитами и балансом.
 * Используется для хранения информации о счетах в банковском приложении.
 * @author Polina
 * @version 1.0
 */
package ru.job4j.bank;

import java.util.Objects;

public class Account {
    /**
     * Реквизиты счета (уникальный идентификатор счета).
     */
    private String requisite;
    /**
     * Баланс счета.
     */
    private double balance;

    /**
     * Конструктор для создания счета с заданными реквизитами и балансом.
     * @param requisite реквизиты счета
     * @param balance начальный баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвращает реквизиты счета.
     * @return строка с реквизитами счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает новые реквизиты счета.
     * @param requisite новые реквизиты счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Возвращает текущий баланс счета.
     * @return баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Устанавливает новый баланс счета.
     * @param balance новый баланс счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Сравнивает данный счет с другим объектом на равенство по реквизитам счета.
     * @param o объект для сравнения
     * @return true, если реквизиты совпадают, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Возвращает хеш-код счета на основе реквизитов.
     * @return хеш-код счета
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}