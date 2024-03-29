package Lab23.Ex4;

import Lab23.Ex1.Converter;

import java.io.File;
import java.util.ArrayList;

public class MyDirectory {
    private String path;
    private ArrayList<String> directoryContent;

    public MyDirectory(String path) throws NoSuchFileException {
        if (!new File(path).exists())
            throw new NoSuchFileException(path);

        this.path = path;
        directoryContent = new Converter().fromArrayToList(new File(path).list());
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path) throws NoSuchFileException {
        if (!new File(path).exists())
            throw new NoSuchFileException(path);

        this.path = path;
        directoryContent = new Converter().fromArrayToList(new File(path).list());
    }

    public ArrayList<String> getDirectoryContent() {
        return directoryContent;
    }
}
