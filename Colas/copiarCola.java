public Cola copiarCola(Cola cola)
{
  int N_Elementos = cola.getNumElementos();
  Cola aux = new Cola();

  for(int i = 0; i < N_Elementos; i++)
  {
     int elemento = cola.desencolar();
     cola.encolar(elemento);
     aux.encolar(elemento);
  }

  return aux;
}
