
package sem2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class insert {
   Connection cnn;
    public insert()
    {
        cnn = connection.getconnect();
    }
    public void themnguoidung(String check,String a, String b, String c, String d,String e, String f,String g, String h,String i, String o, String p, String l)
    {

        if(check.equalsIgnoreCase("giaovien"))
        {
            try{
            PreparedStatement pst = cnn.prepareStatement("Insert nguoidung values (?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, a); //id
            pst.setString(2, b); //id coso
            pst.setString(3, c); //ten
            pst.setString(4, d); //ngaysinh
            pst.setString(5, e); //gioitinh
            pst.setString(6, f); //hocvan
            pst.setString(7, g); // chucvu
            pst.setString(8, h); //diachi
            pst.setString(9, i); //sdt
            pst.setString(10, o); //email
            pst.setString(11, p); //tendangnhap
            pst.setString(12, l); //matkhau
            int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Thêm Thành Công", "Thêm  giáo viên", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Thêm Thất Bại", "Thêm  giáo viên", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "ID Tồn Tại", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(check.equalsIgnoreCase("sinhvien"))
        {
            try{
            PreparedStatement pst = cnn.prepareStatement("Insert nguoidung values (?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, a); //id
            pst.setString(2, b); //id coso
            pst.setString(3, c); //ten
            pst.setString(4, d); //ngaysinh
            pst.setString(5, e); //gioitinh
            pst.setString(6, f); //hocvan
            pst.setString(7, g); // chucvu
            pst.setString(8, h); //diachi
            pst.setString(9, i); //sdt
            pst.setString(10, o); //email
            pst.setString(11, p); //tendangnhap
            pst.setString(12, l); //matkhau default password
            int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Thêm Thành Công", "Thêm Sinh vien", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Thêm Thất Bại", "Thêm Sinh vien", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "ID Tồn Tại", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // them mon
    public void themcoso(String a, String b)
    {
        try {
            PreparedStatement pst = cnn.prepareStatement("insert coso values(?,?)");
            pst.setString(1,a);
            pst.setString(2,b);
            int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Thêm Thành Công", "Thêm  CO So", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Thêm Thất Bại", "Thêm  Co so", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "ID Tồn Tại", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
    }
    public void themlop (String a, String b, String c, String d)
    {
        try {
                PreparedStatement pst = cnn.prepareStatement("insert lop values(?,?,?,?)");
                pst.setString(1,a); //id lop
                pst.setString(2,b); // idcoso
                pst.setString(3,c); //ten lop
                pst.setString(4,d); // nien khoa

        int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Thêm Thành Công", "Thêm Lop", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Thêm Thất Bại", "Thêm Lop", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "ID Tồn Tại", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    public void themmonhoc(String a, String b, String c, String d)
    {
                try {
                PreparedStatement pst = cnn.prepareStatement("insert monhoc values(?,?,?,?)");
                pst.setString(1,a); //id monhoc
                pst.setString(2,b); // ten mon hoc
                pst.setString(3,c); //thuc hanh yes or no
                pst.setString(4,d); // ly thuyet yes or no

        int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Thêm Thành Công", "Thêm Mon Hoc", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Thêm Thất Bại", "Thêm Mon Hoc", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "ID Tồn Tại", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
    }
    public void themdiem(String a, String b, String c, String d, String e, String f, String g,String h, String k)
    {
      try {
                PreparedStatement pst = cnn.prepareStatement("insert diem values(?,?,?,?,?,?,?,?,?)");
                pst.setString(1,a); //id diem
                pst.setString(2,b); // id mon hoc
                pst.setString(3,c); // id lop
                pst.setString(4,d); // hoc ky
                pst.setString(5,e); //diem thuc hanh 1
                pst.setString(6,f); //diem thuc hanh 2
                pst.setString(7,g); //diem ly thuyet 1
                pst.setString(8,h); // diem ly thuyet 2
                pst.setString(9, k);// status

        int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Thêm Thành Công", "Thêm Diem", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Thêm Thất Bại", "Thêm Diem", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "ID Tồn Tại", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }






