package test.springboot.demo.dto;

public class DoctorData {
    private Long id;
    private String Name;

    public DoctorData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
