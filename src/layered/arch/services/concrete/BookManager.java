package layered.arch.services.concrete;

import layered.arch.core.caching.Caching;
import layered.arch.core.caching.InMemoryCache;
import layered.arch.core.caching.RedisCache;
import layered.arch.core.loggers.ConsoleLogger;
import layered.arch.core.loggers.DatabaseLogger;
import layered.arch.core.loggers.FileLogger;
import layered.arch.core.loggers.Logger;
import layered.arch.services.abstracts.BookService;

public class BookManager implements BookService {
    // Veriye eriş, gerekli validasyonları yap, iş kurallarını uygula..

    // IF Suistimali
    private Logger logger;
    private Caching caching;

    public BookManager(Logger _logger, Caching _caching){
        logger = _logger;
        caching = _caching;
    }


    @Override
    public void add() {
        logger.log();
        caching.cache();
        System.out.println("Book Manager Add");
    }
}
