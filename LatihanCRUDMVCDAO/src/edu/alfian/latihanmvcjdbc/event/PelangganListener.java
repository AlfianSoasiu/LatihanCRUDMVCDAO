/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alfian.latihanmvcjdbc.event;

import edu.alfian.latihanmvcjdbc.entity.Pelanggan;
import edu.alfian.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Acer
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
}
