package com.libros.reserva.exceptions;

public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(String message) {
        super(message);
    } 

}
