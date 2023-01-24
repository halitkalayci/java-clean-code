package layered.arch;

import layered.arch.core.caching.InMemoryCache;
import layered.arch.core.caching.RedisCache;
import layered.arch.core.loggers.DatabaseLogger;
import layered.arch.core.loggers.FileLogger;
import layered.arch.services.abstracts.BookService;
import layered.arch.services.concrete.BookManager;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookManager(new DatabaseLogger(), new RedisCache());
        bookService.add();

        BookService bookService1 = new BookManager(new FileLogger(), new InMemoryCache());
        bookService1.add();
    }
}
