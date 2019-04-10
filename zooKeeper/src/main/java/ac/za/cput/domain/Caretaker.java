package ac.za.cput.domain;

import java.util.Set;

public class Caretaker {

    private String keeperId, keeperFirstName, keeperLastName;
    private int age;
    private Set<Zoo> gameReserve;

    public Caretaker() {
    }

    public Caretaker(Builder builder) {
        this.keeperId = builder.keeperId;
        this.age = builder.age;
        this.keeperFirstName = builder.keeperFirstName;
        this.keeperLastName = builder.keeperLastName;
    }

    public String getKeeperId() {
        return keeperId;
    }

    public String getKeeperFirstName() {
        return keeperFirstName;
    }

    public String getKeeperLastName() {
        return keeperLastName;
    }

    public int getAge() {
        return age;
    }

    public Set<Zoo> getGameReserve() {
        return gameReserve;
    }

    public static class Builder {

        private String keeperId, keeperFirstName, keeperLastName;
        private int age;
        private Set<Zoo> gameReserve;

        public Builder keeperId( String keeperId) {
            this.keeperId = keeperId;
            return this;
        }

        public Builder keeperFirstName( String keeperFirstName) {
            this.keeperFirstName = keeperFirstName;
            return this;
        }

        public Builder keeperLastName( String keeperLastName) {
            this.keeperLastName = keeperLastName;
            return this;
        }

        public Builder age( int age) {
            this.age = age;
            return this;
        }

        public Caretaker build() {
            return new Caretaker(this);
        }

    }


}
