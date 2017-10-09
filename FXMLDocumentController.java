/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxerfxml;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;
import static sun.misc.Signal.handle;


/**
 *
 * @author Sean
 */
public class FXMLDocumentController implements Initializable  {
    ObservableList<String> comboBoxList = FXCollections.observableArrayList("Ccosta", "Alam", "Sclara", "Smateo", "Sf", "Marin", "Sonoma", "Napa", "Solono");
    //TODO: declared metric asston of textboxes and comboboxes like below. All of them do not skip any or you will want to kill yourself later
    //TODO: declare rest of comboboxes
//fxml combo boxes
    @FXML
    private ComboBox comboBox1;
    @FXML
    private ComboBox comboBox2;
    @FXML
    private ComboBox comboBox3;
    @FXML
    private ComboBox comboBox4;
    @FXML
    private ComboBox comboBox5;
    @FXML
    private ComboBox comboBox6;
    @FXML
    private ComboBox comboBox7;
    @FXML
    private ComboBox comboBox8;
    @FXML
    private ComboBox comboBox9;
    @FXML
    private ComboBox comboBox10;
    @FXML
    private ComboBox comboBox11;
    @FXML
    private ComboBox comboBox12;
    @FXML
    private ComboBox comboBox13;
    @FXML
    private ComboBox comboBox14;
    @FXML
    private ComboBox comboBox15;
    @FXML
    private ComboBox comboBox16;
    @FXML
    private ComboBox comboBox17;
    @FXML
    private ComboBox comboBox18;
    @FXML
    private ComboBox comboBox19;
    @FXML
    private ComboBox comboBox20;
    @FXML
    private ComboBox comboBox21;
    @FXML
    private ComboBox comboBox22;
    @FXML
    private ComboBox comboBox23;
    @FXML
    private ComboBox comboBox24;
    @FXML
    private ComboBox comboBox25;
    @FXML
    private ComboBox comboBox26;
    @FXML
    private ComboBox comboBox27;
    @FXML
    private ComboBox comboBox28;
    @FXML
    private ComboBox comboBox29;
    @FXML
    private ComboBox comboBox30;
    @FXML
    private ComboBox comboBox31;
    @FXML
    private ComboBox comboBox32;
    @FXML
    private ComboBox comboBox33;
    @FXML
    private ComboBox comboBox34;
    @FXML
    private ComboBox comboBox35;
    @FXML
    private ComboBox comboBox36;
    @FXML
    private ComboBox comboBox37;
    @FXML
    private ComboBox comboBox38;
    @FXML
    private ComboBox comboBox39;
    @FXML
    private ComboBox comboBox40;
    
  
       
//fxml labels
    @FXML
    private Label sale;    
    @FXML
    private Label tax;
    @FXML
    private Label county;  
    @FXML
    private Label freight;
    @FXML
    private Label labor;
    @FXML
    private Label cost;
    @FXML
    private Label profit;
    @FXML
    private Label customer;
    
    // fxml customer textfields
    @FXML
    private TextField customer1;
    @FXML
    private TextField customer2;
    @FXML
    private TextField customer3;
    @FXML
    private TextField customer4;
    @FXML
    private TextField customer5;
    @FXML
    private TextField customer6;
    @FXML
    private TextField customer7;
    @FXML
    private TextField customer8;
    @FXML
    private TextField customer9;
    @FXML
    private TextField customer10;
    @FXML
    private TextField customer11;
    @FXML
    private TextField customer12;
    @FXML
    private TextField customer13;
    @FXML
    private TextField customer14;
    @FXML
    private TextField customer15;
    @FXML
    private TextField customer16;
    @FXML
    private TextField customer17;
    @FXML
    private TextField customer18;
    @FXML
    private TextField customer19;
    @FXML
    private TextField customer20;
    @FXML
    private TextField customer21;
    @FXML
    private TextField customer22;
    @FXML
    private TextField customer23;
    @FXML
    private TextField customer24;
    @FXML
    private TextField customer25;
    @FXML
    private TextField customer26;
    @FXML
    private TextField customer27;
    @FXML
    private TextField customer28;
    @FXML
    private TextField customer29;
    @FXML
    private TextField customer30;
    @FXML
    private TextField customer31;
    @FXML
    private TextField customer32;
    @FXML
    private TextField customer33;
    @FXML
    private TextField customer34;
    @FXML
    private TextField customer35;
    @FXML
    private TextField customer36;
    @FXML
    private TextField customer37;
    @FXML
    private TextField customer38;
    @FXML
    private TextField customer39;
    @FXML
    private TextField customer40;
    

    
    //fxml sale textfields
    
    @FXML
    private TextField sale1 = new TextField();
    @FXML
    private TextField sale2 = new TextField();
    @FXML
    private TextField sale3= new TextField();
    @FXML
    private TextField sale4= new TextField();
    @FXML
    private TextField sale5= new TextField();
    @FXML
    private TextField sale6= new TextField();
    @FXML
    private TextField sale7= new TextField();
    @FXML
    private TextField sale8= new TextField();
    @FXML
    private TextField sale9= new TextField();
    @FXML
    private TextField sale10= new TextField();
    @FXML
    private TextField sale11= new TextField();
    @FXML
    private TextField sale12= new TextField();
    @FXML
    private TextField sale13= new TextField();
    @FXML
    private TextField sale14= new TextField();
    @FXML
    private TextField sale15= new TextField();
    @FXML
    private TextField sale16= new TextField();
    @FXML
    private TextField sale17= new TextField();
    @FXML
    private TextField sale18= new TextField();
    @FXML
    private TextField sale19= new TextField();
    @FXML
    private TextField sale20= new TextField();
    @FXML
    private TextField sale21= new TextField();
    @FXML
    private TextField sale22= new TextField();
    @FXML
    private TextField sale23= new TextField();
    @FXML
    private TextField sale24= new TextField();
    @FXML
    private TextField sale25= new TextField();
    @FXML
    private TextField sale26= new TextField();
    @FXML
    private TextField sale27= new TextField();
    @FXML
    private TextField sale28= new TextField();
    @FXML
    private TextField sale29= new TextField();
    @FXML
    private TextField sale30= new TextField();
    @FXML
    private TextField sale31= new TextField();
    @FXML
    private TextField sale32= new TextField();
    @FXML
    private TextField sale33= new TextField();
    @FXML
    private TextField sale34= new TextField();
    @FXML
    private TextField sale35= new TextField();
    @FXML
    private TextField sale36= new TextField();
    @FXML
    private TextField sale37= new TextField();
    @FXML
    private TextField sale38= new TextField();
    @FXML
    private TextField sale39= new TextField();
    @FXML
    private TextField sale40= new TextField();
    @FXML
    private TextField saleTotal=new TextField();
    
    
    
    
    
    
    
    //fxml tax textfields 
    
    @FXML
    private TextField tax1= new TextField();
    @FXML
    private TextField tax2= new TextField();
    @FXML
    private TextField tax3= new TextField();
    @FXML
    private TextField tax4= new TextField();
    @FXML
    private TextField tax5= new TextField();
    @FXML
    private TextField tax6= new TextField();
    @FXML
    private TextField tax7= new TextField();
    @FXML
    private TextField tax8= new TextField();
    @FXML
    private TextField tax9= new TextField();
    @FXML
    private TextField tax10= new TextField();
    @FXML
    private TextField tax11= new TextField();
    @FXML
    private TextField tax12= new TextField();
    @FXML
    private TextField tax13= new TextField();
    @FXML
    private TextField tax14= new TextField();
    @FXML
    private TextField tax15= new TextField();
    @FXML
    private TextField tax16= new TextField();
    @FXML
    private TextField tax17= new TextField();
    @FXML
    private TextField tax18= new TextField();
    @FXML
    private TextField tax19= new TextField();
    @FXML
    private TextField tax20= new TextField();
    @FXML
    private TextField tax21= new TextField();
    @FXML
    private TextField tax22 =new TextField();
    @FXML
    private TextField tax23= new TextField();
    @FXML
    private TextField tax24= new TextField();
    @FXML
    private TextField tax25= new TextField();
    @FXML
    private TextField tax26= new TextField();
    @FXML
    private TextField tax27= new TextField();
    @FXML
    private TextField tax28= new TextField();
    @FXML
    private TextField tax29= new TextField();
    @FXML
    private TextField tax30= new TextField();
    @FXML
    private TextField tax31= new TextField();
    @FXML
    private TextField tax32= new TextField();
    @FXML
    private TextField tax33= new TextField();
    @FXML
    private TextField tax34= new TextField();
    @FXML
    private TextField tax35= new TextField();
    @FXML
    private TextField tax36= new TextField();
    @FXML
    private TextField tax37= new TextField();
    @FXML
    private TextField tax38= new TextField();
    @FXML
    private TextField tax39= new TextField();
    @FXML
    private TextField tax40= new TextField();
    @FXML
    private TextField taxTotal= new TextField();
    
    
    
    
    
    //fxml freight textfields
    @FXML
    private TextField freight1= new TextField();
    @FXML
    private TextField freight2= new TextField();
    @FXML
    private TextField freight3= new TextField();
    @FXML
    private TextField freight4= new TextField();
    @FXML
    private TextField freight5= new TextField();
    @FXML
    private TextField freight6= new TextField();
    @FXML
    private TextField freight7= new TextField();
    @FXML
    private TextField freight8= new TextField();
    @FXML
    private TextField freight9= new TextField();
    @FXML
    private TextField freight10= new TextField();
    @FXML
    private TextField freight11= new TextField();
    @FXML
    private TextField freight12= new TextField();
    @FXML
    private TextField freight13= new TextField();
    @FXML
    private TextField freight14= new TextField();
    @FXML
    private TextField freight15= new TextField();
    @FXML
    private TextField freight16= new TextField();
    @FXML
    private TextField freight17= new TextField();
    @FXML
    private TextField freight18= new TextField();
    @FXML
    private TextField freight19= new TextField();
    @FXML
    private TextField freight20= new TextField();
    @FXML
    private TextField freight21= new TextField();
    @FXML
    private TextField freight22= new TextField();
    @FXML
    private TextField freight23= new TextField();
    @FXML
    private TextField freight24= new TextField();
    @FXML
    private TextField freight25= new TextField();
    @FXML
    private TextField freight26= new TextField();
    @FXML
    private TextField freight27= new TextField();
    @FXML
    private TextField freight28= new TextField();
    @FXML
    private TextField freight29= new TextField();
    @FXML
    private TextField freight30= new TextField();
    @FXML
    private TextField freight31= new TextField();
    @FXML
    private TextField freight32= new TextField();
    @FXML
    private TextField freight33= new TextField();
    @FXML
    private TextField freight34= new TextField();
    @FXML
    private TextField freight35= new TextField();
    @FXML
    private TextField freight36= new TextField();
    @FXML
    private TextField freight37= new TextField();
    @FXML
    private TextField freight38= new TextField();
    @FXML
    private TextField freight39= new TextField();
    @FXML
    private TextField freight40= new TextField();
    @FXML
    private TextField freightTotal= new TextField();
    
    
    //fxml labor textfields
    @FXML
    private TextField labor1= new TextField();
    @FXML
    private TextField labor2= new TextField();
    @FXML
    private TextField labor3= new TextField();
    @FXML
    private TextField labor4= new TextField();
    @FXML
    private TextField labor5= new TextField();
    @FXML
    private TextField labor6= new TextField();
    @FXML
    private TextField labor7= new TextField();
    @FXML
    private TextField labor8= new TextField();
    @FXML
    private TextField labor9= new TextField();
    @FXML
    private TextField labor10= new TextField();
    @FXML
    private TextField labor11= new TextField();
    @FXML
    private TextField labor12= new TextField();
    @FXML
    private TextField labor13= new TextField();
    @FXML
    private TextField labor14= new TextField();
    @FXML
    private TextField labor15= new TextField();
    @FXML
    private TextField labor16= new TextField();
    @FXML
    private TextField labor17= new TextField();
    @FXML
    private TextField labor18= new TextField();
    @FXML
    private TextField labor19= new TextField();
    @FXML
    private TextField labor20= new TextField();
    @FXML
    private TextField labor21= new TextField();
    @FXML
    private TextField labor22= new TextField();
    @FXML
    private TextField labor23= new TextField();
    @FXML
    private TextField labor24= new TextField();
    @FXML
    private TextField labor25= new TextField();
    @FXML
    private TextField labor26= new TextField();
    @FXML
    private TextField labor27= new TextField();
    @FXML
    private TextField labor28= new TextField();
    @FXML
    private TextField labor29= new TextField();
    @FXML
    private TextField labor30= new TextField();
    @FXML
    private TextField labor31= new TextField();
    @FXML
    private TextField labor32= new TextField();
    @FXML
    private TextField labor33= new TextField();
    @FXML
    private TextField labor34= new TextField();
    @FXML
    private TextField labor35= new TextField();
    @FXML
    private TextField labor36= new TextField();
    @FXML
    private TextField labor37= new TextField();
    @FXML
    private TextField labor38= new TextField();
    @FXML
    private TextField labor39= new TextField();
    @FXML
    private TextField labor40= new TextField();
    @FXML
    private TextField laborTotal= new TextField();
   
    
    
   
    //fxml cost textfields
    @FXML
    private TextField cost1= new TextField();
    @FXML
    private TextField cost2= new TextField();
    @FXML
    private TextField cost3= new TextField();
    @FXML
    private TextField cost4= new TextField();
    @FXML
    private TextField cost5= new TextField();
    @FXML
    private TextField cost6= new TextField();
    @FXML
    private TextField cost7= new TextField();
    @FXML
    private TextField cost8= new TextField();
    @FXML
    private TextField cost9= new TextField();
    @FXML
    private TextField cost10= new TextField();
    @FXML
    private TextField cost11= new TextField();
    @FXML
    private TextField cost12= new TextField();
    @FXML
    private TextField cost13= new TextField();
    @FXML
    private TextField cost14= new TextField();
    @FXML
    private TextField cost15= new TextField();
    @FXML
    private TextField cost16= new TextField();
    @FXML
    private TextField cost17= new TextField();
    @FXML
    private TextField cost18= new TextField();
    @FXML
    private TextField cost19= new TextField();
    @FXML
    private TextField cost20= new TextField();
    @FXML
    private TextField cost21= new TextField();
    @FXML
    private TextField cost22= new TextField();
    @FXML
    private TextField cost23= new TextField();
    @FXML
    private TextField cost24= new TextField();
    @FXML
    private TextField cost25= new TextField();
    @FXML
    private TextField cost26= new TextField();
    @FXML
    private TextField cost27= new TextField();
    @FXML
    private TextField cost28= new TextField();
    @FXML
    private TextField cost29= new TextField();
    @FXML
    private TextField cost30= new TextField();
    @FXML
    private TextField cost31= new TextField();
    @FXML
    private TextField cost32= new TextField();
    @FXML
    private TextField cost33= new TextField();
    @FXML
    private TextField cost34= new TextField();
    @FXML
    private TextField cost35= new TextField();
    @FXML
    private TextField cost36= new TextField();
    @FXML
    private TextField cost37= new TextField();
    @FXML
    private TextField cost38= new TextField();
    @FXML
    private TextField cost39= new TextField();
    @FXML
    private TextField cost40= new TextField();
    @FXML
    private TextField costTotal= new TextField();
    
    
    
    //fxml profit textfields
    @FXML
    private TextField profit1= new TextField();
    @FXML
    private TextField profit2= new TextField();
    @FXML
    private TextField profit3= new TextField();
    @FXML
    private TextField profit4= new TextField();
    @FXML
    private TextField profit5= new TextField();
    @FXML
    private TextField profit6= new TextField();
    @FXML
    private TextField profit7= new TextField();
    @FXML
    private TextField profit8= new TextField();
    @FXML
    private TextField profit9= new TextField();
    @FXML
    private TextField profit10= new TextField();
    @FXML
    private TextField profit11= new TextField();
    @FXML
    private TextField profit12= new TextField();
    @FXML
    private TextField profit13= new TextField();
    @FXML
    private TextField profit14= new TextField();
    @FXML
    private TextField profit15= new TextField();
    @FXML
    private TextField profit16= new TextField();
    @FXML
    private TextField profit17= new TextField();
    @FXML
    private TextField profit18= new TextField();
    @FXML
    private TextField profit19= new TextField();
    @FXML
    private TextField profit20= new TextField();
    @FXML
    private TextField profit21= new TextField();
    @FXML
    private TextField profit22= new TextField();
    @FXML
    private TextField profit23= new TextField();
    @FXML
    private TextField profit24= new TextField();
    @FXML
    private TextField profit25= new TextField();
    @FXML
    private TextField profit26= new TextField();
    @FXML
    private TextField profit27= new TextField();
    @FXML
    private TextField profit28= new TextField();
    @FXML
    private TextField profit29= new TextField();
    @FXML
    private TextField profit30= new TextField();
    @FXML
    private TextField profit31= new TextField();
    @FXML
    private TextField profit32= new TextField();
    @FXML
    private TextField profit33= new TextField();
    @FXML
    private TextField profit34= new TextField();
    @FXML
    private TextField profit35= new TextField();
    @FXML
    private TextField profit36= new TextField();
    @FXML
    private TextField profit37= new TextField();
    @FXML
    private TextField profit38= new TextField();
    @FXML
    private TextField profit39= new TextField();
    @FXML
    private TextField profit40= new TextField();
    @FXML
    private TextField profitTotal= new TextField();
    

    
    //fxml button calculate   
   @FXML
    private Button calculate;
   @FXML
    private Button screenshotButton;
   
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
         //TODO: declare and set value to metric asston of comboboxes
        
         //initialize combobox variables
        comboBox1.setValue("County");
        comboBox1.setItems(comboBoxList);
        
        comboBox2.setValue("County");
        comboBox2.setItems(comboBoxList);
        
        comboBox3.setValue("County");
        comboBox3.setItems(comboBoxList);
        
        comboBox4.setValue("County");
        comboBox4.setItems(comboBoxList);
        
        comboBox5.setValue("County");
        comboBox5.setItems(comboBoxList);
        
        comboBox6.setValue("County");
        comboBox6.setItems(comboBoxList);
        
        comboBox7.setValue("County");
        comboBox7.setItems(comboBoxList);
        
        comboBox8.setValue("County");
        comboBox8.setItems(comboBoxList);
        
        comboBox9.setValue("County");
        comboBox9.setItems(comboBoxList);
        
        comboBox10.setValue("County");
        comboBox10.setItems(comboBoxList);
        
        comboBox11.setValue("County");
        comboBox11.setItems(comboBoxList);
        
        comboBox12.setValue("County");
        comboBox12.setItems(comboBoxList);
        
        comboBox13.setValue("County");
        comboBox13.setItems(comboBoxList);
        
        comboBox14.setValue("County");
        comboBox14.setItems(comboBoxList);
        
        comboBox15.setValue("County");
        comboBox15.setItems(comboBoxList);
        
        comboBox16.setValue("County");
        comboBox16.setItems(comboBoxList);
        
        comboBox17.setValue("County");
        comboBox17.setItems(comboBoxList);
        
        comboBox18.setValue("County");
        comboBox18.setItems(comboBoxList);
        
        comboBox19.setValue("County");
        comboBox19.setItems(comboBoxList);
        
        comboBox20.setValue("County");
        comboBox20.setItems(comboBoxList);
        
        comboBox21.setValue("County");
        comboBox21.setItems(comboBoxList);
        
        comboBox22.setValue("County");
        comboBox22.setItems(comboBoxList);
        
        comboBox23.setValue("County");
        comboBox23.setItems(comboBoxList);
        
        comboBox24.setValue("County");
        comboBox24.setItems(comboBoxList);
        
        comboBox25.setValue("County");
        comboBox25.setItems(comboBoxList);
        
        comboBox26.setValue("County");
        comboBox26.setItems(comboBoxList);
        
        comboBox27.setValue("County");
        comboBox27.setItems(comboBoxList);
        
        comboBox28.setValue("County");
        comboBox28.setItems(comboBoxList);
        
        comboBox29.setValue("County");
        comboBox29.setItems(comboBoxList);
        
        comboBox30.setValue("County");
        comboBox30.setItems(comboBoxList);
        
        comboBox31.setValue("County");
        comboBox31.setItems(comboBoxList);
        
        comboBox32.setValue("County");
        comboBox32.setItems(comboBoxList);
        
        comboBox33.setValue("County");
        comboBox33.setItems(comboBoxList);
        
        comboBox34.setValue("County");
        comboBox34.setItems(comboBoxList);
        
        comboBox35.setValue("County");
        comboBox35.setItems(comboBoxList);
        
        comboBox36.setValue("County");
        comboBox36.setItems(comboBoxList);
        
        comboBox37.setValue("County");
        comboBox37.setItems(comboBoxList);
        
        comboBox38.setValue("County");
        comboBox38.setItems(comboBoxList);
        
        comboBox39.setValue("County");
        comboBox39.setItems(comboBoxList);
        
        comboBox40.setValue("County");
        comboBox40.setItems(comboBoxList);
        
        
       
        
        
        
        
       
        
        
        
        
       
        
        
        
    }
    
    /*@FXML
    public void takeSnapShot(Scene scene){
        WritableImage writableImage = 
            new WritableImage((int)scene.getWidth(), (int)scene.getHeight());
        scene.snapshot(writableImage);
         
        File file = new File("tax.png");
        try {
            ImageIO.write(SwingFXUtils.fromFXImage(writableImage, null), "png", file);
            System.out.println("snapshot saved: " + file.getAbsolutePath());
        } catch (IOException ex) {
           // Logger.getLogger(JavaFXSnapshot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

/*@FXML public void captureFrame() throws AWTException, IOException, NullPointerException  {
 
 Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
BufferedImage capture = new Robot().createScreenCapture(screenRect);
ImageIO.write(capture, "bmp", new File[0]);
 
}*/
    
    
    
    
    


        
        @FXML
        public void calculateTotal(ActionEvent event){
        //TODO: write logic to add every dam column up and output the total at the bottom. Also delete previous text whenever the calculate button is pressed plz
            
            //sales column
            saleTotal.clear();
            int sales1 = Integer.parseInt("0"+sale1.getText());
            int sales2 = Integer.parseInt("0"+sale2.getText());
            int sales3 = Integer.parseInt("0"+sale3.getText());
            int sales4 = Integer.parseInt("0"+sale4.getText());
            int sales5 = Integer.parseInt("0"+sale5.getText());
            int sales6 = Integer.parseInt("0"+sale6.getText());
            int sales7 = Integer.parseInt("0"+sale7.getText());
            int sales8 = Integer.parseInt("0"+sale8.getText());
            int sales9 = Integer.parseInt("0"+sale9.getText());
            int sales10 = Integer.parseInt("0"+sale10.getText());
            int sales11 = Integer.parseInt("0"+sale11.getText());
            int sales12 = Integer.parseInt("0"+sale12.getText());
            int sales13 = Integer.parseInt("0"+sale13.getText());
            int sales14 = Integer.parseInt("0"+sale14.getText());
            int sales15 = Integer.parseInt("0"+sale15.getText());
            int sales16 = Integer.parseInt("0"+sale16.getText());
            int sales17 = Integer.parseInt("0"+sale17.getText());
            int sales18 = Integer.parseInt("0"+sale18.getText());
            int sales19 = Integer.parseInt("0"+sale19.getText());
            int sales20 = Integer.parseInt("0"+sale20.getText());
            int sales21 = Integer.parseInt("0"+sale21.getText());
            int sales22 = Integer.parseInt("0"+sale22.getText());
            int sales23 = Integer.parseInt("0"+sale23.getText());
            int sales24 = Integer.parseInt("0"+sale24.getText());
            int sales25 = Integer.parseInt("0"+sale25.getText());
            int sales26 = Integer.parseInt("0"+sale26.getText());
            int sales27 = Integer.parseInt("0"+sale27.getText());
            int sales28 = Integer.parseInt("0"+sale28.getText());
            int sales29 = Integer.parseInt("0"+sale29.getText());
            int sales30 = Integer.parseInt("0"+sale30.getText());
            int sales31 = Integer.parseInt("0"+sale31.getText());
            int sales32 = Integer.parseInt("0"+sale32.getText());
            int sales33 = Integer.parseInt("0"+sale33.getText());
            int sales34 = Integer.parseInt("0"+sale34.getText());
            int sales35 = Integer.parseInt("0"+sale35.getText());
            int sales36 = Integer.parseInt("0"+sale36.getText());
            int sales37 = Integer.parseInt("0"+sale37.getText());
            int sales38 = Integer.parseInt("0"+sale38.getText());
            int sales39 = Integer.parseInt("0"+sale39.getText());
            int sales40 = Integer.parseInt("0"+sale40.getText());
            int salesTotal = sales1 + sales2 + sales3 + sales4 + sales5 + sales6 + sales7 + sales8 + sales9 +sales10 + sales11 + sales12 + sales13 + sales14 + sales15 + sales16 + sales17 + sales18 + sales19 + sales20 + sales21 + sales22 + sales23 + sales24 + sales25 + sales26 + sales27 + sales28 + sales29 + sales30 + sales31 + sales32 + sales33 + sales34 + sales35 + sales36 + sales37 + sales38 + sales39 + sales40;
            saleTotal.setText(saleTotal.getText()+salesTotal);
            
            //tax column
            taxTotal.clear();
            int taxx1 = Integer.parseInt("0"+tax1.getText());
            int taxx2 = Integer.parseInt("0"+tax2.getText());
            int taxx3 = Integer.parseInt("0"+tax3.getText());
            int taxx4 = Integer.parseInt("0"+tax4.getText());
            int taxx5 = Integer.parseInt("0"+tax5.getText());
            int taxx6 = Integer.parseInt("0"+tax6.getText());
            int taxx7 = Integer.parseInt("0"+tax7.getText());
            int taxx8 = Integer.parseInt("0"+tax8.getText());
            int taxx9 = Integer.parseInt("0"+tax9.getText());
            int taxx10 = Integer.parseInt("0"+tax10.getText());
            int taxx11 = Integer.parseInt("0"+tax11.getText());
            int taxx12 = Integer.parseInt("0"+tax12.getText());
            int taxx13 = Integer.parseInt("0"+tax13.getText());
            int taxx14 = Integer.parseInt("0"+tax14.getText());
            int taxx15 = Integer.parseInt("0"+tax15.getText());
            int taxx16 = Integer.parseInt("0"+tax16.getText());
            int taxx17 = Integer.parseInt("0"+tax17.getText());
            int taxx18 = Integer.parseInt("0"+tax18.getText());
            int taxx19 = Integer.parseInt("0"+tax19.getText());
            int taxx20 = Integer.parseInt("0"+tax20.getText());
            int taxx21 = Integer.parseInt("0"+tax21.getText());
            int taxx22 = Integer.parseInt("0"+tax22.getText());
            int taxx23 = Integer.parseInt("0"+tax23.getText());
            int taxx24 = Integer.parseInt("0"+tax24.getText());
            int taxx25 = Integer.parseInt("0"+tax25.getText());
            int taxx26 = Integer.parseInt("0"+tax26.getText());
            int taxx27 = Integer.parseInt("0"+tax27.getText());
            int taxx28 = Integer.parseInt("0"+tax28.getText());
            int taxx29 = Integer.parseInt("0"+tax29.getText());
            int taxx30 = Integer.parseInt("0"+tax30.getText());
            int taxx31 = Integer.parseInt("0"+tax31.getText());
            int taxx32 = Integer.parseInt("0"+tax32.getText());
            int taxx33 = Integer.parseInt("0"+tax33.getText());
            int taxx34 = Integer.parseInt("0"+tax34.getText());
            int taxx35 = Integer.parseInt("0"+tax35.getText());
            int taxx36 = Integer.parseInt("0"+tax36.getText());
            int taxx37 = Integer.parseInt("0"+tax37.getText());
            int taxx38 = Integer.parseInt("0"+tax38.getText());
            int taxx39 = Integer.parseInt("0"+tax39.getText());
            int taxx40 = Integer.parseInt("0"+tax40.getText());
            int taxxTotal = taxx1 + taxx2 + taxx3 + taxx4 + taxx5 + taxx6 + taxx7 + taxx8 + taxx9 +taxx10 + taxx11 + taxx12 + taxx13 + taxx14 + taxx15 + taxx16 + taxx17 + taxx18 + taxx19 + taxx20 + taxx21 + taxx22 + taxx23 + taxx24 + taxx25 + taxx26 + taxx27 + taxx28 + taxx29 + taxx30 + taxx31 + taxx32 + taxx33 + taxx34 + taxx35 + taxx36 + taxx37 + taxx38 + taxx39 + taxx40;
            taxTotal.setText(taxTotal.getText()+taxxTotal);
            
            
            //freight column
            freightTotal.clear();
            int freights1 = Integer.parseInt("0"+freight1.getText());
            int freights2 = Integer.parseInt("0"+freight2.getText());
            int freights3 = Integer.parseInt("0"+freight3.getText());
            int freights4 = Integer.parseInt("0"+freight4.getText());
            int freights5 = Integer.parseInt("0"+freight5.getText());
            int freights6 = Integer.parseInt("0"+freight6.getText());
            int freights7 = Integer.parseInt("0"+freight7.getText());
            int freights8 = Integer.parseInt("0"+freight8.getText());
            int freights9 = Integer.parseInt("0"+freight9.getText());
            int freights10 = Integer.parseInt("0"+freight10.getText());
            int freights11 = Integer.parseInt("0"+freight11.getText());
            int freights12 = Integer.parseInt("0"+freight12.getText());
            int freights13 = Integer.parseInt("0"+freight13.getText());
            int freights14 = Integer.parseInt("0"+freight14.getText());
            int freights15 = Integer.parseInt("0"+freight15.getText());
            int freights16 = Integer.parseInt("0"+freight16.getText());
            int freights17 = Integer.parseInt("0"+freight17.getText());
            int freights18 = Integer.parseInt("0"+freight18.getText());
            int freights19 = Integer.parseInt("0"+freight19.getText());
            int freights20 = Integer.parseInt("0"+freight20.getText());
            int freights21 = Integer.parseInt("0"+freight21.getText());
            int freights22 = Integer.parseInt("0"+freight22.getText());
            int freights23 = Integer.parseInt("0"+freight23.getText());
            int freights24 = Integer.parseInt("0"+freight24.getText());
            int freights25 = Integer.parseInt("0"+freight25.getText());
            int freights26 = Integer.parseInt("0"+freight26.getText());
            int freights27 = Integer.parseInt("0"+freight27.getText());
            int freights28 = Integer.parseInt("0"+freight28.getText());
            int freights29 = Integer.parseInt("0"+freight29.getText());
            int freights30 = Integer.parseInt("0"+freight30.getText());
            int freights31 = Integer.parseInt("0"+freight31.getText());
            int freights32 = Integer.parseInt("0"+freight32.getText());
            int freights33 = Integer.parseInt("0"+freight33.getText());
            int freights34 = Integer.parseInt("0"+freight34.getText());
            int freights35 = Integer.parseInt("0"+freight35.getText());
            int freights36 = Integer.parseInt("0"+freight36.getText());
            int freights37 = Integer.parseInt("0"+freight37.getText());
            int freights38 = Integer.parseInt("0"+freight38.getText());
            int freights39 = Integer.parseInt("0"+freight39.getText());
            int freights40 = Integer.parseInt("0"+freight40.getText());
            int freightsTotal = freights1 + freights2 + freights3 + freights4 + freights5 + freights6 + freights7 + freights8 + freights9 +freights10 + freights11 + freights12 + freights13 + freights14 + freights15 + freights16 + freights17 + freights18 + freights19 + freights20 + freights21 + freights22 + freights23 + freights24 + freights25 + freights26 + freights27 + freights28 + freights29 + freights30 + freights31 + freights32 + freights33 + freights34 + freights35 + freights36 + freights37 + freights38 + freights39 + freights40;
            freightTotal.setText(freightTotal.getText()+freightsTotal);
            
            
            
            //labor column
            laborTotal.clear();
            int labors1 = Integer.parseInt("0"+labor1.getText());
            int labors2 = Integer.parseInt("0"+labor2.getText());
            int labors3 = Integer.parseInt("0"+labor3.getText());
            int labors4 = Integer.parseInt("0"+labor4.getText());
            int labors5 = Integer.parseInt("0"+labor5.getText());
            int labors6 = Integer.parseInt("0"+labor6.getText());
            int labors7 = Integer.parseInt("0"+labor7.getText());
            int labors8 = Integer.parseInt("0"+labor8.getText());
            int labors9 = Integer.parseInt("0"+labor9.getText());
            int labors10 = Integer.parseInt("0"+labor10.getText());
            int labors11 = Integer.parseInt("0"+labor11.getText());
            int labors12 = Integer.parseInt("0"+labor12.getText());
            int labors13 = Integer.parseInt("0"+labor13.getText());
            int labors14 = Integer.parseInt("0"+labor14.getText());
            int labors15 = Integer.parseInt("0"+labor15.getText());
            int labors16 = Integer.parseInt("0"+labor16.getText());
            int labors17 = Integer.parseInt("0"+labor17.getText());
            int labors18 = Integer.parseInt("0"+labor18.getText());
            int labors19 = Integer.parseInt("0"+labor19.getText());
            int labors20 = Integer.parseInt("0"+labor20.getText());
            int labors21 = Integer.parseInt("0"+labor21.getText());
            int labors22 = Integer.parseInt("0"+labor22.getText());
            int labors23 = Integer.parseInt("0"+labor23.getText());
            int labors24 = Integer.parseInt("0"+labor24.getText());
            int labors25 = Integer.parseInt("0"+labor25.getText());
            int labors26 = Integer.parseInt("0"+labor26.getText());
            int labors27 = Integer.parseInt("0"+labor27.getText());
            int labors28 = Integer.parseInt("0"+labor28.getText());
            int labors29 = Integer.parseInt("0"+labor29.getText());
            int labors30 = Integer.parseInt("0"+labor30.getText());
            int labors31 = Integer.parseInt("0"+labor31.getText());
            int labors32 = Integer.parseInt("0"+labor32.getText());
            int labors33 = Integer.parseInt("0"+labor33.getText());
            int labors34 = Integer.parseInt("0"+labor34.getText());
            int labors35 = Integer.parseInt("0"+labor35.getText());
            int labors36 = Integer.parseInt("0"+labor36.getText());
            int labors37 = Integer.parseInt("0"+labor37.getText());
            int labors38 = Integer.parseInt("0"+labor38.getText());
            int labors39 = Integer.parseInt("0"+labor39.getText());
            int labors40 = Integer.parseInt("0"+labor40.getText());
            int laborsTotal = labors1 + labors2 + labors3 + labors4 + labors5 + labors6 + labors7 + labors8 + labors9 +labors10 + labors11 + labors12 + labors13 + labors14 + labors15 + labors16 + labors17 + labors18 + labors19 + labors20 + labors21 + labors22 + labors23 + labors24 + labors25 + labors26 + labors27 + labors28 + labors29 + labors30 + labors31 + labors32 + labors33 + labors34 + labors35 + labors36 + labors37 + labors38 + labors39 + labors40;
            laborTotal.setText(laborTotal.getText()+laborsTotal);
            
            //cost column
            costTotal.clear();
            int costs1 = Integer.parseInt("0"+cost1.getText());
            int costs2 = Integer.parseInt("0"+cost2.getText());
            int costs3 = Integer.parseInt("0"+cost3.getText());
            int costs4 = Integer.parseInt("0"+cost4.getText());
            int costs5 = Integer.parseInt("0"+cost5.getText());
            int costs6 = Integer.parseInt("0"+cost6.getText());
            int costs7 = Integer.parseInt("0"+cost7.getText());
            int costs8 = Integer.parseInt("0"+cost8.getText());
            int costs9 = Integer.parseInt("0"+cost9.getText());
            int costs10 = Integer.parseInt("0"+cost10.getText());
            int costs11 = Integer.parseInt("0"+cost11.getText());
            int costs12 = Integer.parseInt("0"+cost12.getText());
            int costs13 = Integer.parseInt("0"+cost13.getText());
            int costs14 = Integer.parseInt("0"+cost14.getText());
            int costs15 = Integer.parseInt("0"+cost15.getText());
            int costs16 = Integer.parseInt("0"+cost16.getText());
            int costs17 = Integer.parseInt("0"+cost17.getText());
            int costs18 = Integer.parseInt("0"+cost18.getText());
            int costs19 = Integer.parseInt("0"+cost19.getText());
            int costs20 = Integer.parseInt("0"+cost20.getText());
            int costs21 = Integer.parseInt("0"+cost21.getText());
            int costs22 = Integer.parseInt("0"+cost22.getText());
            int costs23 = Integer.parseInt("0"+cost23.getText());
            int costs24 = Integer.parseInt("0"+cost24.getText());
            int costs25 = Integer.parseInt("0"+cost25.getText());
            int costs26 = Integer.parseInt("0"+cost26.getText());
            int costs27 = Integer.parseInt("0"+cost27.getText());
            int costs28 = Integer.parseInt("0"+cost28.getText());
            int costs29 = Integer.parseInt("0"+cost29.getText());
            int costs30 = Integer.parseInt("0"+cost30.getText());
            int costs31 = Integer.parseInt("0"+cost31.getText());
            int costs32 = Integer.parseInt("0"+cost32.getText());
            int costs33 = Integer.parseInt("0"+cost33.getText());
            int costs34 = Integer.parseInt("0"+cost34.getText());
            int costs35 = Integer.parseInt("0"+cost35.getText());
            int costs36 = Integer.parseInt("0"+cost36.getText());
            int costs37 = Integer.parseInt("0"+cost37.getText());
            int costs38 = Integer.parseInt("0"+cost38.getText());
            int costs39 = Integer.parseInt("0"+cost39.getText());
            int costs40 = Integer.parseInt("0"+cost40.getText());
            int costsTotal = costs1 + costs2 + costs3 + costs4 + costs5 + costs6 + costs7 + costs8 + costs9 +costs10 + costs11 + costs12 + costs13 + costs14 + costs15 + costs16 + costs17 + costs18 + costs19 + costs20 + costs21 + costs22 + costs23 + costs24 + costs25 + costs26 + costs27 + costs28 + costs29 + costs30 + costs31 + costs32 + costs33 + costs34 + costs35 + costs36 + costs37 + costs38 + costs39 + costs40;
            costTotal.setText(costTotal.getText()+costsTotal);
            
            
            
            //profit column
            profitTotal.clear();
            int profits1 = Integer.parseInt("0"+profit1.getText());
            int profits2 = Integer.parseInt("0"+profit2.getText());
            int profits3 = Integer.parseInt("0"+profit3.getText());
            int profits4 = Integer.parseInt("0"+profit4.getText());
            int profits5 = Integer.parseInt("0"+profit5.getText());
            int profits6 = Integer.parseInt("0"+profit6.getText());
            int profits7 = Integer.parseInt("0"+profit7.getText());
            int profits8 = Integer.parseInt("0"+profit8.getText());
            int profits9 = Integer.parseInt("0"+profit9.getText());
            int profits10 = Integer.parseInt("0"+profit10.getText());
            int profits11 = Integer.parseInt("0"+profit11.getText());
            int profits12 = Integer.parseInt("0"+profit12.getText());
            int profits13 = Integer.parseInt("0"+profit13.getText());
            int profits14 = Integer.parseInt("0"+profit14.getText());
            int profits15 = Integer.parseInt("0"+profit15.getText());
            int profits16 = Integer.parseInt("0"+profit16.getText());
            int profits17 = Integer.parseInt("0"+profit17.getText());
            int profits18 = Integer.parseInt("0"+profit18.getText());
            int profits19 = Integer.parseInt("0"+profit19.getText());
            int profits20 = Integer.parseInt("0"+profit20.getText());
            int profits21 = Integer.parseInt("0"+profit21.getText());
            int profits22 = Integer.parseInt("0"+profit22.getText());
            int profits23 = Integer.parseInt("0"+profit23.getText());
            int profits24 = Integer.parseInt("0"+profit24.getText());
            int profits25 = Integer.parseInt("0"+profit25.getText());
            int profits26 = Integer.parseInt("0"+profit26.getText());
            int profits27 = Integer.parseInt("0"+profit27.getText());
            int profits28 = Integer.parseInt("0"+profit28.getText());
            int profits29 = Integer.parseInt("0"+profit29.getText());
            int profits30 = Integer.parseInt("0"+profit30.getText());
            int profits31 = Integer.parseInt("0"+profit31.getText());
            int profits32 = Integer.parseInt("0"+profit32.getText());
            int profits33 = Integer.parseInt("0"+profit33.getText());
            int profits34 = Integer.parseInt("0"+profit34.getText());
            int profits35 = Integer.parseInt("0"+profit35.getText());
            int profits36 = Integer.parseInt("0"+profit36.getText());
            int profits37 = Integer.parseInt("0"+profit37.getText());
            int profits38 = Integer.parseInt("0"+profit38.getText());
            int profits39 = Integer.parseInt("0"+profit39.getText());
            int profits40 = Integer.parseInt("0"+profit40.getText());
            int profitsTotal = profits1 + profits2 + profits3 + profits4 + profits5 + profits6 + profits7 + profits8 + profits9 +profits10 + profits11 + profits12 + profits13 + profits14 + profits15 + profits16 + profits17 + profits18 + profits19 + profits20 + profits21 + profits22 + profits23 + profits24 + profits25 + profits26 + profits27 + profits28 + profits29 + profits30 + profits31 + profits32 + profits33 + profits34 + profits35 + profits36 + profits37 + profits38 + profits39 + profits40;
            profitTotal.setText(profitTotal.getText()+profitsTotal);
            
            
       /*     
        int taxx1 = Integer.parseInt(tax1.getText());
        int frei1 = Integer.parseInt(freight1.getText());
        int lab1 = Integer.parseInt(labor1.getText());
        int cos1 = Integer.parseInt(cost1.getText());        
        int result1 = sal1 + taxx1 + frei1 + lab1 + cos1;
        profit1.setText(profit1.getText()+result1);
            */
            
 
            
            /*    
        //add values put into textfields  
       // calculateTotal.setOnAction(new EventHandler<ActionEvent>() {
       // if(event.getSource()==calculateTotal){
         
        //row1
        
       
        int sal1 = Integer.parseInt(sale1.getText());
        int taxx1 = Integer.parseInt(tax1.getText());
        int frei1 = Integer.parseInt(freight1.getText());
        int lab1 = Integer.parseInt(labor1.getText());
        int cos1 = Integer.parseInt(cost1.getText());        
        int result1 = sal1 + taxx1 + frei1 + lab1 + cos1;
        profit1.setText(profit1.getText()+result1);
      
        
        //row2
        int sal2 = Integer.parseInt(sale2.getText());
        int taxx2 = Integer.parseInt(tax2.getText());
        int frei2 = Integer.parseInt(freight2.getText());
        int lab2 = Integer.parseInt(labor2.getText());
        int cos2 = Integer.parseInt(cost2.getText());        
        int result2 = sal2 + taxx2 + frei2 + lab2 + cos2;
        profit2.setText(profit2.getText()+result2);     
        
        //row3
        int sal3 = Integer.parseInt(sale3.getText());
        int taxx3 = Integer.parseInt(tax3.getText());
        int frei3 = Integer.parseInt(freight3.getText());
        int lab3 = Integer.parseInt(labor3.getText());
        int cos3 = Integer.parseInt(cost3.getText());        
        int result3 = sal3 + taxx3 + frei3 + lab3 + cos3;
        profit3.setText(profit3.getText()+result3);
        
        //row4
        int sal4 = Integer.parseInt(sale4.getText());
        int taxx4 = Integer.parseInt(tax4.getText());
        int frei4 = Integer.parseInt(freight4.getText());
        int lab4 = Integer.parseInt(labor4.getText());
        int cos4 = Integer.parseInt(cost4.getText());        
        int result4 = sal4 + taxx4 + frei4 + lab4 + cos4;
        profit4.setText(profit4.getText()+result4);
        
        //row5
        int sal5 = Integer.parseInt(sale5.getText());
        int taxx5 = Integer.parseInt(tax5.getText());
        int frei5 = Integer.parseInt(freight5.getText());
        int lab5 = Integer.parseInt(labor5.getText());
        int cos5 = Integer.parseInt(cost5.getText());        
        int result5 = sal5 + taxx5 + frei5 + lab5 + cos5;
        profit5.setText(profit5.getText()+result5);
        
        //row6
        int sal6 = Integer.parseInt(sale6.getText());
        int taxx6 = Integer.parseInt(tax6.getText());
        int frei6 = Integer.parseInt(freight6.getText());
        int lab6 = Integer.parseInt(labor6.getText());
        int cos6 = Integer.parseInt(cost6.getText());        
        int result6 = sal6 + taxx6 + frei6 + lab6 + cos6;
        profit6.setText(profit6.getText()+result6);
        
        //row7
        int sal7 = Integer.parseInt(sale7.getText());
        int taxx7 = Integer.parseInt(tax7.getText());
        int frei7 = Integer.parseInt(freight7.getText());
        int lab7 = Integer.parseInt(labor7.getText());
        int cos7 = Integer.parseInt(cost7.getText());        
        int result7 = sal7 + taxx7 + frei7 + lab7 + cos7;
        profit7.setText(profit7.getText()+result7);
        
        //row8
        int sal8 = Integer.parseInt(sale8.getText());
        int taxx8 = Integer.parseInt(tax8.getText());
        int frei8 = Integer.parseInt(freight8.getText());
        int lab8 = Integer.parseInt(labor8.getText());
        int cos8 = Integer.parseInt(cost8.getText());        
        int result8 = sal8 + taxx8 + frei8 + lab8 + cos8;
        profit8.setText(profit8.getText()+result8);
        
        //row9
        int sal9 = Integer.parseInt(sale9.getText());
        int taxx9 = Integer.parseInt(tax9.getText());
        int frei9 = Integer.parseInt(freight9.getText());
        int lab9 = Integer.parseInt(labor9.getText());
        int cos9 = Integer.parseInt(cost9.getText());        
        int result9 = sal9 + taxx9 + frei9 + lab9 + cos9;
        profit9.setText(profit9.getText()+result9);
        
        //row10
        int sal10 = Integer.parseInt(sale10.getText());
        int taxx10 = Integer.parseInt(tax10.getText());
        int frei10 = Integer.parseInt(freight10.getText());
        int lab10 = Integer.parseInt(labor10.getText());
        int cos10 = Integer.parseInt(cost10.getText());        
        int result10 = sal10 + taxx10 + frei10 + lab10 + cos10;
        profit10.setText(profit10.getText()+result10);
        
        //row11
        int sal11 = Integer.parseInt(sale11.getText());
        int taxx11 = Integer.parseInt(tax11.getText());
        int frei11 = Integer.parseInt(freight11.getText());
        int lab11 = Integer.parseInt(labor11.getText());
        int cos11 = Integer.parseInt(cost11.getText());        
        int result11 = sal11 + taxx11 + frei11 + lab11 + cos11;
        profit11.setText(profit11.getText()+result11);
        
        //row12
        int sal12 = Integer.parseInt(sale12.getText());
        int taxx12 = Integer.parseInt(tax12.getText());
        int frei12 = Integer.parseInt(freight12.getText());
        int lab12 = Integer.parseInt(labor12.getText());
        int cos12 = Integer.parseInt(cost12.getText());        
        int result12 = sal12 + taxx12 + frei12 + lab12 + cos12;
        profit12.setText(profit12.getText()+result12);
       
                           
        //});
        
       
        }
      /*  public void scroll(){
            sc.valueProperty().addListener(new ChangeListener<Number>() {
    public void changed(ObservableValue<? extends Number> ov,
        Number old_val, Number new_val) {
            vb.setLayoutY(-new_val.doubleValue());
        }
        }
        }});*/
        
            }
       /* public void printToTextFile(String[] args) throws IOException{
        try {
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capture = new Robot().createScreenCapture(screenRect);
            ImageIO.write(capture, "bmp", new File(args[0]));
        } catch (AWTException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }*/
            //TODO: make it print to a text file. good freakin luck
            //or save this instance as a file. aka new file, save file, load file
            // https://stackoverflow.com/questions/32143640/how-to-save-jtextfield-value-to-a-txt-file-as-a-log
        
       // @FXML
        /*public void takeScreenshot(String[] args) throws IOException{
        try {
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capture = new Robot().createScreenCapture(screenRect);
            ImageIO.write(capture, "bmp", new File(args[0]));
        } catch (AWTException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }*/
        
    /**
     *
     * @param argFrame
     * @param fileName
     */
  
}

    
    
    
    
    
    
    
    
    
   
    
    

