package Lab23.Ex4;

public class NoSuchFileException extends Throwable{
    private String message;

    public NoSuchFileException(String directory) {
        message = "Файл \"" + directory + "\" не найден";
    }

    public String getMessage() {
        return message;
    }
}
