package tugasmodul;

/**
 * Nama : Muhammad Ikhtiar Ananda
 * NPM  : 16.63.0610 |5C Reg pagi Bjb
 */
import javax.swing.*; 
 
class TugasKreasi extends JFrame 
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
    String[] jenismerk={"HONDA","YAMAHA","SUZUKI","KAWASAKI"};    
    JComboBox cbmerk=new JComboBox(jenismerk);
    JLabel lblharga=new JLabel("Harga");
    JTextField txharga=new JTextField(20);
    JLabel lblpembayaran=new JLabel("PEMBAYARAN");    
    String[] jenispembayaran={"TUNAI","KREDIT"};    
    JComboBox cbpembayaran=new JComboBox(jenispembayaran);
    JButton tblhitung=new JButton("Hitung");
    JLabel lblhargamotor=new JLabel("HARGA MOTOR"); 
    JLabel lbldiskon=new JLabel("DISKON ");
    JTextField txdiskon=new JTextField(20);
    JButton tblupdate=new JButton("Update");    
    JLabel lbltotalbayar=new JLabel("TOTAL BAYAR ");
    JTextField txtotalbayar=new JTextField(20);
    JButton tblexit=new JButton("EXIT");
    
    TugasKreasi()    
    {       
        setTitle("APLIKASI PENJUALAN MOTOR");       
        setLocation(300,100);       
        setSize(400,400);       
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
         getContentPane().add(cbmerk);       
         cbmerk.setBounds(100,95,100,20);        
         getContentPane().add(lblharga);       
         lblharga.setBounds(10,125,70,20);
         txharga.setText("0");
         getContentPane().add(txharga);       
         txharga.setBounds(100,125,100,20);
         getContentPane().add(lblpembayaran);       
         lblpembayaran.setBounds(10,175,100,20);       
         getContentPane().add(cbpembayaran);       
         cbpembayaran.setBounds(100,175,100,20);
         getContentPane().add(tblhitung);       
         tblhitung.setBounds(225,175,95,20);
         getContentPane().add(lblhargamotor);       
         lblhargamotor.setBounds(10,205,125,20);
         getContentPane().add(lbldiskon);       
         lbldiskon.setBounds(10,225,70,20);
         txdiskon.setText("0");
         getContentPane().add(txdiskon);       
         txdiskon.setBounds(100,225,100,20);
         getContentPane().add(lbltotalbayar);       
         lbltotalbayar.setBounds(10,255,100,20);
         txtotalbayar.setText("0");
         getContentPane().add(txtotalbayar);       
         txtotalbayar.setBounds(100,255,100,20);
         getContentPane().add(tblupdate);       
         tblupdate.setBounds(50,300,95,20);
         getContentPane().add(tblexit);       
         tblexit.setBounds(180,300,95,20);
         
         setVisible(true);    
     } 
     
    public static void main(String args[])    
     { 
        TugasKreasi ap=new TugasKreasi();      
        ap.komponenVisual();    
     }
} 
