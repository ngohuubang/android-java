package cntt61_60135101.com;

public class DiaDiem {
    private String name;
    private String hinh;

    public DiaDiem(String name, String hinh){
        this.name = name;
        this.hinh = hinh;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getHinh(){
        return hinh;
    }

    public String toString(){
        return "Địa điểm này là: " + this.name;
    }
}
