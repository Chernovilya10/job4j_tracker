package ru.job4j.collections.map.bankmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {       //проверяем, если есть пользователь в системе, то не добавляем его снова
            users.put(user, new ArrayList<Account>());      //создаем карту с пользователем и создаем пустой список счетов
        }
    }

    public void addAccount(String passport, Account account) {
            User findUser = findByPassport(passport);
            if (users.get(findUser).size() == 0) {
                users.get(findUser).add(account);
            } else {
                for (Account acc : users.get(findUser)) {
                    if (!acc.getRequisite().equals(account.getRequisite())) {
                        users.get(findUser).add(account);
                    } else {
                        System.out.println("Счет уже существует.");
                    }
                    break;
                }
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
        if (findUser != null) {     //Или можно обрабоать try catch
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
        if (users.get(findByPassport(srcPassport)).contains(findByRequisite(srcPassport, srcRequisite))
        || users.get(findByPassport(destPassport)).contains(findByRequisite(destPassport, destRequisite))
        || findByRequisite(srcPassport, srcRequisite).getBalance() >= amount) {
            double sentFrom = findByRequisite(srcPassport, srcRequisite).getBalance() - amount;
            double getTo = findByRequisite(destPassport, destRequisite).getBalance() + amount;
            findByRequisite(srcPassport, srcRequisite).setBalance(sentFrom);
            findByRequisite(destPassport, destRequisite).setBalance(getTo);
            rst = true;
        }
        return rst;
    }
}
