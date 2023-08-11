package sg.edu.rp.c346.id21023644.demoandroidlist;

public class AndroidVersion {
    String name;
    String version;

    public AndroidVersion(String name, String version){
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

//    @Override
//    public String toString() {
//        return "AndroidVersion{" +
//                "name='" + name + '\'' +
//                ", version='" + version + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return name + ": " + version;
    }
}
