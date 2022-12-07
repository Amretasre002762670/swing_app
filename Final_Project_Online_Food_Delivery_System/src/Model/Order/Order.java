/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Order;

import Model.Menu.Menu;
import Model.WorkQueue.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author amretasrerengarajan
 */
public class Order {
    private long order_id;
    private ArrayList<Menu> selectedMenu;
    private Time timePlaced;
    private Date datePlaced;

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public ArrayList<Menu> getSelectedMenu() {
        return selectedMenu;
    }

    public void setSelectedMenu(ArrayList<Menu> selectedMenu) {
        this.selectedMenu = selectedMenu;
    }

    public Time getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(Time timePlaced) {
        this.timePlaced = timePlaced;
    }

    public Date getDatePlaced() {
        return datePlaced;
    }

    public void setDatePlaced(Date datePlaced) {
        this.datePlaced = datePlaced;
    }
    
}
