package org.launchcode;

import org.launchcode.MenuItem;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d,ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public Date getLastUpdated(){
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void printMenu(MenuItem item){
        for(int i = 0; i< items.size();i++){
            System.out.println(items.get(i).getDescription());
            System.out.println(items.get(i).getPrice());
        }
    }

}

