package az.developia.spring_project_14aprel.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype") // 7-ci bənd: Obyekti prototype scope edirik
public class Home {
    private Integer id;
    private String address;
    private String color;

    // 5-ci bənd: Default Constructor
    public Home() {
        this.id = 55;
        this.address = "Bakı, Nizami küç.";
        this.color = "Ağ";
    }

    // 8-ci bənd: Init və Destroy metodları
    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    // 6-cı bənd: Getter və Setter metodları
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}