package layered.arch.core.caching;

public class RedisCache implements Caching{
    @Override
    public void cache() {
        System.out.println("redis cache");
    }
}
