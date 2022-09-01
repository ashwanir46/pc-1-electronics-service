package com.jap;

import java.util.ArrayList;
import java.util.List;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = null;
        String[] value = electronicsItems.split(",");
        itemList = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            if (!itemList.contains(value[i])) {
                itemList.add(value[i]);
            }
        }
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return -1;
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;

        return flag;
    }


}
