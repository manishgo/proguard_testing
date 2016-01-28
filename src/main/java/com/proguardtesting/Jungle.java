package com.proguardtesting;

import com.proguardtesting.annotations.MyAnnotation;

import java.util.ArrayList;
import java.util.List;

public class Jungle {
  @MyAnnotation
  private List<Lion> lions = new ArrayList<Lion>();

  public List<Lion> getLions() {
    return lions;
  }
}
