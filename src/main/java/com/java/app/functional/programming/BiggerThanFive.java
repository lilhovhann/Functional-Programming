/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.app.functional.programming;

import java.util.function.Predicate;

/**
 *
 * @author lilith
 */
public class BiggerThanFive implements Predicate<Integer> {

    @Override
    public boolean test(Integer value) {
       Integer five = 5;
       return value > five;
    }
    
    
}
