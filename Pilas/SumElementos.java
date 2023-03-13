/* private int SumarAlFondo(Pila pila, int dato)
{
	int elemento = pila.desapilar();
	
    if(pila.vacia())
	{
        pila.apilar(elemento + dato);
	}
    else
	{
		this.SumarAlFondo(pila,dato);
		pila.apilar(elemento);
	}
} */

private void sumaEnFondo(Pila pila, int suma)
{
	if(!pila.vacia())
	{
		int elemento = pila.desapilar();
		suma += elemento;
		this.sumaEnFondo(pila,suma);
		pila.apilar(elemento);
	}
	else
	{
		pila.apilar(suma);
	}	
}	



public void SumElementos(Pila pila)
{
	this.sumaEnFondo(pila,0);
}
		
		