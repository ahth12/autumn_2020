package com.nc.autumn2020.lesson12;

import com.nc.autumn2020.LessonApi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

public class Annotations implements LessonApi {
    /**
     *  1. Аннотация на уровне компиляции
     *  2. Уровень Class но не попадают в RunTime
     *  3. Runtime
     *
     *
     * @param args
     */
    @Override
    public void executeSolution(String[] args) {


        DataBase dataBase = DataBaseFactory.newInstance();
        System.out.println(dataBase);


    }


}







/**
 * Override
 * Deprecated
 * SafeVarargs
 * Retention
 */