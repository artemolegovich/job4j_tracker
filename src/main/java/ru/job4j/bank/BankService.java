package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской системы
 * @author Artem Lepeshkin
 * @version 1.1
 */
public class BankService {
    /**
     * Хранение данных о пользователях и их счетах реализовано
     * на базе справочника Map, ключами в котором являются пользователи,
     * а значениями - списки их счетов, собранные в коллекции ArrayList
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод описывает добавление нового пользователя в систему,
     * при этом ему автоматически создаётся пустой список счетов
     * @param user пользователь, добавляемый в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет счёт пользователю при условии существования
     * пользователя и отсутствии у него данного счета
     * @param passport номер паспорта
     * @param account счет для добавления
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
     * Метод осуществляет поиск пользователя по паспортным данным
     * @param passport паспортные данные пользователя
     * @return возвращает пользователя или null при неудачном поиске
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> passport.equals(s.getPassport()))
                .findFirst();
    }

    /**
     * Метод находит пользователя по паспорту осуществляет поиск счета
     * @param passport паспортные данные пользователя
     * @param requisite реквизиты счета
     * @return возвращает счет или null, если пользователь или счет не
     * найдены
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> account = Optional.empty();
        if (user.isPresent()) {
            account =  users.get(user.get())
                    .stream()
                    .filter(e -> requisite.equals(e.getRequisite()))
                    .findFirst();
        }
        return account;
    }

    /**
     * Метод осуществляет перевод средств со счета на счет при условии
     * существования счетов и наличии достаточной суммы на балансе
     * @param srcPassport паспортные данные отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport паспортные данные получателя
     * @param destRequisite реквизиты счета получателя
     * @param amount сумма перевода
     * @return возвращает true при успешном переводе, или false при
     * неудачном
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent()
                && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
