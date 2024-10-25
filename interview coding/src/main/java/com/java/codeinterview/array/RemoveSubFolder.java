package com.java.codeinterview.array;

import java.util.*;

public class RemoveSubFolder {

    public static void main(String[] args) {
        String [] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        List<String> result = new ArrayList<>();
        Arrays.sort(folder);
        for (String subFolder : folder) {
            if (result.isEmpty()) {
                result.add(subFolder);
            } else {
                String lastFolderAdded = result.get(result.size() - 1) + "/";
                int index = subFolder.indexOf(lastFolderAdded);
                if (index != 0) {
                    result.add(subFolder);
                }
            }
        }
        System.out.println(result);
    }
}
