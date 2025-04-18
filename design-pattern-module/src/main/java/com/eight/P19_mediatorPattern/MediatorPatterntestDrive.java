package com.eight.P19_mediatorPattern;

import com.eight.P19_mediatorPattern.components.*;
import com.eight.P19_mediatorPattern.mediators.Editor;
import com.eight.P19_mediatorPattern.mediators.Mediator;

import javax.swing.*;

public class MediatorPatterntestDrive {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
