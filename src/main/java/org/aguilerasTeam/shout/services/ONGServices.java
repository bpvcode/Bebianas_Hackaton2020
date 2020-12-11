package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.ONG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ONGServices {

    private List<ONG> ongList = new LinkedList<>();

    public void addNewOng(String name, String email){
        ONG ong = new ONG(name, email);
        ongList.add(ong);
    }

    public void addNewOng(ONG ong){
        ongList.add(ong);
    }

    public List<ONG> getOngList() {
        return ongList;
    }

    public void setOngList(List<ONG> ongList) {
        this.ongList = ongList;
    }

    public Integer getSetOng(Integer id) {
        return ongList.get(id).getAccount();
    }
}
