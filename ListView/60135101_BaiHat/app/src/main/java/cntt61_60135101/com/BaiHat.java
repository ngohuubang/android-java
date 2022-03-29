package cntt61_60135101.com;

import android.widget.BaseAdapter;

public class BaiHat {
    private String tenBaiHat;
    private String hinh;
    private String caSi;

    public BaiHat(String tenBaiHat, String hinh, String caSi) {
        this.tenBaiHat = tenBaiHat;
        this.hinh = hinh;
        this.caSi = caSi;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public String getHinh() {
        return hinh;
    }

    public String getCaSi() {
        return caSi;
    }
    public String toString()  {
        return this.tenBaiHat+" (Ca sĩ: "+ this.caSi+")";
    }
}
