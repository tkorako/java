import java.util.List;

public class City {
    private List<InnerClass> toponims;

    static class InnerClass {
        private String name;
        private int type;

        InnerClass(String name, int type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            switch (type) {
                case 1:
                    return "Avenue " + name;
                case 2:
                    return "Area  " + name;
                default:
                    return "Street " + name;
            }
        }
    }

    public City(List<InnerClass> toponims) {
        this.toponims = toponims;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(InnerClass toponim : toponims){
            builder.append(toponim);
            builder.append('\n');
        }
        return builder.toString();
    }

}
