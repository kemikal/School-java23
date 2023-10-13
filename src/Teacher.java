public class Teacher extends Person {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void sayHello() {
        System.out.println("Hej jag heter " + getName() + " jag är " + getAge() + " år gammal. Jag är lärare i " + this.subject + ".");

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
