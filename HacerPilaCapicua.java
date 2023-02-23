public void hacerPilaCapicua (Pila pila)
{
	if(!(pila.vacia())
	{
		int elemento = pila.desapilar();
	    this.hacerPilaCapicua(pila);
		this.ponerElementoEnFondo(pila,elemento);
		pila.apilar(elemento);
	}		
}

private void ponerElementoEnFondo(Pila pila, int elemento)
{
	if(!(pila.vacia())
	{
		int dato = pilar.desapilar();
		this.ponerElementoEnFondo(pila, elemento);
		pila.apilar(dato);
	}
	else
	{
		pila.apilar(elemento);
	}
}