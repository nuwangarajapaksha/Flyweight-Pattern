/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author NUWAA
 */
public class PenFactory {

    public static final HashMap<String, Pen> PEN_MAP = new HashMap<String, Pen>();

    public static Pen getPen(String penType) {
        Pen pen = null;
        if (penType.equalsIgnoreCase("refillablePen")) {
            pen = (RefillablePen) PEN_MAP.get("refillablePen");
            if (pen == null) {
                pen = new RefillablePen();
                PEN_MAP.put("refillablePen", pen);
            }
        }
        return pen;
    }
}
