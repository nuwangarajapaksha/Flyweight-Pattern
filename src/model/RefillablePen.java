/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;

/**
 *
 * @author NUWAA
 */
public class RefillablePen implements Pen {

    private Color color;
    private final String brand = "TEN";
    private final double length = 14;
    private final double size = 0.8;

    public RefillablePen() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String write() {
        if (color == null) {
            return "<html>"
                    + "<b>Pen : " + this + "</b><br>"
                    + "Color : No Color <br>"
                    + "Brand : " + brand + "<br>"
                    + "Length : " + length + " cm<br>"
                    + "Size : " + size + " mm<br>"
                    + "</html>";
        }
        return "<html>"
                + "<b> Pen : " + this + "</b><br>"
                + "Color : " + getColorString(color) + "<br>"
                + "Brand : " + brand + "<br>"
                + "Length : " + length + " cm<br>"
                + "Size : " + size + " mm<br>"
                + "</html>";
    }

    private String getColorString(Color color) {
        if (color.getRed() == 255 && color.getGreen() == 0 && color.getBlue() == 0) {
            return "Red";
        } else if (color.getRed() == 0 && color.getGreen() == 128 && color.getBlue() == 0) {
            return "Green";
        } else if (color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 0) {
            return "Black";
        }
        return "Not Defined";
    }

}
