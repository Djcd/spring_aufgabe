package test.springboot.demo.dto;

public class DoctorData {
    private Long id;
    private String Name;

    public DoctorData(Long id, String name) {
        this.id = id;
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
