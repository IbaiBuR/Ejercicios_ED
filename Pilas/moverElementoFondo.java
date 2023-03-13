public void moverElementoFondo (Pila pila)
{
	if(!(pila.vacia())
	{
		int fondo = this.quitarFondo(pila);
		pila.apilar(fondo);
	}
}

private int quitarFondo(Pila pila)
{
	int fondo;
	int elemento = pila.desapilar();
	
	if(pila.vacia())
	{
		fondo = elemento;
	}
	else
	{
		fondo = this.quitarFondo(pila);
		pila.apilar(elemento);
	}	
    
    return fondo;	
	
}