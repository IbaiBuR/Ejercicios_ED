public void invertirCola(Cola cola)
{
   if(!cola.vacia())
   {
      int elemento = cola.desencolar();
      this.invertirCola(cola);
      cola.encolar(elemento);
   }
}
