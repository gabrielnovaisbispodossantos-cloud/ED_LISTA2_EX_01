package controller;

public class metodos {
   public metodos () {
	   super();
   }
   
   public int multiplicar(int a, int b)
   {
    if(b == 0)
    {
     return 0;
    }
    else
    {
     return a + multiplicar(a, b - 1);
    }
   }
   
}
