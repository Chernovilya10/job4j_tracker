package ru.job4j.collections.map.bankmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());      //putIfAbsent проверяет, есть ли карта с таким ключем или нет, если нет, то вставляет переданную
    }

    public void addAccount(String passport, Account account) {
        User findUser = findByPassport(passport);
        if (users.get(findUser).size() == 0 && findUser != null) {      //если коллекция с аккаунатми пустая и мы нашли паспорт пользователя
            users.get(findUser).add(account);
        } else if (findUser != null && !users.get(findUser).contains(account)) {     //если нашли паспорт пользователя и в коллекции с аккаунатми еще нет такого аккаунта
                        users.get(findUser).add(account);
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User findUser = findByPassport(passport);
        if (findUser != null) {
            for (Account findAcc : users.get(findUser)) {
                if (findAcc.getRequisite().equals(requisite)) {
                    account = findAcc;
                    break;
                }
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rst = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
            if (srcAcc != null && destAcc != null && findByRequisite(srcPassport, srcRequisite).getBalance() >= amount) {
                double sentFrom = srcAcc.getBalance() - amount;
                double getTo = destAcc.getBalance() + amount;
                findByRequisite(srcPassport, srcRequisite).setBalance(sentFrom);
                findByRequisite(destPassport, destRequisite).setBalance(getTo);
                rst = true;
            }
        return rst;
    }
}