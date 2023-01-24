package layered.arch.repository.abstracts;

import layered.arch.entities.concrete.Book;

import java.util.List;
// Circular Dependency
// Entities => Repository, Service
// Core => Entities,Repository,Service,....
// Core paketi projedeki diğer hiç bir paketi enjekte etmez..
public interface BookRepository {
    List<Book> getAll();
}
