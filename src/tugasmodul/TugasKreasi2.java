package tugasmodul;

/**
 * Nama : Muhammad Ikhtiar Ananda
 * NPM  : 16.63.0610 |5C Reg pagi Bjb
 */
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
 
class TugasKreasi2 extends JFrame 
{        
    JLabel lblnama=new JLabel("NAMA PEMBELI");    
    JTextField txnama=new JTextField(20);    
    JLabel lbldata=new JLabel("DATA MOTOR ");    
    JLabel lbljenis=new JLabel("Jenis Motor ");    
    JRadioButton bebek=new JRadioButton("BEBEK");    
    JRadioButton sport=new JRadioButton("SPORT");    
    JRadioButton matik=new JRadioButton("MATIK");    
    ButtonGroup grupjenis=new ButtonGroup(); 
    JLabel lblmerk=new JLabel("Merk Motor");        
    JCheckBox honda=new JCheckBox("HONDA");    
    JCheckBox yamaha=new JCheckBox("YAMAHA");    
    JCheckBox suzuki=new JCheckBox("SUZUKI");
    JCheckBox kawasaki=new JCheckBox("KAWASAKI");
    JLabel lblharga=new JLabel("Harga");
    JTextField txharga=new JTextField(20);
    JLabel lblpembayaran=new JLabel("PEMBAYARAN");    
    JRadioButton tunai=new JRadioButton("TUNAI");    
    JRadioButton kredit=new JRadioButton("KREDIT");
    JButton tblhitung=new JButton("Hitung");
    JLabel lblhargamotor=new JLabel("HARGA MOTOR"); 
    JLabel lbldiskon=new JLabel("DISKON ");
    JTextField txdiskon=new JTextField(20);
    JButton tblupdate=new JButton("Update");    
    JLabel lbltotalbayar=new JLabel("TOTAL BAYAR ");
    JTextField txtotalbayar=new JTextField(20);
    JButton tblexit=new JButton("EXIT");
    JTextArea hasil=new JTextArea();
    JButton cetak=new JButton("Cetak");
    
    TugasKreasi2()    
    {       
        setTitle("APLIKASI PENJUALAN MOTOR");       
        setLocation(300,100);       
        setSize(400,525);       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    void komponenVisual()    
     {       
         getContentPane().setLayout(null);                    
         getContentPane().add(lblnama);       
         lblnama.setBounds(10,10,100,20);       
         getContentPane().add(txnama);       
         txnama.setBounds(125,10,200,20);
         getContentPane().add(lbldata);       
         lbldata.setBounds(10,45,100,20);
         getContentPane().add(lbljenis);       
         lbljenis.setBounds(10,65,100,20);       
         getContentPane().add(bebek);       
         bebek.setBounds(100,65,75,20);       
         getContentPane().add(sport);       
         sport.setBounds(175,65,75,20);       
         getContentPane().add(matik);       
         matik.setBounds(250,65,75,20);       
         grupjenis.add(bebek);       
         grupjenis.add(sport);       
         grupjenis.add(matik);       
         getContentPane().add(lblmerk);       
         lblmerk.setBounds(10,95,100,20);       
         getContentPane().add(honda);       
         honda.setBounds(100,95,100,20);
         getContentPane().add(yamaha);       
         yamaha.setBounds(200,95,100,20);
         getContentPane().add(suzuki);       
         suzuki.setBounds(100,125,100,20);
         getContentPane().add(kawasaki);       
         kawasaki.setBounds(200,125,100,20);
         getContentPane().add(lblharga);       
         lblharga.setBounds(10,155,70,20);
         txharga.setText("0");
         getContentPane().add(txharga);       
         txharga.setBounds(100,155,100,20);
         getContentPane().add(lblpembayaran);       
         lblpembayaran.setBounds(10,185,100,20);       
         getContentPane().add(tunai);       
         tunai.setBounds(100,185,75,20);       
         getContentPane().add(kredit);       
         kredit.setBounds(175,185,75,20);       
         grupjenis.add(tunai);       
         grupjenis.add(kredit);
         getContentPane().add(tblhitung);       
         tblhitung.setBounds(270,185,95,20);
         getContentPane().add(lblhargamotor);       
         lblhargamotor.setBounds(10,225,125,20);
         getContentPane().add(lbldiskon);       
         lbldiskon.setBounds(10,250,70,20);
         txdiskon.setText("0");
         getContentPane().add(txdiskon);       
         txdiskon.setBounds(100,250,100,20);
         getContentPane().add(lbltotalbayar);       
         lbltotalbayar.setBounds(10,280,100,20);
         txtotalbayar.setText("0");
         getContentPane().add(txtotalbayar);       
         txtotalbayar.setBounds(100,280,100,20);
         getContentPane().add(tblupdate);       
         tblupdate.setBounds(225,250,95,20);
         getContentPane().add(tblexit);       
         tblexit.setBounds(225,280,95,20);
         getContentPane().add(hasil);
         hasil.setBounds(10,315,250,150);
         getContentPane().add(cetak);       
         cetak.setBounds(270,315,95,20);
         
         setVisible(true);    
     }
    void AksiReaksi()    {       
     cetak.addActionListener(new ActionListener()       
     {         
        public void actionPerformed(ActionEvent e)          
        {             
            hasil.append(txnama.getText()+"\n");             
            if(bebek.isSelected()==true)  {                
                hasil.append(bebek.getText()+"\n");
            }                        
            if(sport.isSelected()==true)  {                
                hasil.append(sport.getText()+"\n");
            }
            if(honda.isSelected()==true)  {                
                hasil.append(honda.getText()+"\n");
            }
            if(yamaha.isSelected()==true)  {                
                hasil.append(yamaha.getText()+"\n");
            }
            if(suzuki.isSelected()==true)  {                
                hasil.append(suzuki.getText()+"\n");
            }
            if(kawasaki.isSelected()==true)  {                
                hasil.append(kawasaki.getText()+"\n");
            }

            hasil.append(txharga.getText()+"\n");
            if(tunai.isSelected()==true)  {                
                hasil.append(tunai.getText()+"\n");
            }                        
            if(kredit.isSelected()==true)  {                
                hasil.append(kredit.getText()+"\n");
            }
            hasil.append(txdiskon.getText()+"\n");
            hasil.append(txtotalbayar.getText()+"\n");
            }       
     });    
 } 
     
    public static void main(String args[])    
     { 
        TugasKreasi2 ap=new TugasKreasi2();      
        ap.komponenVisual();
        ap.AksiReaksi();
     }
} 
