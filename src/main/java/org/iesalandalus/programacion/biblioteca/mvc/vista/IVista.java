package org.iesalandalus.programacion.biblioteca.mvc.vista;

import org.iesalandalus.programacion.biblioteca.mvc.controlador.Controlador;

public interface IVista {

	void setControlador(Controlador controlador);

	void comenzar();

	void terminar();

}