package layered.arch.core.loggers;

public class ConsoleLogger implements Logger{
    @Override
    public void log() {
        System.out.println("log console");
    }
}
