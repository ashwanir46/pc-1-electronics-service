package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
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

        int index = itemList.indexOf(searchItem);
        return index;
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        boolean flag = false;
        Iterator iterator = itemList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(removeItem)) {
                itemList.remove(removeItem);
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list = addElectronicsItemsToList("TV,Computer,Refrigerator,TV");
        System.out.println("list = " + list);

        int index = searchElectronicItemInList(list, "Computer");
        System.out.println("index = " + index);

        boolean result = removeElectronicsItemFromList(list, "Computer");
        System.out.println("result = " + result);
    }
}
