package com.xworkz.dtorunner;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.dto.ProductDTO;

public class Runner 
{
public static void main(String[] args) 
{
	
	ProductDTO prdto =new ProductDTO(1, "TV", "tvsoft", 25000);
	ProductDTO prdto1 =new ProductDTO(1, "Mobile", "mobisoft", 15000.00);
	ProductDTO prdto2 =new ProductDTO(1, "Earbuds", "esoft", 5000.00);
	ProductDTO prdto3=new ProductDTO(1, "Fan", "crompton", 30000.00);
	ProductDTO prdto4 =new ProductDTO(1, "Bulb", "lighters", 15.00);
	ProductDTO prdto5 =new ProductDTO(1, "Book", "classmate", 30.00);
	ProductDTO prdto6=new ProductDTO(1, "Pensil", "doms", 5.00);
	ProductDTO prdto7 =new ProductDTO(1, "Eraser", "Errors", 5.00);
	ProductDTO prdto8 =new ProductDTO(1, "Watch", "Titan", 50000.00);
	ProductDTO prdto9 =new ProductDTO(1, "Slipper", "Paragon", 200.00);

 Collection<ProductDTO> c = new LinkedList<ProductDTO>();
  c.add(prdto);
  c.add(prdto1);
  c.add(prdto2);
  c.add(prdto3);
  c.add(prdto4);
  c.add(prdto5);
  c.add(prdto6);
  c.add(prdto7);
  c.add(prdto8);
  c.add(prdto9);
  
  c.forEach((ref)->System.out.println(ref));;
  
 
}
}
