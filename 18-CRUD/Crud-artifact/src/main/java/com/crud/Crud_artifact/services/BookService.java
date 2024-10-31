package com.crud.Crud_artifact.services;

import com.crud.Crud_artifact.model.Book;
import com.crud.Crud_artifact.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    /**
     * Obtiene todos los libros del repositorio.
     *
     * @return una lista de libros.
     */
    public List<Book> getAllBooks() {
        try {
            return repository.getAllBooks();  // Asegúrate de que este método esté implementado correctamente
        } catch (Exception e) {
            // Manejo de excepciones, puedes lanzar una excepción personalizada o registrar el error
            throw new RuntimeException("Error al obtener los libros: " + e.getMessage(), e);
        }
    }

    // Aquí podrías agregar más métodos como agregar, actualizar o eliminar libros
}
