public boolean estaContenido(Cola cola, int dato)
{
  int N_Elementos = cola.getNumElementos();
  int i = 0;
  boolean encontrado = false;

  while(i < N_Elementos && !encontrado)
  {
     int elemento = cola.desencolar();
     cola.encolar(elemento);

     if(elemento == dato)
     {
       encontrado = true;
     }
     else
     {
       i++;
     }
  }
}
