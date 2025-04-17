package com.eight.P12_proxyPattern.protectionProxyDynamicProxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MatchMakingTestDrive {
    // Database instance variable
    private PersonBean[] database;

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        // Create some sample persons for the database
        database = new PersonBean[5];
        database[0] = new PersonBeanImpl("Joe Javabean",  "M","bowling, Go", 70, 10);
        database[1] = new PersonBeanImpl("Kelly Klosure",  "F","swimming, reading", 80, 10);
        database[2] = new PersonBeanImpl("Mike Pattern",  "M","hiking, cooking", 90, 10);
        database[3] = new PersonBeanImpl("Sandy Beach",  "F","surfing, yoga", 80, 10);
        database[4] = new PersonBeanImpl("Tom Singleton",  "M","programming, gaming", 60, 10);
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(1);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getPersonFromDatabase(String name) {
        for (PersonBean person : database) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }


    // 取得代理
    private PersonBean getOwnerProxy(PersonBean personBean){
        System.out.println("Person class: " + personBean.getClass().getName());
        System.out.println("Interfaces: " + Arrays.toString(personBean.getClass().getInterfaces()));

        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    private PersonBean getNonOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }
}
