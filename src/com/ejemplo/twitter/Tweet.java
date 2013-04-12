package com.ejemplo.twitter;

import java.util.ArrayList;

public class Tweet {

	private int id;
	private Usuario autor;
	private String fecha;
	private String texto;
	private ArrayList<Usuario> listaRt; // Con .size tendremos el total y dentro tenemos la lista users.
	private ArrayList<Usuario> listaFv;
}
