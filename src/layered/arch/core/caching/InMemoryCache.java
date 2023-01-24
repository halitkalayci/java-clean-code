package layered.arch.core.caching;

public class InMemoryCache implements Caching{
    @Override
    public void cache() {
        System.out.println("InMemory Cache");
    }
}
