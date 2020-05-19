package dongwu2;

    public class Animala {
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // 动物类有叫和吃两个方法
        public void yell() {
            System.out.println("我的叫声");
        }

        public void eat() {
            System.out.println("我的食物");
        }
    }

