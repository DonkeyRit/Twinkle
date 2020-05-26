package com.github.donkeyrit.javaapp.panels.aboutcar.listeners;

import com.github.donkeyrit.javaapp.EntryPoint;
import com.github.donkeyrit.javaapp.panels.aboutcar.AboutCarPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReloadButtonListener implements ActionListener {

    private EntryPoint point; //TODO Remove this reference

    public ReloadButtonListener(EntryPoint point) {
        this.point = point;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton jButton = (JButton) e.getSource();
        AboutCarPanel oldPanel = (AboutCarPanel) jButton.getParent();

        AboutCarPanel newPanel = new AboutCarPanel(point, oldPanel.getCar());
        newPanel.setFilter(oldPanel.getFilter());
        newPanel.setNumPage(oldPanel.getNumPage());
        newPanel.setStartBut(oldPanel.getStartBut());
        newPanel.setBounds(250,100,605,550);

        point.panel.remove(oldPanel);
        point.panel.add(newPanel);
        point.panel.revalidate();
        point.panel.repaint();
    }
}
