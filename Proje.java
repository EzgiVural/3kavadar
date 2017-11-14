/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Proje extends JFrame {
private JTextField txtEnter = new JTextField();
private JTextArea txtChat = new JTextArea();
public Proje() {
ArrayList<String> exceptionMessageList = new ArrayList<String>(
Arrays.asList("Maalesef anlasilmadi...", "Lutfen tekrarlar misiniz",
"???"));
ArrayList<String> greetingMessageList = new ArrayList<String>(
Arrays.asList("ooo selammm..", "merhabalar", "mrb"));
// urun olusturma
CellPhone cellPhone = new CellPhone(0,"Asus", "Zenfone 3", 16, "3GB",1400);
ArrayList<CellPhone> cellPhoneList = new ArrayList<CellPhone>();
//cellPhoneList.add(cellPhone);
//CellPhone(int pid, String brand, String model, int cameraSize, String ramSize, int price)
cellPhoneList.add(new CellPhone(0,"Huawei", "P9 Lite", 12,"3GB",1200));
cellPhoneList.add(new CellPhone(0,"Reeder", "P12", 13,"4GB",1700));
cellPhoneList.add(new CellPhone(0,"Apple", "Iphone 7", 64,"2GB",3000));
cellPhoneList.add(new CellPhone(0,"Sony", "XA1 Ultra", 23,"4GB",1900));
cellPhoneList.add(new CellPhone(0,"Apple", "Iphone X", 12,"3GB",6100));
cellPhoneList.add(new CellPhone(0,"Samsung", "Galaxy S8", 12,"4GB",3700));

//Television(int pid, String brand, String model, int size, String resolution, int price)
//Television television=new Television(0,"Samsung","UE 43MU7000",43,"3840 x 2160",2500);
ArrayList<Television> televisionList = new ArrayList<Television>();
televisionList.add(new Television(0,"Samsung","UE 43MU7000",109,"3840 x 2160",2500));
televisionList.add(new Television(0,"Vestel","49UD9300",124,"3840x2160",2800));
televisionList.add(new Television(0,"Vestel","UE 43MU7000",102,"1920x1080",1400));
televisionList.add(new Television(0,"LG","70UJ675V",178,"3840x2160",9000));
televisionList.add(new Television(0,"Philips","65PUS6262",164,"3840x2160",5500));

//System.out.println("CellPhone:" + cellPhoneList.get(0)); LİSTEDEKİ ÜRÜN ÖZELLİKLERİNİ ŞEYAPIYOR. GET(SIRA)

ArrayList<Computer> computerList = new ArrayList<Computer>();
//Computer(int pid, String brand, String model, float processor, String ramSize, int price)
computerList.add(new Computer(0,"Asus","GL553VD", (float) 2.8,"16GB",4890));
computerList.add(new Computer(0,"Dell","VOSTRO 14", (float) 2.5,"8GB",3430));
computerList.add(new Computer(0,"MSI","GF62", (float) 2.8,"8GB",5124));
computerList.add(new Computer(0,"Lenovo","LEGION Y520", (float) 2.8,"16GB",5000));
computerList.add(new Computer(0,"Monster","SEMRUK S7", (float) 4.2,"64GB",50000));
//

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(600, 600);
this.setVisible(true);
this.setResizable(false);
this.setLayout(null);
this.setTitle("Java Bot Example");
txtEnter.setLocation(5, 540);

txtEnter.setSize(590, 30);
txtEnter.requestFocusInWindow();
txtChat.setLocation(20, 5);
txtChat.setSize(560, 510);
txtChat.setEditable(false);
// elemanlari JFrame'e ekle
this.add(txtEnter);
this.add(txtChat);
// etkilesim
txtEnter.addActionListener(new ActionListener() {
@Override
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
txtChat.append("AI: " + "3: Bilgisayar" + "\n");
} else if (uText.equals("1")) {
txtChat.append("AI: " + "Cep Telefonu secildi..." + "\n");
txtChat.append("AI: " + "Listedeki Telefonlar:" + "\n");
for (CellPhone cellP : cellPhoneList) {
txtChat.append("AI: " +cellP.getpBrand()+" "+cellP.getpModel() + "\n");
}
} else if (uText.equals("2")) {
txtChat.append("AI: " + "Televizyon secildi..." + "\n");
txtChat.append("AI: " + "Listedeki Televizyonlar:" + "\n");
for(Television TV: televisionList)
{
    txtChat.append("AI: "+TV.getpBrand()+" "+TV.getpModel()+"\n");
}
}else if (uText.equals("3")) {
txtChat.append("AI: " + "Bilgisayar secildi..." + "\n");
txtChat.append("AI: " + "Listedeki Bilgisayarlar:" + "\n");
for(Computer Com: computerList)
{
    txtChat.append("AI: "+Com.getpBrand()+" "+Com.getpModel()+"\n");
}

} else {
decideRandom(exceptionMessageList);
}
}

});
}
private void decideRandom(ArrayList<String> messageList) {
int decider = (int) (Math.random() * messageList.size());
txtChat.append("AI: " + messageList.get(decider) + "\n");
}
public static void main(String[] args) {
    
new Proje();
}
}

