package com.vikas.bar;

public class Wall
{
   private Double width;
   private Double height;
   private Double length;

   public Wall() {
   }

   public Wall( double width, double height) {
      this.width = width;
      this.height = height;
   }

   public double getWidth() {
      return width;

   }
   public double getHeight() {
      return height;
   }
   public void setWidth(double width) {
      if(width < 0){
         this.width = (double) 0;
      }

      else{
         this.width = width;

      }
   }
   public void setheight(double height) {
      if(height < 0){
         this.height = (double) 0;
      }

      else{
         this.height = height;

      }
   }
   public double getArea() {
      return width * height;
   }

   public Double getLength()
   {
      return this.height;
   }

   public void setLength( Double length )
   {
      this.length = this.height;
   }
}

