/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author Melike
 */
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;

import java.util.Arrays;

import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;

import javax.swing.JTextField;

import javax.swing.ScrollPaneConstants;

public class BotHandler extends JFrame {

    private JTextField txtEnter = new JTextField();

    private JTextArea txtChat = new JTextArea();

    public BotHandler() {

        final ArrayList<String> exceptionMessageList = new ArrayList<String>(
                Arrays.asList("maalesef anlasilmadi...", "lutfen tekrarlar misin", "???"));

        final ArrayList<String> greetingMessageList = new ArrayList<String>(
                Arrays.asList("ooo selammm..", "merhabalar", "mrb"));

        // urun olusturma
        CellPhone cellPhone = new CellPhone(1, "Asus", "Zenphone 3", 16, "3GB",1400);

        final ArrayList<CellPhone> cellPhoneList = new ArrayList<CellPhone>();

        cellPhoneList.add(cellPhone);

        cellPhoneList.add(new CellPhone(2, "Apple", "Iphone 7", 64, "2GB",3000));

        System.out.println("CellPhone:" + cellPhoneList.get(0));

        JScrollPane scrollPane = new JScrollPane(txtChat);

        scrollPane.setBounds(20, 5, 400, 400);

        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        this.setSize(600, 600);
        txtEnter.setSize(590, 30);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Java Bot Example");
        txtEnter.setLocation(5, 540);
        txtEnter.requestFocusInWindow();
        txtChat.setLocation(20, 5);
        txtChat.setSize(560, 510);
        txtChat.setEditable(false);

        // elemanlari JFrame'e ekle
        this.add(txtEnter);

        this.setVisible(true);

        // this.setResizable(false);{
        this.setLayout(new FlowLayout());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Java Bot Example");

        this.add(scrollPane);

        txtEnter.setLocation(5, 540);

        txtEnter.setSize(590, 30);

        // txtEnter.requestFocusInWindow();
        txtChat.setLocation(20, 5);

        txtChat.setSize(400, 400);

        txtChat.setEditable(false);

        // etkilesim
        txtEnter.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String uText = txtEnter.getText();

                txtChat.append("You: " + uText + "\n");

                txtEnter.setText("");

                if (uText.contains("selam")) {

                    // txtChat.append("AI:" + "ooo selamlar" + "\n");
                    decideRandom(greetingMessageList);

                } else if (uText.contains("urun sececegim")) {

                    // urun secimi
                    txtChat.append("AI: " + "Lutfen urunu seciniz:" + "\n");

                    txtChat.append("AI: " + "1: Cep Telefonu" + "\n");

                    txtChat.append("AI: " + "2: Televizyon" + "\n");

                } else if (uText.equals("1")) {

                    txtChat.append("AI: " + "Cep Telefonu secildi..." + "\n");

                    txtChat.append("AI: " + "Listedeki Telefonlar:" + "\n");

                    for (CellPhone cellP : cellPhoneList) {

                        txtChat.append("AI: " + cellP.getpModel() + "\n");

                    }
                    /*   if(uText.equals("Zen"))                                           
                                        {
                                            CellPhone phone 
                                            txtChat.append("AI: " +  + "\n");
                                        }*/

                } else if (uText.equals("2")) {

                    txtChat.append("AI: " + "Televizyon secildi..." + "\n");

                } else {

                    decideRandom(exceptionMessageList);

                }

            }

        });

        // elemanlari JFrame'e ekle
        this.add(txtEnter);

        this.add(txtChat);

    }

    private void decideRandom(ArrayList<String> messageList) {

        int decider = (int) (Math.random() * messageList.size());

        txtChat.append("AI: " + messageList.get(decider) + "\n");

    }

    public static void main(String[] args) {

        new BotHandler();

    }

}
