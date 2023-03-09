public void separarCola(Cola cola, Pila pila)
{
   int N_Elementos = cola.getNumElementos();

   for(int i = 0; i < N_Elementos; i++)
   {
	int elemento = cola.desencolar();
	if(i % 2 == 0)
	{
	  cola.encolar(elemento);
	}
	else
	{
	  pila.apilar(elemento);
	}
   }
}
