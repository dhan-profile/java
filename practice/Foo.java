interface Addition {
    void comp();
}

class Foo {
    Addition h2 = new Addition() {
        public void comp() {
            System.out.println("Comparison");
        }
    };

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.h2.comp();
    }
}

