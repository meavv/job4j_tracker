package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
    if (!users.containsKey(user)) {
        users.put(user, new ArrayList<Account>());
    }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List <Account> accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                rsl = key;
                break;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        if (findByRequisite(srcPassport, srcRequisite) == null || findByPassport(srcPassport) == null) {
            return false;
        }
        if (amount > findByRequisite(srcPassport,srcRequisite).getBalance()) {
            return false;
        }
        findByRequisite(srcPassport,srcRequisite).setBalance(findByRequisite
                (srcPassport,srcRequisite).getBalance() - amount);
        findByRequisite(destPassport,destRequisite).setBalance(findByRequisite
                (destPassport,destRequisite).getBalance() + amount);
        return true;
    }
}