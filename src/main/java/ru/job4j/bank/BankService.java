package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу различных банковских сервисов
 *
 * @author Malgin Evgeniy
 * @version 1.0
 */
public class BankService {
    /**
     * Используется коллекция Мап
     * Содержит всех пользователей системы и привязанные к ним счета
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет польхователя в users
     *
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет к пользователю
     *
     * @param passport паспорт пользователя
     * @param account  счет
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователья по паспорту
     *
     * @param passport паспорт пользователя
     * @return возвращает user по паспорту
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(a -> a.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     *
     * @param passport  паспорт пользователя
     * @param requisite реквищиты пользователя
     * @return возвращает счет пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        if (findByPassport(passport).isPresent()) {
            return users.get(findByPassport(passport).get()).stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     *
     * @param srcPassport   данные паспорта пользователя с которого будет выполнятся перевод
     * @param srcRequisite  реквизиты пользователя с которого будет выполнятся перевод
     * @param destPassport  реквизиты пользователя куда будет выполнятся перевод
     * @param destRequisite данные паспорта пользователя куда будет выполнятся перевод
     * @param amount        сумма перевода
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> reqOut = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> reqIn = findByRequisite(destPassport, destRequisite);
        if (reqOut.isEmpty() || reqOut.get().getBalance() < amount || reqIn.isEmpty()) {
            return false;
        }
        reqOut.get().setBalance(reqOut.get().getBalance() - amount);
        reqIn.get().setBalance(reqIn.get().getBalance() + amount);
        return true;
    }
}