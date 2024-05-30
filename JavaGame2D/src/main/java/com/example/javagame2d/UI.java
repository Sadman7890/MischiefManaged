package com.example.javagame2d;

import objects.OBJ_Key;

import java.awt.*;
import java.awt.image.BufferedImage;

public class UI {
    GamePanel gp;
    Font arial_40;
    BufferedImage keyImage;
    public boolean messageOn = false;
    public String message = "";
    public UI(GamePanel gp)
    {
        this.gp = gp;
        arial_40 = new Font("Arial",Font.PLAIN,40);
        OBJ_Key key = new OBJ_Key();
        keyImage = key.image;
    }

    public void showMessage(String text)
    {
        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D G2)
    {
        G2.setFont(arial_40);
        G2.setColor(Color.white);
        G2.drawImage(keyImage,gp.tileSize/2,gp.tileSize/2,gp.tileSize,gp.tileSize,null);
        G2.drawString(" " + gp.player.hasKey, 74, 65);

        if(messageOn == true)
        {
            G2.drawString(message,gp.tileSize/2,gp.tileSize * 5);
        }
    }


}
