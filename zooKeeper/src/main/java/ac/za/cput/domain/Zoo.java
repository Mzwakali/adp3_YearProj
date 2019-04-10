package ac.za.cput.domain;

public class Zoo {


    private String zooAddress, zooName;

    public Zoo() {
    }

    public Zoo(Builder builder) {
        this.zooAddress = builder.zooAddress;
        this.zooName = builder.zooName;
    }

    public static class Builder{

        private String zooAddress, zooName;

        public Builder zooAddress(String zooAddress){
            this.zooAddress = zooAddress;
            return this;
        }

        public Builder zooName(String zooName){
            this.zooName = zooName;
            return this;
        }

        public Zoo build(){
            return new Zoo(this);
        }

    }

    public String getZooAddress() {
        return zooAddress;
    }

    public String getZooName() {
        return zooName;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooAddress='" + zooAddress + '\'' +
                ", zooName='" + zooName + '\'' +
                '}';
    }
}
