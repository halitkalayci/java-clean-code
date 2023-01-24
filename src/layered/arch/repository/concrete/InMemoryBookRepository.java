package layered.arch.repository.concrete;

import layered.arch.entities.concrete.Book;
import layered.arch.repository.abstracts.BookRepository;

import java.util.List;

public class InMemoryBookRepository implements BookRepository {

    @Override
    public List<Book> getAll() {
        return null;
    }
}
