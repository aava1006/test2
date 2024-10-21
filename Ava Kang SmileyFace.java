//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB - Ava Kang", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      
      window.setColor(Color.BLACK);
      window.fillOval( 300, 250, 25, 25 );
      window.setColor(Color.BLACK);
      window.fillOval( 500, 250, 25, 25 );
      
      window.setColor(Color.BLACK);
      window.fillOval(400, 290, 15, 15);
      
      
      
      window.setColor(Color.RED);
      window.fillArc(320,300,200,150,180,180);
      

		//add more code here


   }
}