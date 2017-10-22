
package sem2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author VoDepTrai
 */
public class update {
    Connection cnn;
    public update()
    {
        cnn = connection.getconnect();
    }
    public void suanguoidung(String id, String a, String b, String c,String d,String e, String f,String g, String h,String k)
    {

        
            try{
            PreparedStatement pst = cnn.prepareStatement("update nguoidung set ten = ?,ngaysinh = ?,gioitinh = ?, hocvan = ?, chucvu=?,diachi=?,sdt=?,email = ?,matkhau = ? where id = ?");
            pst.setString(1, a); //ten
            pst.setString(2, b); //ngay sinh
            pst.setString(3, c); //gioi tinh
            pst.setString(4, d); //hoc van
            pst.setString(5, e); //chuc vu
            pst.setString(6, f); //dia chi
            pst.setString(7, g); // sdt
            pst.setString(8, h); //email
            pst.setString(9, k); //mat khau
            pst.setString(10, id); //id
            int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Sửa Thành Công", "Sửa Thong Tin", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Sửa Thất Bại", "Sửa Thong Tin", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
    }
    
    // them mon
    public void suacoso(String id, String a)
    {
        try {
            PreparedStatement pst = cnn.prepareStatement("update coso set tencoso=? where id =?");
            pst.setString(1,a);
            pst.setString(2,id);
            int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Sửa Thành Công", "Sửa thong tin", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Sửa Thất Bại", "Sửa thong tin", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
    }
    public void sualop (String id,String a, String b, String c)
    {
        try {
                PreparedStatement pst = cnn.prepareStatement("update lop set idcoso = ?, tenlop=?, nienkhoa=? where id=? ");
                pst.setString(1,a); //id coso
                pst.setString(2,b); // tenlop
                pst.setString(3,c); //nien khoa
                pst.setString(4,id);

        int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Sửa Thành Công", "Sửa thong tin", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Sửa Thất Bại", "Sửa thong tin", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    public void suamonhoc(String id,String a, String b, String c)
    {
                try {
                PreparedStatement pst = cnn.prepareStatement("update monhoc set tenmonhoc=?,thuchanh=?,lythuyet=? where id=?");
                pst.setString(1,a); //tenmonhoc
                pst.setString(2,b); // thuc hanh
                pst.setString(3,c); //ly thuyet
                pst.setString(4,id);

        int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Sửa Thành Công", "Sửa thong tin", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Sửa Thất Bại", "Sửa thong tin", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
    }
    public void suadiem(String id,String a, String b, String c, String d, String e, String f, String g,String h)
    {
      try {
                PreparedStatement pst = cnn.prepareStatement("update diem set idmonhoc=?, idlop=?,hocky=?,dthuchanh1=?,dthuchanh2=?,dlythuyet1=?,dlythuyet2=?,trangthai=? where id=?");
                pst.setString(1,a); //id mon hoc
                pst.setString(2,b); // id lop
                pst.setString(3,c); // hoc ky
                pst.setString(4,d); // diem thuc hanh 1
                pst.setString(5,e); //diem thuc thuc hanh 2
                pst.setString(6,f); //diem ly thuyet 1
                pst.setString(7,g); //diem ly thuyet 2
                pst.setString(8,h); // status
                pst.setString(9,id);

        int n = pst.executeUpdate();
            if(n!=0){
                JOptionPane.showMessageDialog(null, "Sửa Thành Công", "Sửa diem", JOptionPane.INFORMATION_MESSAGE);
                // them option enable edit or clear o day
                
            }else{
                JOptionPane.showMessageDialog(null, "Sửa Thất Bại", "Sửa  diem", JOptionPane.ERROR_MESSAGE);
            }
            }
            
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
}
