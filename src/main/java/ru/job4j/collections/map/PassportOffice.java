package ru.job4j.collections.map;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rst = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rst = true;
        }
        return rst;
    }

    public Citizen get(String passport) {
        Citizen value = citizens.get(passport);
        return value;
    }
}