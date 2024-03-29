package rga.cloud.storage.common;

public class FileRequest extends AbstractMessage {

    private String fileName;

    public FileRequest(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
