import framework.FileOperationsKihonBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperationsKihon extends FileOperationsKihonBase {


    @Override
    public String getContentsOfThisFile(Path pathOfFile) throws IOException {
        return Files.readString(pathOfFile);
    }

    @Override
    public Path writeContentsToThisFile(Path pathOfFile, String contents) throws IOException {
        return Files.writeString(pathOfFile, contents);

        // try (FileWriter writer = new FileWriter(String.valueOf(pathOfFile))){
         //   writer.append(contents);
        }
    }
