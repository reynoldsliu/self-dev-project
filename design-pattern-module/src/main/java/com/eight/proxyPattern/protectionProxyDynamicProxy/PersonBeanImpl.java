package com.eight.proxyPattern.protectionProxyDynamicProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonBeanImpl implements PersonBean {

    private static final Logger log = LoggerFactory.getLogger(PersonBeanImpl.class);
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public PersonBeanImpl(String name, String gender, String interests, int rating, int ratingCount){
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getInterests() {
        return this.interests;
    }

    @Override
    public int getHotOrNotRating() {
        System.out.println(this.ratingCount);
        if (this.ratingCount <= 0) {
            return 0;
        }
        return (this.rating / this.ratingCount);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        this.ratingCount++;
    }
}
