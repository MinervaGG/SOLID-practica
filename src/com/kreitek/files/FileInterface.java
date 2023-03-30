package com.kreitek.files;

import java.util.List;

public interface FileInterface extends FileSystemItem {
    String getExtension();
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}