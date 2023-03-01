package practice4;

public class Shaurma {
    private String name;
    private String size;
    private Integer basePrise;
    public Shaurma(String name, String size, Integer basePrise)
    {
        this.name = name;
        this.size = size;
        this.basePrise = basePrise;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public Integer getBasePrise() {
        return basePrise;
    }
    public void setBasePrise(Integer basePrise) {
        this.basePrise = basePrise;
    }
}
