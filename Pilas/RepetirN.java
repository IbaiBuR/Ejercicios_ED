public void repetir_n(Pila pila, int n)
{
	if(!(pila.vacia())
	{
		int elemento = pila.desapilar();
		repetir_n(pila, n);
		
		for(int i = 0; i < n; i++)
		{
			pila.apilar(elemento);
		}
	}
}
		