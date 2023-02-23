public int mayorElemento (Pila pila)
{
	int resultado;
	
	if(!(pila.vacia())
	{
		resultado = -1;
	}
	
	else
	{
		int elemento = pila.desapilar();
		resultado = this.mayorElemento(pila);
		
		if(elemento > resultado)
		{
			resultado = elemento;
		}
	}
	
	
	return resultado;
}