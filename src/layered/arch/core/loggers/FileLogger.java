package layered.arch.core.loggers;

public class FileLogger implements Logger{
    @Override
    public void log() {
        System.out.println("log file");
    }
}
