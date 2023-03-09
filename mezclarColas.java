public Cola mezclarColas(Cola cola1, Cola cola2)
{
   Cola mezcla = new Cola();

   int N_Elementos1 = cola1.getNumElementos();
   int N_Elementos2 = cola2.getNumElementos();
   int i;

   for(i = 0; i < N_Elementos1 && i < N_Elementos2; i++)
   {
      mezcla.encolar(cola1.desencolar());
      mezcla.encolar(cola2.desencolar());
   }

   for(; i < N_Elementos1; i++)
   {
      mezcla.encolar(cola1.desencolar());
   }

   for(; i < N_Elementos2; i++)
   {
      mezcla.encolar(cola2.desencolar());
   }

   return mezcla;
}

//Opcion 2
  
   while(!cola1.vacia() && !cola2.vacia())
   { 
      mezcla.encolar(cola1.desencolar());
      mezcla.encolar(cola2.desencolar());
   }
   
   while(!cola1.vacia())
   {
      mezcla.encolar(cola1.desencolar());
   }

   while(!cola2.vacia())
   {
      mezcla.encolar(cola2.desencolar());
   }

  

   


