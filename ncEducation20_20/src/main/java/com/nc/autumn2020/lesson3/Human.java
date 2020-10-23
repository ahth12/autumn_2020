package com.nc.autumn2020.lesson3;

public class Human {
    //обязательные
    private long id;
    private String lastName;
    private String fistName;
    //не обязательные
    private short age;
    private String gender;
    private String job;

    private Human(Builder builder) {
        this.fistName = builder.fistName;
        this.age = builder.age;
        this.id = builder.id;
        this.gender = builder.gender;
        this.lastName = builder.lastName;
        this.job = builder.job;
    }


    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public static class Builder {
        //обязательные
        private long id;
        private String lastName;
        private String fistName;
        //не обязательные
        private short age = 0;
        private String gender = "unknown";
        private String job = "now job";

        /**
         *
         * @param id id not less 1000
         * @param lastName some info
         * @param fistName
         */
        public Builder(long id, String lastName, String fistName) {
            this.id = id;
            this.lastName = lastName;
            this.fistName = fistName;
        }

        public Builder age(short age){
            this.age = age;
            return this;
        }
        public Builder job(String job){
            this.job = job;
            return this;
        }
        public Human build(){
            return new Human(this);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", fistName='" + fistName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
