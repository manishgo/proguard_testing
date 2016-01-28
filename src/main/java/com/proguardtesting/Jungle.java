package com.proguardtesting;

import com.proguardtesting.annotations.MyAnnotation;

import java.util.ArrayList;
import java.util.List;

public class Jungle {
  @MyAnnotation
  private List<Lion> lions = new ArrayList<Lion>();   //This line is changed by proguard to - List<Object> lions = new ArrayList<Object>();

  public List<Lion> getLions() {
    return lions;
  }
}
