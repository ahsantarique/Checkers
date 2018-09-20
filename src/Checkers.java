import java.awt.EventQueue;

import javax.swing.JFrame;

public class Checkers extends JFrame
{
   Board board;
   public Checkers(String title)
   {
      super(title);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	  
      
      Board board = new Board();
      for(int r=1; r <=3; r++){
    	  for(int c=1; c<=8; c+=2){
    		  board.add(new Checker(CheckerType.BLACK_REGULAR), r, c+1-(r%2));
    	  }
      }
      for(int r=6; r <=8; r++){
    	  for(int c=1; c<=8; c+=2){
    		  board.add(new Checker(CheckerType.RED_REGULAR), r, c+(r%2));
    	  }
      }
      setContentPane(board);

      pack();
      setVisible(true);
      
      
      


   }

   public static void main(String[] args)
   {
      Runnable r = new Runnable()
                   {
                      @Override
                      public void run()
                      {
                         new Checkers("Checkers");
                      }
                   };
      EventQueue.invokeLater(r);
   }
}