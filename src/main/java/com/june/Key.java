package com.june;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @authoer:June_Woo
 * @createDate:2022/12/2 11:01
 * @description:
 */
public class Key extends JFrame implements KeyListener {

    public Key(){
        //设置界面大小
        this.setSize(200,200);

        //设置标题
        this.setTitle("ikun 1.0");

        //设置永远置顶
        this.setAlwaysOnTop(true);

        //设置程序随着窗口关闭而结束运行
        this.setDefaultCloseOperation(3);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //取消默认放置位置
        this.setLayout(null);

        //绑定键盘监听事件
        this.addKeyListener(this);

        this.setVisible(true);

        this.back();

    }

public void back() {
    File file = new File("src/main/resources/cai.jpg");
    BufferedImage bufferedImage = null;
    try {
        bufferedImage = ImageIO.read(file);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    ImageIcon imageIcon = new ImageIcon(bufferedImage);
    this.setLayout(new FlowLayout());
    JLabel jLabel = new JLabel();
    jLabel.setIcon(imageIcon);
    this.add(jLabel);
    this.setVisible(true);
}



    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'j') {
            new Audio("j.mp3").start();
        }
        if (e.getKeyChar() == 'n') {
            new Audio("n.mp3").start();
        }
        if (e.getKeyChar() == 't') {
            new Audio("t.mp3").start();
        }
        if (e.getKeyChar() == 'm') {
            new Audio("m.mp3").start();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

