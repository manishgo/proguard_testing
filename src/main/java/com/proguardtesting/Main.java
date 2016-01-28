package com.proguardtesting;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Jungle jungle = new Jungle();
    List<Lion> lions = jungle.getLions();
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.addAll(lions);
  }


}

