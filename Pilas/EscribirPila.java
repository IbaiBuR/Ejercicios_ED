private void EscribirPilaConNumeros(Pila pila, int posicion)
{
	if(!pila.vacia())
	{
		int elemento = pila.desapilar();
		System.out.println(posicion+':'+elemento);
		this.EscribirPilaConNumeros(pila,posicion+1);
		pila.apilar(elemento);
	}
}

public void EscribirPila(Pila pila)
{
	this.EscribirPilaConNumeros(pila,1);
}