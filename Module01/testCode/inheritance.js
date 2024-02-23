class Student {
  constructor(id, name, age) {
    this.id = id;
    this.name = name;
    this.age = age;
    }
    get getName() {
        return this.name;
    }
    /**
     * @param {any} name
     */
    set setName(name) {
        this.name = name;
    }
}

class GoodStudent extends Student {
    constructor(id, name, age, level) {
        super(id, name, age);
        this.level = level;
    }
    get getName() {
        return this.name;
    }
    /**
     * @param {any} name
     */
    set setName(name) {
        this.name = name;
    }
    get getLevel() {
        return this.level;
    }
    /**
     * @param {any} level
     */
    set setLevel(level) {
        this.level = level;
    }
}
let ty = new Student(1, "Tý", 18);
let teo = new GoodStudent(2, "Tèo", 18, "Giỏi");
console.log(ty);
console.log(teo);
