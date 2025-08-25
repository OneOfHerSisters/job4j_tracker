package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Сервис для управления пользователями и счетами в банке.
 * @author Polina
 * @version 1.0
 */
public class BankService {
    /**
     * Карта пользователей и их счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя в систему.
     *
     * @param user пользователь для добавления
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Удаляет пользователя из системы по номеру паспорта.
     *
     * @param passport паспорт пользователя для удаления
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Добавляет новый счет к пользователю с указанным паспортом.
     *
     * @param passport паспорт пользователя
     * @param account  счет для добавления
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Ищет пользователя по номеру паспорта.
     *
     * @param passport паспорт пользователя
     * @return найденный пользователь или null, если не найден
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Ищет счет пользователя по паспорту и реквизитам счета.
     *
     * @param passport  паспорт пользователя
     * @param requisite реквизиты счета
     * @return найденный счет или null, если не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User key = findByPassport(passport);
        if (key != null) {
            for (Account account : users.get(key)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Выполняет перевод денег между счетами двух пользователей.
     *
     * @param sourcePassport      паспорт отправителя
     * @param sourceRequisite     реквизиты счета отправителя
     * @param destinationPassport паспорт получателя
     * @param destinationRequisite реквизиты счета получателя
     * @param amount             сумма перевода
     * @return true, если перевод выполнен успешно, иначе false
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null
                && sourceAccount.getBalance() >= amount
                && destinationAccount != null) {
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);
            return true;
        }
        return false;
    }

    /**
     * Возвращает список счетов пользователя.
     *
     * @param user пользователь
     * @return список счетов пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}