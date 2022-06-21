public class Person {

        privateStringname;
        privateString suname;

    public Person (String name, String suname) {
            this.name=name;
            this.suname=suname;

        }

        public String getName() {
            return name;
        }

        public void setName( Stringname) {
                this.name = name;
    }

        public String getSuname() {
            return suname;
        }

        public void setSuname(String suname) {
            this.suname = suname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", suname='" + suname + '\'' +
                    '}';
        }
    }
