package layered.arch.core.loggers;

public class DatabaseLogger implements Logger{
    @Override
    public void log() {
        System.out.println("log database");
    }
}
