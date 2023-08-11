package sg.edu.rp.c346.id21023644.arraylist;

public class AndroidVersion {
    String name;
    double version;

    public AndroidVersion(String name, double version){
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AndroidVersion{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
