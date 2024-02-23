class StudentAction {
    study();
    absent();
    doExam();
}

class GoodStudent implements StudentAction {
    constructor(id, name, age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.level = "Giỏi"
    }
    study() {
        return "Giỏi";
    }
    absent() {
        return "Not absent"
    }
    doExam() {
        return "Passul"
    }


}
