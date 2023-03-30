package com.kreitek.files;

import java.util.List;

public interface FileSystemItem {
    String getName();
    void setName(String name);
    Directory getParent();
    void setParent(Directory directory);
    String getFullPath();
    int getSize();
}
