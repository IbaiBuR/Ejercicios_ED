public void escribirCola(Cola cola)
{
  int N_Elementos = cola.getNumElementos();
  System.out.println("Principio");

  for(int i = 0; i < N_Elementos; i++)
  {
     int elemento = cola.desencolar();
     System.out.print(elemento + ' ');
     cola.encolar(elemento);
     System.out.println();
  }

  System.out.println("Final");
}
