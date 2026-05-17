package az.developia.spring_project_14aprel.entity;

public class RAM {
    private Integer size;
    private String type; 

    public RAM(Integer size, String type) {
        this.size = size;
        this.type = type;
    }

    public Integer getSize() { return size; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "RAM [Ölçü=" + size + "GB, Tip=" + type + "]";
    }
}