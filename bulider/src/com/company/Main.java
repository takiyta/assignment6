package com.company;

public class Main {

    public static void main(String[] args) {

        House house1 = new House.HouseBuilder("plastic","wood", "5","yes","no")
                .build();

        System.out.println(house1);



        
    }
    }

