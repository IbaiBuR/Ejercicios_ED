public Alumno filtrarAlumno(ColaAlumno cola)
{ 
  Alumno resultado = null;
  int N_Elementos = cola.getNumElementos();

  for(int i = 0; i < N_Elementos; i++)
  {
     Alumno elemAlumno = cola.desencolar();

     if(elemAlumno.getCalificacion() >= 5)
     {
        cola.encolar(elemAlumno);
	if(resultado == null || elemAlumno.getCalificacion() > resultado.getCalificacion())
	{
		resultado = elemAlumno;
	}
     }
  }

  return resultado;
}
