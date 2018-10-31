package edu.depauw.csc232;

import java.awt.Color;

public class Square implements Image {
   
   public Square(Color color) {
      this.color = color;
   }

   @Override
   public Color colorAt(double x, double y) {
      if (x >= 0 && x <= 1 && y >= 0 && y <= 1) {
         return color;
      } else {
         return CLEAR;
      }
   }
   
   private Color color;
}
