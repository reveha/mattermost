import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MerhabaBean {

    private String mesaj;
    private boolean gosterildi;

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public boolean isGosterildi() {
        return gosterildi;
    }

    public void mesajGoster() {
        gosterildi = true;
    }
}
