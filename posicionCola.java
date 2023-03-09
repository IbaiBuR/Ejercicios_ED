ipublic int posicionCola(Cola cola, int dato)
{
  int resultado = -1;
  int N_Elementos = cola.getNumElementos();

  for(int i = 0; i < N_Elementos; i++)
  {
     int elemento = cola.desencolar();
     cola.encolar(elemento);

     if(elemento == dato)
     {
	resultado = i;
     }
  }

  return resultado;
}
