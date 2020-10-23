package com.nc.autumn2020.solutions.lesson3;


public class Solution1 {
    public void run(String[] args){
        Pokemon pikachu = new Pokemon.Builder("pikachu","Ash","Kanto").
                build();
        System.out.println(pikachu);
    }
}
