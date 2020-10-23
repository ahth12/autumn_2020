
public class Pokemon {
    String name;
    short size;
    long pokebook_id;
    String trainer_name;
    short trainer_age;
    String trainer_hometown;

    public Pokemon(Builder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.pokebook_id = builder.pokebook_id;
        this.trainer_name = builder.trainer_name;
        this.trainer_age = builder.trainer_age;
        this.trainer_hometown = builder.trainer_hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSize() {
        return size;
    }

    public void setSize(short size) {
        this.size = size;
    }

    public long getPokebook_id() {
        return pokebook_id;
    }

    public void setPokebook_id(long pokebook_id) {
        this.pokebook_id = pokebook_id;
    }

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public short getTrainer_age() {
        return trainer_age;
    }

    public void setTrainer_age(short trainer_age) {
        this.trainer_age = trainer_age;
    }

    public String getTrainer_hometown() {
        return trainer_hometown;
    }

    public void setTrainer_hometown(String trainer_hometown) {
        this.trainer_hometown = trainer_hometown;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", pokebook_id=" + pokebook_id +
                ", trainer_name='" + trainer_name + '\'' +
                ", trainer_age=" + trainer_age +
                ", trainer_hometown='" + trainer_hometown + '\'' +
                '}';
    }
    public static class Builder{
        String name;
        short size;
        long pokebook_id;
        String trainer_name;
        short trainer_age;
        String trainer_hometown;

        public Builder(String name, String trainer_name, String trainer_hometown) {
            this.name = name;
            this.trainer_name = trainer_name;
            this.trainer_hometown = trainer_hometown;
        }

        public Builder setSize(short size) {
            this.size = size;
            return this;
        }

        public Builder setPokebook_id(long pokebook_id) {
            this.pokebook_id = pokebook_id;
            return this;
        }

        public Builder setTrainer_age(short trainer_age) {
            this.trainer_age = trainer_age;
            return this;
        }
        public Pokemon build(){
            return new Pokemon(this);
        }
    }
}