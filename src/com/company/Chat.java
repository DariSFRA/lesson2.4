package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame{
    JTextArea messagesArea;
    JTextField messageField;
    JButton sendButton;

    public Chat() {
      initChat();
    }

    private void initChat() {
        setTitle("Chat");
        setBounds(new Rectangle(300, 300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();

        JPanel basicPanel = new JPanel();
        basicPanel.setLayout(new GridLayout(1, 1));

        messagesArea = new JTextArea();
        messagesArea.setEditable(false);
        basicPanel.add(messagesArea);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));

        messageField = new JTextField();
        messageField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(messageField.getText());
            }
        });

        sendButton = new JButton("Send message");
        sendButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(messageField.getText());
            }
        });
        
    }
}
